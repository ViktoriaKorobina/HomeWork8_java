package org.example;

public class Treadmill extends Let {
    public Treadmill(int number) {
        super(number);
    }

    @Override
    public String toString() {
        return "Treadmill " + super.getNumber() + " meters";
    }
}
