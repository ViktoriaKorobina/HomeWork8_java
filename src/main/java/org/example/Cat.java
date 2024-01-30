package org.example;

public class Cat extends Alive{
    private final int maxHeight = 3;
    private final int maxDistance = 50;
    public Cat(String name) {
        super(name);
    }
    @Override
    void run(Treadmill treadmill) {
        if(treadmill.getNumber() <= maxDistance){
            System.out.println("Кот " + super.getName() + " пробежал "+ treadmill.getNumber() + " метров");
        } else {
            System.out.println("Кот " + super.getName() + " выбыл");
            super.setState(false);
        }
    }

    @Override
    void jump(Wall wall) {
        if(wall.getNumber() <= maxHeight){
            System.out.println("Кот " + super.getName() + " перепрыгнул " + wall.getNumber() + " метров");
        } else {
            System.out.println("Кот " + super.getName() + " выбыл");
            super.setState(false);
        }
    }
}
