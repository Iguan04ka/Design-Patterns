package ru.iguana.designPatterns.Factory;

public class CoffeeMachine {
    public void makeCoffee(CoffeeType coffeeType){
        Coffee coffee = CoffeeFactory.getCoffee(coffeeType);
        System.out.println("Создается кофе " + coffee.coffeeName());
    }
}
