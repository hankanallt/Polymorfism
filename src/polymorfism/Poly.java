package polymorfism;

import java.util.ArrayList;

public class Poly {

    public static void main(String[] args) {

        ArrayList<Animal> myAnimal = new ArrayList<>();

        Fish fish1 = new Fish();
        Fish fish2 = new Fish();

        Bird bird1 = new Bird();
        Bird bird2 = new Bird();

        Plant plant1 = new Plant();
        Plant plant2 = new Plant();

        myAnimal.add(bird1);
        myAnimal.add(bird2);
        myAnimal.add(fish1);
        myAnimal.add(plant2);

        for (Animal animal : myAnimal) {
           animal.move();
        }
    }
}


/*
Polymorfism is easy, just have a super class , put the methods there and extend all the other classes to the Super class.

Best way is to also declare the move method in the
super class.
This will give us polymorphism. Meaning we don’t even need to cast to get access to the
subclass implementation of the method.




Add a move() method to the
Animal class.
This method can be abstract or
not.
If sub class has a move() method
the sub class method will be run
else the Animal class move
method will be run.
No cast needed!
This is what is called polymorphism.*/