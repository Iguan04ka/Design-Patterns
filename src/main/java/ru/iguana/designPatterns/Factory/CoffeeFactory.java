package ru.iguana.designPatterns.Factory;

public class CoffeeFactory {
    public static Coffee getCoffee(CoffeeType coffeeType){
        Coffee coffee;
        switch (coffeeType){
            case ESPRESSO: coffee = new Espresso(); break;
            case AMERICANO: coffee = new Americano(); break;
            default: throw new IllegalArgumentException("Неверный тип кофе");
        }
        return coffee;
    }
}
