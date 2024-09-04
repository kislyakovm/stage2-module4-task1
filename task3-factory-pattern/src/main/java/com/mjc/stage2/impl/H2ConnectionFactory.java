package com.mjc.stage2.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class H2ConnectionFactory {
    public Connection createConnection() {
        Properties prop = new Properties();
        try {
            prop.load(getClass().getResourceAsStream("/h2database.properties"));
            return DriverManager.getConnection("jdbc:h2:~/test", prop);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

