package design.pattern.builder;

public class QueryBuilder {

	private Query query = null;

	public QueryBuilder() {
		this.query = new Query();
	}

	public QueryBuilder select(String select) {
		this.query.setSelect(select);
		return this;
	}

	public QueryBuilder from(String from) {
		this.query.setFrom(from);
		return this;
	}

	public QueryBuilder where(String where) {
		this.query.setWhere(where);
		return this;
	}

	public QueryBuilder orderBy(String orderBy) {
		this.query.setOrderBy(orderBy);
		return this;
	}

	public Query build() {

		String select = this.query.getSelect();
		String from = this.query.getFrom();

		if (select == null || select.trim().equals("")) {
			throw new IllegalStateException("Query must have a SELECT");
		}

		if (from == null || from.trim().equals("")) {
			throw new IllegalStateException("Query must have a FROM");
		}

		return this.query;
	}

}
