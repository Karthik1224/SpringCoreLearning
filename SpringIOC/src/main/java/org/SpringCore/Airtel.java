package org.SpringCore;

public class Airtel implements  Sim{
    @Override
    public void Calling() {
        System.out.println("I am airtel network");
    }

    @Override
    public void Data() {
        System.out.println("I am airtel browsing");
    }
}
