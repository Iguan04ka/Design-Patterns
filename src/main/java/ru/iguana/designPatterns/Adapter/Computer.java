package ru.iguana.designPatterns.Adapter;

public class Computer {
    public void connect(UsbConnection usb){
        usb.set();
        System.out.println("К компьютеру подключено устройство");

    }

}
