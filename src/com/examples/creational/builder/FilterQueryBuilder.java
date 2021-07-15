package com.examples.creational.builder;

public class FilterQueryBuilder {
    private String selectValues;
    private String relation;
    private String whereClause;
    private String groupByClause;
    private String orderByClause;

    public FilterQueryBuilder selectValues(String selectValues) {
        this.selectValues = selectValues;
        return this;
    }

    public FilterQueryBuilder relation(String relation) {
        this.relation = relation;
        return this;
    }

    public FilterQueryBuilder whereClause(String whereClause) {
        this.whereClause = whereClause;
        return this;
    }

    public FilterQueryBuilder groupByClause(String groupByClause) {
        this.groupByClause = groupByClause;
        return this;
    }

    public FilterQueryBuilder orderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
        return this;
    }

    public String build() {
        if(selectValues == null || relation == null) { return ""; };
        String query = "SELECT ".concat(selectValues).concat(" FROM ").concat(relation);

        if(whereClause != null) { query = query.concat(" WHERE ").concat(whereClause);}
        if(groupByClause != null) { query = query.concat(" GROUP BY ").concat(groupByClause);}
        if(orderByClause != null) { query = query.concat(" ORDER BY ").concat(orderByClause);}

        return query;
    }
}
