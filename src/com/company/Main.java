package com.company;

public class Main {

    public static void main(String[] args) {
	    Televisor televisor = new Televisor( );

        System.out.println(televisor.showStatus());
	    televisor.turnOn();
        System.out.println(televisor.showStatus());
	    televisor.turnOff();
        System.out.println(televisor.showStatus());
    }
}
