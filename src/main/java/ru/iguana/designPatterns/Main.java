package ru.iguana.designPatterns;

import ru.iguana.designPatterns.Adapter.Computer;
import ru.iguana.designPatterns.Adapter.SdCard;
import ru.iguana.designPatterns.Adapter.UsbAdapter;
import ru.iguana.designPatterns.Factory.CoffeeMachine;
import ru.iguana.designPatterns.Factory.CoffeeType;
import ru.iguana.designPatterns.Proxy.Database;
import ru.iguana.designPatterns.Proxy.DatabaseProxy;
import ru.iguana.designPatterns.Singleton.Logger;
import ru.iguana.designPatterns.Singleton.TestClass;

public class Main {
    public static void main(String[] args) {
        Logger l = Logger.getInstance();
        System.out.println(l.classLog(new TestClass(), "some info about testClass"));

        System.out.println("--------------------");

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.makeCoffee(CoffeeType.AMERICANO);
        coffeeMachine.makeCoffee(CoffeeType.ESPRESSO);

        System.out.println("--------------------");

        SdCard sdCard = new SdCard();
        UsbAdapter usbAdapter = new UsbAdapter(sdCard);
        Computer computer = new Computer();
        computer.connect(usbAdapter);

        System.out.println("--------------------");

        Database database = new DatabaseProxy("databaseName", "localhost", 8080);
        database.connect();

    }
}