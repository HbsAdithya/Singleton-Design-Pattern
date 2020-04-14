package design.pattern.builder;

public class Query {

	private String	select	= null;
	private String	from	= null;
	private String	where	= null;
	private String	orderBy	= null;

	/**
	 * @return the select
	 */
	public String getSelect() {
		return select;
	}

	/**
	 * @param select
	 *            the select to set
	 */
	public void setSelect(String select) {
		this.select = select;
	}

	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @param from
	 *            the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @return the where
	 */
	public String getWhere() {
		return where;
	}

	/**
	 * @param where
	 *            the where to set
	 */
	public void setWhere(String where) {
		this.where = where;
	}

	/**
	 * @return the orderBy
	 */
	public String getOrderBy() {
		return orderBy;
	}

	/**
	 * @param orderBy
	 *            the orderBy to set
	 */
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	@Override
	public String toString() {

		String select = this.getSelect();
		String from = this.getFrom();
		String where = this.getWhere();
		String orderBy = this.getOrderBy();

		String queryString = "SELECT " + select.trim() + " FROM " + from.trim();

		if (where != null && !where.trim().equals("")) {
			queryString += " WHERE " + where;
		}

		if (orderBy != null && !orderBy.trim().equals("")) {
			queryString += " ORDER BY " + orderBy;
		}

		return queryString;
	}

}
