package week11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<? extends Animal> animalList = new ArrayList<>();
        List<Cat> catList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();

        Dog dog_1 = new Dog("D_1");
        Cat cat_1 = new Cat("C_1");
        catList.add(cat_1);
        dogList.add(dog_1);
        
        animalList=catList;         

        for(Animal animal : animalList){
            System.out.println(animal.makeSound());
        }

        animalList=dogList;         

        for(Animal animal : animalList){
            System.out.println(animal.makeSound());
        }


    }
}


