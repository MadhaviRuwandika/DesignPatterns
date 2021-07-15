package com.examples.creational.builder;

public class main {
    public static void main(String[] args) {
        FilterQueryBuilder filterQueryBuilder = new FilterQueryBuilder();
        System.out.println("Builder without any value : " + filterQueryBuilder.build());

        String query1 = new FilterQueryBuilder()
                .selectValues("EMP_ID, NAME, COUNT(SALES_ID)")
                .relation("SALES")
                .whereClause("AMOUNT > 500")
                .groupByClause("EMP_ID")
                .build();
        System.out.println("Builder without any value : " + query1);

        String query2 = new FilterQueryBuilder()
                .selectValues("EMP_ID, NAME, COUNT(SALES_ID)")
                .relation("SALES")
                .whereClause("AMOUNT > 500")
                .orderByClause("SALE_DATE")
                .build();
        System.out.println("Builder without any value : " + query2);
    }
}
