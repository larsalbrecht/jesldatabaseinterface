/**
 * 
 */
package de.dsol_clan.esl.databaseinterface.model;

import java.util.HashMap;

/**
 * This class contains the setter model to create setters during the parse-process.
 * 
 * @author lalbrecht
 * 
 */
public class SetterModel {

	private String contestant = null;
	private HashMap<String, String> paramMap = null;
	private Integer setter = null;

	private Integer slot = null;

	/**
	 * 
	 */
	public SetterModel() {
	}

	/**
	 * @param setter
	 * @param slot
	 * @param contestant
	 */
	public SetterModel(final Integer setter, final Integer slot, final String contestant) {
		super();
		this.setter = setter;
		this.slot = slot;
		this.contestant = contestant;
	}

	/**
	 * @return the contestant
	 */
	public final String getContestant () {
		return this.contestant;
	}

	/**
	 * @return the paramMap
	 */
	public final HashMap<String, String> getParamMap () {
		return this.paramMap;
	}

	/**
	 * @return the setter
	 */
	public final Integer getSetter () {
		return this.setter;
	}

	/**
	 * @return the slot
	 */
	public final Integer getSlot () {
		return this.slot;
	}

	/**
	 * @param contestant
	 *            the contestant to set
	 */
	public final void setContestant (final String contestant) {
		this.contestant = contestant;
	}

	/**
	 * @param paramMap
	 *            the paramMap to set
	 */
	public final void setParamMap (final HashMap<String, String> paramMap) {
		this.paramMap = paramMap;
	}

	/**
	 * @param setter
	 *            the setter to set
	 */
	public final void setSetter (final Integer setter) {
		this.setter = setter;
	}

	/**
	 * @param slot
	 *            the slot to set
	 */
	public final void setSlot (final Integer slot) {
		this.slot = slot;
	}

}
