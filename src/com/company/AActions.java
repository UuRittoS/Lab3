package com.company;

import java.util.Objects;

abstract class AActions {
    private String name;
    AActions(){
        name = "null";
    }
    AActions(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "AActions{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AActions aActions = (AActions) o;
        return Objects.equals(name, aActions.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}