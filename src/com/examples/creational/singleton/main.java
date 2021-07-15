package com.examples.creational.singleton;

public class main {

    public static void main(String[] args) {
        DBConnector t1Ins = DBConnector.getInstance();
        DBConnector t2Ins = DBConnector.getInstance();

        if(t1Ins == t2Ins) {
            System.out.println("DB connector instances are same");
        } else {
            System.out.println("DB connector instances are not same");
        }
    }
}
