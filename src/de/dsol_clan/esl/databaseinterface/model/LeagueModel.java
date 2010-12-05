/**
 * 
 */
package de.dsol_clan.esl.databaseinterface.model;

import java.net.URL;

/**
 * This class contains the league model to create leagues during the parse-process.
 * 
 * @author lalbrecht
 * 
 */
public class LeagueModel {

	private Integer draw = null;
	private Integer id = null;
	private String leagueCountry = null;
	private String leagueType = null;
	private URL leagueUrl = null;
	private Integer lost = null;
	private String name = null;
	private Integer openMatches = null;
	private Integer peeringRank = null;
	private Integer playedMatches = null;
	private Integer points = null;
	private Float pointsLastMatch = null;
	private Integer pos = null;
	private Integer ranking = null;
	private Integer roundpos = null;
	private Integer slot = null;
	private Integer won = null;

	public LeagueModel() {

	}

	/**
	 * @param draw
	 * @param id
	 * @param leagueCountry
	 * @param leagueType
	 * @param leagueUrl
	 * @param lost
	 * @param name
	 * @param openMatches
	 * @param peeringRank
	 * @param playedMatches
	 * @param points
	 * @param pointsLastMatch
	 * @param ranking
	 * @param pos
	 * @param roundpos
	 * @param slot
	 * @param won
	 */
	public LeagueModel(final Integer draw, final Integer id, final String leagueCountry,
			final String leagueType, final URL leagueUrl, final Integer lost, final String name,
			final Integer openMatches, final Integer peeringRank, final Integer playedMatches,
			final Integer points, final Float pointsLastMatch, final Integer ranking,
			final Integer pos, final Integer roundpos, final Integer slot, final Integer won) {
		super();
		this.draw = draw;
		this.id = id;
		this.leagueCountry = leagueCountry;
		this.leagueType = leagueType;
		this.leagueUrl = leagueUrl;
		this.lost = lost;
		this.name = name;
		this.openMatches = openMatches;
		this.peeringRank = peeringRank;
		this.playedMatches = playedMatches;
		this.points = points;
		this.pointsLastMatch = pointsLastMatch;
		this.ranking = ranking;
		this.pos = pos;
		this.roundpos = roundpos;
		this.slot = slot;
		this.won = won;
	}

	/**
	 * 
	 * @param id
	 * @param name
	 * @param leagueUrl
	 * @param leagueType
	 */
	public LeagueModel(final Integer id, final String name, final URL leagueUrl,
			final String leagueType) {
		super();
		this.id = id;
		this.name = name;
		this.leagueUrl = leagueUrl;
		this.leagueType = leagueType;
	}

	/**
	 * @return the draw
	 */
	public final Integer getDraw () {
		return this.draw;
	}

	/**
	 * @return the id
	 */
	public final Integer getId () {
		return this.id;
	}

	/**
	 * @return the leagueCountry
	 */
	public final String getLeagueCountry () {
		return this.leagueCountry;
	}

	/**
	 * @return the leagueType
	 */
	public final String getLeagueType () {
		return this.leagueType;
	}

	/**
	 * @return the leagueUrl
	 */
	public final URL getLeagueUrl () {
		return this.leagueUrl;
	}

	/**
	 * @return the lost
	 */
	public final Integer getLost () {
		return this.lost;
	}

	/**
	 * @return the name
	 */
	public final String getName () {
		return this.name;
	}

	/**
	 * @return the openMatches
	 */
	public final Integer getOpenMatches () {
		return this.openMatches;
	}

	/**
	 * @return the peeringRank
	 */
	public final Integer getPeeringRank () {
		return this.peeringRank;
	}

	/**
	 * @return the playedMatches
	 */
	public final Integer getPlayedMatches () {
		return this.playedMatches;
	}

	/**
	 * @return the points
	 */
	public final Integer getPoints () {
		return this.points;
	}

	/**
	 * @return the pointsLastMatch
	 */
	public final Float getPointsLastMatch () {
		return this.pointsLastMatch;
	}

	/**
	 * @return the pos
	 */
	public final Integer getPos () {
		return this.pos;
	}

	/**
	 * @return the ranking
	 */
	public final Integer getRanking () {
		return this.ranking;
	}

	/**
	 * @return the roundpos
	 */
	public final Integer getRoundpos () {
		return this.roundpos;
	}

	/**
	 * @return the slot
	 */
	public final Integer getSlot () {
		return this.slot;
	}

	/**
	 * @return the won
	 */
	public final Integer getWon () {
		return this.won;
	}

	/**
	 * @param draw
	 *            the draw to set
	 */
	public final void setDraw (final Integer draw) {
		this.draw = draw;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public final void setId (final Integer id) {
		this.id = id;
	}

	/**
	 * @param leagueCountry
	 *            the leagueCountry to set
	 */
	public final void setLeagueCountry (final String leagueCountry) {
		this.leagueCountry = leagueCountry;
	}

	/**
	 * @param leagueType
	 *            the leagueType to set
	 */
	public final void setLeagueType (final String leagueType) {
		this.leagueType = leagueType;
	}

	/**
	 * @param leagueUrl
	 *            the leagueUrl to set
	 */
	public final void setLeagueUrl (final URL leagueUrl) {
		this.leagueUrl = leagueUrl;
	}

	/**
	 * @param lost
	 *            the lost to set
	 */
	public final void setLost (final Integer lost) {
		this.lost = lost;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public final void setName (final String name) {
		this.name = name;
	}

	/**
	 * @param openMatches
	 *            the openMatches to set
	 */
	public final void setOpenMatches (final Integer openMatches) {
		this.openMatches = openMatches;
	}

	/**
	 * @param peeringRank
	 *            the peeringRank to set
	 */
	public final void setPeeringRank (final Integer peeringRank) {
		this.peeringRank = peeringRank;
	}

	/**
	 * @param playedMatches
	 *            the playedMatches to set
	 */
	public final void setPlayedMatches (final Integer playedMatches) {
		this.playedMatches = playedMatches;
	}

	/**
	 * @param points
	 *            the points to set
	 */
	public final void setPoints (final Integer points) {
		this.points = points;
	}

	/**
	 * @param pointsLastMatch
	 *            the pointsLastMatch to set
	 */
	public final void setPointsLastMatch (final Float pointsLastMatch) {
		this.pointsLastMatch = pointsLastMatch;
	}

	/**
	 * @param pos
	 *            the pos to set
	 */
	public final void setPos (final Integer pos) {
		this.pos = pos;
	}

	/**
	 * @param ranking
	 *            the ranking to set
	 */
	public final void setRanking (final Integer ranking) {
		this.ranking = ranking;
	}

	/**
	 * @param roundpos
	 *            the roundpos to set
	 */
	public final void setRoundpos (final Integer roundpos) {
		this.roundpos = roundpos;
	}

	/**
	 * @param slot
	 *            the slot to set
	 */
	public final void setSlot (final Integer slot) {
		this.slot = slot;
	}

	/**
	 * @param won
	 *            the won to set
	 */
	public final void setWon (final Integer won) {
		this.won = won;
	}

}
