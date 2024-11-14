package ru.iguana.designPatterns.Adapter;

public class Usb implements UsbConnection{

    @Override
    public void set() {
        System.out.println("Подключен USB");
    }
}
