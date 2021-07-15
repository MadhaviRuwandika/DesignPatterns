package com.examples.creational.singleton;

class DBConnector {
    private static DBConnector dbConnector;

    private DBConnector() {}

    static DBConnector getInstance() {
        if(dbConnector == null) {
            // To make thread safe
            synchronized (DBConnector.class)
            {
                // check again as multiple threads
                // can reach above step
                if (dbConnector==null)
                    dbConnector = new DBConnector();
            }
        }


        return dbConnector;
    }
}
