package com.company;

import java.util.Objects;

public class Human extends Creature{

    Human(){
        super();
        setHumanity(true);
    }
    Human(String name){
        super(name);
        setHumanity(true);
    }
    Human(String name, HumanType humanType){
        super(name, humanType);
        setHumanity(true);
    }

    @Override
    public String toString() {
        return "Human{" +
                "Name = \"" + getName() + "\", " +
                "isHuman = " + getHumanity() +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.getName());
    }
}