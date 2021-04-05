package com.company;

import java.util.Objects;

public class Animal extends Creature{
    private AnimalType animalType;
    Animal(){
        super();
        setHumanity(false);
    }
    Animal(String name){
        super(name);
        setHumanity(false);
    }
    Animal(String name, AnimalType animalType){
        super(name);
        this.animalType = animalType;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName = \"" + getName() + "\", " +
                "animalType = " + animalType + ", " +
                "isHuman = " + getHumanity() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return animalType == animal.animalType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalType);
    }
}