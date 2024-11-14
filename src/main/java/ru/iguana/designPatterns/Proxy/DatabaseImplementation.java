package ru.iguana.designPatterns.Proxy;

public class DatabaseImplementation implements Database{
    private String databaseName;

    public DatabaseImplementation(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void connect() {
        System.out.println("Подключено к БД: " + databaseName);
    }
}
