package ru.iguana.designPatterns.Adapter;

public class SdCard implements CardReaderConnection{
    @Override
    public void set(){
        System.out.println("Подключена карта пямяти");
    }
}
