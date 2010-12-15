/**
 * 
 */
package de.dsol_clan.esl.databaseinterface.model;

import java.util.HashMap;

/**
 * @author lalbrecht
 * 
 */
public class MapModel {
	private Integer id = null;
	private String name = null;
	private HashMap<Integer, Integer> roundResults = new HashMap<Integer, Integer>();
	private Integer setterId = null;
	private Integer slot = null;

	public MapModel() {
	}

	/**
	 * @param id
	 * @param name
	 * @param setterId
	 * @param roundResults
	 * @param slot
	 */
	public MapModel(final Integer id, final String name, final Integer setterId,
			final HashMap<Integer, Integer> roundResults, final Integer slot) {
		super();
		this.id = id;
		this.name = name;
		this.setterId = setterId;
		this.roundResults = roundResults;
		this.slot = slot;
	}

	/**
	 * @return the id
	 */
	public final Integer getId () {
		return this.id;
	}

	/**
	 * @return the name
	 */
	public final String getName () {
		return this.name;
	}

	/**
	 * @return the roundResults
	 */
	public final HashMap<Integer, Integer> getRoundResults () {
		return this.roundResults;
	}

	/**
	 * @return the setterId
	 */
	public final Integer getSetterId () {
		return this.setterId;
	}

	/**
	 * @return the slot
	 */
	public final Integer getSlot () {
		return this.slot;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public final void setId (final Integer id) {
		this.id = id;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public final void setName (final String name) {
		this.name = name;
	}

	/**
	 * @param roundResults
	 *            the roundResults to set
	 */
	public final void setRoundResults (final HashMap<Integer, Integer> roundResults) {
		this.roundResults = roundResults;
	}

	/**
	 * @param setterId
	 *            the setterId to set
	 */
	public final void setSetterId (final Integer setterId) {
		this.setterId = setterId;
	}

	/**
	 * @param slot
	 *            the slot to set
	 */
	public final void setSlot (final Integer slot) {
		this.slot = slot;
	}

}
