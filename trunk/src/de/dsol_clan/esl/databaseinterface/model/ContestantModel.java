/**
 * 
 */
package de.dsol_clan.esl.databaseinterface.model;

/**
 * @author lalbrecht
 * 
 */
public class ContestantModel {

	String country = null;
	Integer id = null;
	String name = null;
	String shortString = null;

	public ContestantModel() {
	}

	public ContestantModel(final String country, final Integer id,
			final String name, final String shortString) {
		super();
		this.country = country;
		this.id = id;
		this.name = name;
		this.shortString = shortString;
	}

	/**
	 * @return the country
	 */
	public final String getCountry() {
		return this.country;
	}

	/**
	 * @return the id
	 */
	public final Integer getId() {
		return this.id;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return this.name;
	}

	/**
	 * @return the shortString
	 */
	public final String getShortString() {
		return this.shortString;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public final void setCountry(final String country) {
		this.country = country;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public final void setId(final Integer id) {
		this.id = id;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public final void setName(final String name) {
		this.name = name;
	}

	/**
	 * @param shortString
	 *            the shortString to set
	 */
	public final void setShortString(final String shortString) {
		this.shortString = shortString;
	}

}
