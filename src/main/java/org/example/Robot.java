package org.example;

public class Robot extends Inanimate{

    private final int maxHeight = 6;
    private final int maxDistance = 150;
    public Robot(String name) {
        super(name);
    }
    @Override
    void run(Treadmill treadmill) {
        if(treadmill.getNumber() <= maxDistance){
            System.out.println("Робот " + super.getName() + " пробежал "+ treadmill.getNumber() + " метров");
        } else {
            System.out.println("Робот " + super.getName() + " выбыл");
            super.setState(false);
        }
    }

    @Override
    void jump(Wall wall) {
        if(wall.getNumber() <= maxHeight){
            System.out.println("Робот " + super.getName() + " перепрыгнул " + wall.getNumber() + " метров");
        } else {
            System.out.println("Робот " + super.getName() + " выбыл");
            super.setState(false);
        }
    }
}
