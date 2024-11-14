package ru.iguana.designPatterns.Singleton;

import java.time.LocalDate;

public class Logger {
    private static Logger instance;

    private Logger(){}

    public static Logger getInstance(){
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public String classLog(Object obj, String info){
        String className = obj.getClass().getName();
        LocalDate date = LocalDate.now();
        return date + " - " + className + " - " + info;
    }
}
