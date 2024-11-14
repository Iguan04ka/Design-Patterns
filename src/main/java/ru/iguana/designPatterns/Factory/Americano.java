package ru.iguana.designPatterns.Factory;

public class Americano extends Coffee{

    @Override
    protected String coffeeName() {
        return "Americano";
    }
}
