package com.company;

import static java.awt.SystemColor.info;

public class Televisor {

    private boolean switchOffOn;

    public boolean isSwitchOffOn() {
        return switchOffOn;
    }

    public void setSwitchOffOn(boolean switchOffOn) {
        this.switchOffOn = switchOffOn;
    }

    void turnOn() {
        setSwitchOffOn(true);
    }

    void turnOff() {
        setSwitchOffOn(false);
    }

    public String showStatus() {
        String info;
        if (switchOffOn) {
            info = "Włączony";
        } else {
            info = "Wyłączony";
        }
        return "Televisor {" + info +'}';
    }
}
