package ru.iguana.designPatterns.Proxy;

public class DatabaseProxy implements Database {
    private DatabaseImplementation db;
    private String dbName;
    private String host;
    private int port;

    public DatabaseProxy(String dbName, String host, int port) {
        this.dbName = dbName;
        this.host = host;
        this.port = port;
    }

    @Override
    public void connect() {
        if (db == null){
            String url = host + ":" + port + "/" + dbName;
            db = new DatabaseImplementation(url);
        }
        db.connect();
    }
}
