package org.example;

public abstract class Creator {
    private String name;
    private  boolean state;
    public Creator(String name){
        this.name = name;
        this.state = true;
    };

    public void setState(boolean state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public boolean isState() {
        return state;
    }
    abstract void run(Treadmill treadmill);
    abstract void jump(Wall wall);

    @Override
    public String toString() {
        return name + " ";
    }
}
