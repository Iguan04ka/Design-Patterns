package ru.iguana.designPatterns.Adapter;

public class UsbAdapter implements UsbConnection{
    private final SdCard sdCard;

    public UsbAdapter(SdCard sdCard) {
        this.sdCard = sdCard;
    }

    @Override
    public void set() {
        sdCard.set();
    }
}
