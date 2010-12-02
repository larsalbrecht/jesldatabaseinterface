/**
 * 
 */
package de.dsol_clan.esl.databaseinterface.parser;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import de.dsol_clan.esl.databaseinterface.model.ContestantModel;
import de.dsol_clan.esl.databaseinterface.model.LeagueModel;
import de.dsol_clan.esl.databaseinterface.model.MatchModel;
import de.dsol_clan.esl.databaseinterface.model.OpponentModel;
import de.dsol_clan.esl.databaseinterface.model.SetterModel;

/**
 * @author lalbrecht
 */
public class Parser {
	// TODO Create methods to clean up code.
	public static void main (final String[] args) {
		final Parser p = new Parser(new File(args[0]));
		try {
			p.parseFile();
		} catch (final JDOMException e) {
			e.printStackTrace();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private final SAXBuilder builder = new SAXBuilder();
	private ContestantModel contestant = null;
	private Document doc = null;
	private final HashMap<Integer, LeagueModel> leagues = new HashMap<Integer, LeagueModel>();
	private ArrayList<MatchModel> matches = new ArrayList<MatchModel>();
	private File xmlFile = null;

	public Parser(final File xmlFile) {
		this.xmlFile = xmlFile;
	}

	/**
	 * @return the contestant
	 */
	public final ContestantModel getContestant () {
		return this.contestant;
	}

	/**
	 * @return the leagues
	 */
	public final HashMap<Integer, LeagueModel> getLeagues () {
		return this.leagues;
	}

	/**
	 * @return the matches
	 */
	public final ArrayList<MatchModel> getMatches () {
		return this.matches;
	}

	/**
	 * Returns the opponent as OpponentModel.
	 * 
	 * @param matchNode
	 * @return OpponentModel
	 */
	private OpponentModel getOpponent (final Element matchNode) {
		Element opponentNode = null;
		OpponentModel tempOpponent = null;
		if ((opponentNode = matchNode.getChild("opponent")) != null) {
			tempOpponent = (new OpponentModel(Integer.parseInt(opponentNode
					.getAttributeValue("winner")), Integer.parseInt(opponentNode
					.getAttributeValue("position")), Integer.parseInt(opponentNode
					.getAttributeValue("contestant")), opponentNode.getAttributeValue("name"),
					opponentNode.getAttributeValue("shortName"), opponentNode.getAttributeValue(
							"challenger").charAt(0), Integer.parseInt(opponentNode
							.getAttributeValue("setter")), Integer.parseInt(opponentNode
							.getAttributeValue("ranking")), Float.parseFloat(opponentNode
							.getAttributeValue("points")), opponentNode
							.getAttributeValue("country"), Boolean.parseBoolean(opponentNode
							.getAttributeValue("wildcard")), Boolean.parseBoolean(opponentNode
							.getAttributeValue("defaultwin"))));

		}
		return tempOpponent;
	}

	/**
	 * Returns the params as HashMap.
	 * 
	 * @param setterNode
	 * @return HashMap<String, String>
	 */
	@SuppressWarnings ("unchecked")
	private HashMap<String, String> getParams (final Element setterNode) {
		final HashMap<String, String> paramMap = new HashMap<String, String>();
		if (setterNode.getChildren("parameter").size() > 0) {
			final List<Element> parameterNodes = setterNode.getChildren("parameter");
			for (final Element parameterNode : parameterNodes) {
				paramMap.put(parameterNode.getAttributeValue("name"), parameterNode
						.getAttributeValue("selected"));
			}
		}
		return paramMap;
	}

	/**
	 * Returns the setter as ArraList.
	 * 
	 * @param matchNode
	 * @return ArrayList<SetterModel>
	 */
	@SuppressWarnings ("unchecked")
	private ArrayList<SetterModel> getSetter (final Element matchNode) {
		final List<Element> setterNodes = matchNode.getChildren("setter");
		final ArrayList<SetterModel> setterList = new ArrayList<SetterModel>();
		for (final Element setterNode : setterNodes) {
			final SetterModel tempSetter = new SetterModel(Integer.parseInt(setterNode
					.getAttributeValue("setter")), Integer.parseInt(setterNode
					.getAttributeValue("slot")), setterNode.getAttributeValue("contestant"));

			/**
			 * Read parameters for setter
			 */
			tempSetter.setParamMap(this.getParams(setterNode));
		}
		return setterList;
	}

	/**
	 * @return the xmlFile
	 */
	public final File getXmlFile () {
		return this.xmlFile;
	}

	private final Long parseDateString (final String dateStr) {
		Long tempTime = null;
		try {
			tempTime = new SimpleDateFormat("E, dd.MM.yy HH:mm").parse(dateStr).getTime();
		} catch (final ParseException e) {
			return null;
		}
		return tempTime;
	}

	/**
	 * Read/Parse the XML-file.
	 * 
	 * @throws JDOMException
	 * @throws IOException
	 */
	@SuppressWarnings ("unchecked")
	public void parseFile () throws JDOMException, IOException {
		if ((this.xmlFile != null) && this.xmlFile.exists()) {
			this.doc = this.builder.build(this.xmlFile);
			final Element root = this.doc.getRootElement();
			if (root != null) {
				final List<Element> mainNodes = root.getChildren();
				if (mainNodes.size() > 0) {
					for (final Element mainNode : mainNodes) {
						final String nodeName = mainNode.getName();
						if (nodeName.equals("contestant")) {
							/**
							 * Create contestant.
							 */
							this.contestant = new ContestantModel(mainNode
									.getAttributeValue("country"), Integer.parseInt(mainNode
									.getAttributeValue("id")), mainNode.getAttributeValue("name"),
									mainNode.getAttributeValue("short"));
						} else if (nodeName.equals("leagues")) {
							if (mainNode.getChildren().size() > 0) {
								/**
								 * Add new leagues to HashMap from XML (<leagues>).
								 */
								final List<Element> leagueNodes = mainNode.getChildren();
								for (final Element leagueNode : leagueNodes) {
									this.leagues.put(Integer.parseInt(leagueNode
											.getAttributeValue("id")), new LeagueModel(Integer
											.parseInt(leagueNode.getAttributeValue("draw")),
											Integer.parseInt(leagueNode.getAttributeValue("id")),
											leagueNode.getAttributeValue("leaguecountry"),
											leagueNode.getAttributeValue("type"), new URL(
													leagueNode.getAttributeValue("fullurl")),
											Integer.parseInt(leagueNode.getAttributeValue("lost")),
											leagueNode.getAttributeValue("leaguename"), Integer
													.parseInt(leagueNode
															.getAttributeValue("openmatches")),
											Integer.parseInt(leagueNode
													.getAttributeValue("peering_rank")), Integer
													.parseInt(leagueNode
															.getAttributeValue("playedmatches")),
											Integer
													.parseInt(leagueNode
															.getAttributeValue("points")),
											Float.parseFloat(leagueNode
													.getAttributeValue("points_lastmatch")),
											Integer.parseInt(leagueNode
													.getAttributeValue("ranking")), Integer
													.parseInt(leagueNode.getAttributeValue("pos")),
											Integer.parseInt(leagueNode
													.getAttributeValue("roundpos")),
											Integer.parseInt(leagueNode.getAttributeValue("slot")),
											Integer.parseInt(leagueNode.getAttributeValue("won"))));
								}
							}

							/**
							 * Add new leagues to HashMap from XML (<matches>).
							 */
							final Element matchesNode = root.getChild("matches");
							if (matchesNode.getContentSize() > 0) {
								final List<Element> matchesNodes = matchesNode.getChildren();
								Integer leagueId = null;
								for (final Element matchNode : matchesNodes) {
									if (((leagueId = Integer.parseInt(matchNode
											.getAttributeValue("leagueid"))) != null)
											&& !this.leagues.containsKey(leagueId)) {
										this.leagues.put(leagueId, new LeagueModel(leagueId,
												matchNode.getAttributeValue("leaguename"), new URL(
														matchNode.getAttributeValue("leagueurl")),
												matchNode.getAttributeValue("leaguetype")));
									}
								}
							}
						} else if (nodeName.equals("matches")) {
							/**
							 * Add matches if exists.
							 */
							final List<Element> matchesNode = mainNode.getChildren();
							for (final Element matchNode : matchesNode) {
								final MatchModel tempMatch = new MatchModel(
										this.parseDateString(matchNode
												.getAttributeValue("calcdate")),
										matchNode.getAttributeValue("country"),
										this
												.parseDateString(matchNode
														.getAttributeValue("created")),
										Long.parseLong(matchNode.getAttributeValue("datestamp")),
										this.parseDateString(matchNode.getAttributeValue("date")),
										Boolean.parseBoolean(matchNode
												.getAttributeValue("defaultwin")),
										Boolean.parseBoolean((matchNode
												.getAttributeValue("drawpossible") == "" ? "false"
												: matchNode.getAttributeValue("drawpossible"))),
										Integer
												.parseInt(matchNode
														.getAttributeValue("firstparent")),
										matchNode.getAttributeValue("game"),
										Integer.parseInt(matchNode.getAttributeValue("id")),
										Integer.parseInt(matchNode.getAttributeValue("leagueid")),
										matchNode.getAttributeValue("leaguename"),
										matchNode.getAttributeValue("leaguetype"),
										new URL(matchNode.getAttributeValue("leagueurl")),
										Boolean.parseBoolean(matchNode.getAttributeValue("onhold")),
										matchNode.getAttributeValue("result"), matchNode
												.getAttributeValue("status"), new URL(matchNode
												.getAttributeValue("url")), Boolean
												.parseBoolean(matchNode
														.getAttributeValue("wildcard")));

								/**
								 * add opponent if exists.
								 */

								tempMatch.setOpponent(this.getOpponent(matchNode));
								/**
								 * Read setter.
								 */
								tempMatch.setSetterList(this.getSetter(matchNode));

								/**
								 * Add match to list.
								 */
								this.matches.add(tempMatch);
							}
						}
					}
				}
			}
		}
		// NOTE debug print
		this.printLeagueNames();
	}

	/**
	 * Debug method. Print all leaguenames with id.
	 */
	public void printLeagueNames () {
		if ((this.leagues != null) && (this.leagues.size() > 0)) {
			for (final Entry<Integer, LeagueModel> league : this.leagues.entrySet()) {
				System.out.println(league.getValue().getId() + " - " + league.getValue().getName());
			}
		}
	}

	/**
	 * @param contestant
	 *            the contestant to set
	 */
	public final void setContestant (final ContestantModel contestant) {
		this.contestant = contestant;
	}

	/**
	 * @param matches
	 *            the matches to set
	 */
	public final void setMatches (final ArrayList<MatchModel> matches) {
		this.matches = matches;
	}

	/**
	 * @param xmlFile
	 *            the xmlFile to set
	 */
	public final void setXmlFile (final File xmlFile) {
		this.xmlFile = xmlFile;
	}

}
