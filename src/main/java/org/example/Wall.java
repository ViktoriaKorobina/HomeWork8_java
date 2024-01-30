package org.example;

public class Wall extends Let{
    public Wall(int number) {
        super(number);
    }

    @Override
    public String toString() {
        return "Wall " + super.getNumber() + " meters";
    }
}
