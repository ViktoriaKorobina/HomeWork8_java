package org.example;

public class Human extends Alive{
    private final int maxHeight = 2;
    private final int maxDistance = 100;
    public Human(String name) {
        super(name);
    }

    @Override
    void run(Treadmill treadmill) {
        if(treadmill.getNumber() <= maxDistance){
            System.out.println("Человек " + super.getName()+ " пробежал "+ treadmill.getNumber() + " метров");
        } else {
            System.out.println("Человек " + super.getName()+ " выбыл");
            super.setState(false);
        }
    }

    @Override
    void jump(Wall wall) {
        if(wall.getNumber() <= maxHeight){
            System.out.println("Человек " + super.getName() + " перепрыгнул " + wall.getNumber() + " метров");
        } else {
            System.out.println("Человек " + super.getName()+ "  выбыл");
            super.setState(false);
        }
    }
}
