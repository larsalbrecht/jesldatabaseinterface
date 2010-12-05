/**
 * 
 */
package de.dsol_clan.esl.databaseinterface.model;

/**
 * This class contains the opponent model to create opponents during the parse-process.
 * 
 * @author lalbrecht
 * 
 */
public class OpponentModel {
	private Character challenger = null;
	private Integer contestant = null;
	private String country = null;
	private Boolean defaultwin = null;
	private String name = null;
	private Float points = null;
	private Integer position = null;
	private Integer ranking = null;
	private Integer setter = null;
	private String shortName = null;
	private Boolean wildcard = null;
	private Integer winner = null;

	public OpponentModel() {
	}

	/**
	 * @param winner
	 * @param position
	 * @param contestant
	 * @param name
	 * @param shortName
	 * @param challenger
	 * @param setter
	 * @param ranking
	 * @param points
	 * @param country
	 * @param wildcard
	 * @param defaultwin
	 */
	public OpponentModel(final Integer winner, final Integer position, final Integer contestant,
			final String name, final String shortName, final Character challenger,
			final Integer setter, final Integer ranking, final Float points, final String country,
			final Boolean wildcard, final Boolean defaultwin) {
		super();
		this.winner = winner;
		this.position = position;
		this.contestant = contestant;
		this.name = name;
		this.shortName = shortName;
		this.challenger = challenger;
		this.setter = setter;
		this.ranking = ranking;
		this.points = points;
		this.country = country;
		this.wildcard = wildcard;
		this.defaultwin = defaultwin;
	}

	/**
	 * @return the challenger
	 */
	public final Character getChallenger () {
		return this.challenger;
	}

	/**
	 * @return the contestant
	 */
	public final Integer getContestant () {
		return this.contestant;
	}

	/**
	 * @return the country
	 */
	public final String getCountry () {
		return this.country;
	}

	/**
	 * @return the defaultwin
	 */
	public final Boolean getDefaultwin () {
		return this.defaultwin;
	}

	/**
	 * @return the name
	 */
	public final String getName () {
		return this.name;
	}

	/**
	 * @return the points
	 */
	public final Float getPoints () {
		return this.points;
	}

	/**
	 * @return the position
	 */
	public final Integer getPosition () {
		return this.position;
	}

	/**
	 * @return the ranking
	 */
	public final Integer getRanking () {
		return this.ranking;
	}

	/**
	 * @return the setter
	 */
	public final Integer getSetter () {
		return this.setter;
	}

	/**
	 * @return the shortName
	 */
	public final String getShortName () {
		return this.shortName;
	}

	/**
	 * @return the wildcard
	 */
	public final Boolean getWildcard () {
		return this.wildcard;
	}

	/**
	 * @return the winner
	 */
	public final Integer getWinner () {
		return this.winner;
	}

	/**
	 * @param challenger
	 *            the challenger to set
	 */
	public final void setChallenger (final Character challenger) {
		this.challenger = challenger;
	}

	/**
	 * @param contestant
	 *            the contestant to set
	 */
	public final void setContestant (final Integer contestant) {
		this.contestant = contestant;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public final void setCountry (final String country) {
		this.country = country;
	}

	/**
	 * @param defaultwin
	 *            the defaultwin to set
	 */
	public final void setDefaultwin (final Boolean defaultwin) {
		this.defaultwin = defaultwin;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public final void setName (final String name) {
		this.name = name;
	}

	/**
	 * @param points
	 *            the points to set
	 */
	public final void setPoints (final Float points) {
		this.points = points;
	}

	/**
	 * @param position
	 *            the position to set
	 */
	public final void setPosition (final Integer position) {
		this.position = position;
	}

	/**
	 * @param ranking
	 *            the ranking to set
	 */
	public final void setRanking (final Integer ranking) {
		this.ranking = ranking;
	}

	/**
	 * @param setter
	 *            the setter to set
	 */
	public final void setSetter (final Integer setter) {
		this.setter = setter;
	}

	/**
	 * @param shortName
	 *            the shortName to set
	 */
	public final void setShortName (final String shortName) {
		this.shortName = shortName;
	}

	/**
	 * @param wildcard
	 *            the wildcard to set
	 */
	public final void setWildcard (final Boolean wildcard) {
		this.wildcard = wildcard;
	}

	/**
	 * @param winner
	 *            the winner to set
	 */
	public final void setWinner (final Integer winner) {
		this.winner = winner;
	}

}
