package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Creator> team = new ArrayList<>(Arrays.asList(
                new Human("Ivan"),
                new Human("Elena"),
                new Cat("Murzik"),
                new Cat("Barsik"),
                new Robot("Hj123"),
                new Robot("KL456")
        ));
        int numbersOfLets = new Random().nextInt(3,5);
        boolean[] array = new boolean[numbersOfLets];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextBoolean();
        }
        List<Let> lets = new ArrayList<>();
        for(boolean el: array){
            if(el){
                lets.add(new Treadmill(new Random().nextInt(10, 160)));
            } else{
                lets.add(new Wall(new Random().nextInt(4)));
            }
        }
        System.out.println("---------");
        System.out.println("Lets:");
        for (Let let: lets){
            System.out.println(let);
        }
        System.out.println("---------");
        System.out.println("Team: ");
        for (int i = 0; i < team.size(); i++) {
            System.out.println(team.get(i));

        }
        System.out.println("---------");
        Iterator<Creator> iterator = team.iterator();
        while (iterator.hasNext()){
            Creator creator = iterator.next();
            for (Let let: lets){
                if(let instanceof Treadmill){
                    creator.run((Treadmill) let);
                } else {
                    creator.jump((Wall) let);
                }
                if(!creator.isState()){
                    break;
                }
            }
            if (!creator.isState()){
                iterator.remove();
            }
        }
        System.out.println("---------");
        System.out.println("Team: ");
        for (int i = 0; i < team.size(); i++) {
            System.out.println(team.get(i));
        }
    }
}