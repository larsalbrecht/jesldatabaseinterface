/**
 * 
 */
package de.dsol_clan.esl.databaseinterface.model;

import java.net.URL;

/**
 * @author lalbrecht
 * 
 */
public class MatchModel {
	private Long calcdateTS = null;
	private String country = null;
	private Long createdTS = null;
	private Long datestamp = null;
	private Long dateTS = null;
	private Boolean defaultWin = null;
	private Boolean drawPossible = null;
	private Integer firstParent = null;
	private String game = null;
	private Integer id = null;
	private Integer leagueId = null;
	private String leagueName = null;
	private String leagueType = null;
	private URL leagueUrl = null;
	private Boolean onHold = null;
	private String result = null;
	private String status = null;
	private URL url = null;
	private Boolean wildcard = null;

	public MatchModel() {

	}

	/**
	 * @param calcdateTS
	 * @param country
	 * @param createdTS
	 * @param datestamp
	 * @param dateTS
	 * @param defaultWin
	 * @param drawPossible
	 * @param firstParent
	 * @param game
	 * @param id
	 * @param leagueId
	 * @param leagueName
	 * @param leagueType
	 * @param leagueUrl
	 * @param onHold
	 * @param result
	 * @param status
	 * @param url
	 * @param wildcard
	 */
	public MatchModel(final Long calcdateTS, final String country, final Long createdTS,
			final Long datestamp, final Long dateTS, final Boolean defaultWin,
			final Boolean drawPossible, final Integer firstParent, final String game,
			final Integer id, final Integer leagueId, final String leagueName,
			final String leagueType, final URL leagueUrl, final Boolean onHold,
			final String result, final String status, final URL url, final Boolean wildcard) {
		super();
		this.calcdateTS = calcdateTS;
		this.country = country;
		this.createdTS = createdTS;
		this.datestamp = datestamp;
		this.dateTS = dateTS;
		this.defaultWin = defaultWin;
		this.drawPossible = drawPossible;
		this.firstParent = firstParent;
		this.game = game;
		this.id = id;
		this.leagueId = leagueId;
		this.leagueName = leagueName;
		this.leagueType = leagueType;
		this.leagueUrl = leagueUrl;
		this.onHold = onHold;
		this.result = result;
		this.status = status;
		this.url = url;
		this.wildcard = wildcard;
	}

	/**
	 * @return the calcdateTS
	 */
	public final Long getCalcdateTS () {
		return this.calcdateTS;
	}

	/**
	 * @return the country
	 */
	public final String getCountry () {
		return this.country;
	}

	/**
	 * @return the createdTS
	 */
	public final Long getCreatedTS () {
		return this.createdTS;
	}

	/**
	 * @return the datestamp
	 */
	public final Long getDatestamp () {
		return this.datestamp;
	}

	/**
	 * @return the dateTS
	 */
	public final Long getDateTS () {
		return this.dateTS;
	}

	/**
	 * @return the defaultWin
	 */
	public final Boolean getDefaultWin () {
		return this.defaultWin;
	}

	/**
	 * @return the drawPossible
	 */
	public final Boolean getDrawPossible () {
		return this.drawPossible;
	}

	/**
	 * @return the firstParent
	 */
	public final Integer getFirstParent () {
		return this.firstParent;
	}

	/**
	 * @return the game
	 */
	public final String getGame () {
		return this.game;
	}

	/**
	 * @return the id
	 */
	public final Integer getId () {
		return this.id;
	}

	/**
	 * @return the leagueId
	 */
	public final Integer getLeagueId () {
		return this.leagueId;
	}

	/**
	 * @return the leagueName
	 */
	public final String getLeagueName () {
		return this.leagueName;
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
	 * @return the onHold
	 */
	public final Boolean getOnHold () {
		return this.onHold;
	}

	/**
	 * @return the result
	 */
	public final String getResult () {
		return this.result;
	}

	/**
	 * @return the status
	 */
	public final String getStatus () {
		return this.status;
	}

	/**
	 * @return the url
	 */
	public final URL getUrl () {
		return this.url;
	}

	/**
	 * @return the wildcard
	 */
	public final Boolean getWildcard () {
		return this.wildcard;
	}

	/**
	 * @param calcdateTS
	 *            the calcdateTS to set
	 */
	public final void setCalcdateTS (final Long calcdateTS) {
		this.calcdateTS = calcdateTS;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public final void setCountry (final String country) {
		this.country = country;
	}

	/**
	 * @param createdTS
	 *            the createdTS to set
	 */
	public final void setCreatedTS (final Long createdTS) {
		this.createdTS = createdTS;
	}

	/**
	 * @param datestamp
	 *            the datestamp to set
	 */
	public final void setDatestamp (final Long datestamp) {
		this.datestamp = datestamp;
	}

	/**
	 * @param dateTS
	 *            the dateTS to set
	 */
	public final void setDateTS (final Long dateTS) {
		this.dateTS = dateTS;
	}

	/**
	 * @param defaultWin
	 *            the defaultWin to set
	 */
	public final void setDefaultWin (final Boolean defaultWin) {
		this.defaultWin = defaultWin;
	}

	/**
	 * @param drawPossible
	 *            the drawPossible to set
	 */
	public final void setDrawPossible (final Boolean drawPossible) {
		this.drawPossible = drawPossible;
	}

	/**
	 * @param firstParent
	 *            the firstParent to set
	 */
	public final void setFirstParent (final Integer firstParent) {
		this.firstParent = firstParent;
	}

	/**
	 * @param game
	 *            the game to set
	 */
	public final void setGame (final String game) {
		this.game = game;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public final void setId (final Integer id) {
		this.id = id;
	}

	/**
	 * @param leagueId
	 *            the leagueId to set
	 */
	public final void setLeagueId (final Integer leagueId) {
		this.leagueId = leagueId;
	}

	/**
	 * @param leagueName
	 *            the leagueName to set
	 */
	public final void setLeagueName (final String leagueName) {
		this.leagueName = leagueName;
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
	 * @param onHold
	 *            the onHold to set
	 */
	public final void setOnHold (final Boolean onHold) {
		this.onHold = onHold;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public final void setResult (final String result) {
		this.result = result;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public final void setStatus (final String status) {
		this.status = status;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public final void setUrl (final URL url) {
		this.url = url;
	}

	/**
	 * @param wildcard
	 *            the wildcard to set
	 */
	public final void setWildcard (final Boolean wildcard) {
		this.wildcard = wildcard;
	}

}
