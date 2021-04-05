package com.company;

import java.util.Objects;

class ObjectRealize implements OpenClosable {
    private ObjectType objectType;
    String name;
    int floorsCount;
    ObjectRealize() {
        name = "безымянный";
    }
    ObjectRealize(String name, ObjectType objectType){
        this.name = name;
        this.objectType = objectType;
        isClosed();
        floorsCount = 0;
    }

    ObjectRealize(String name, ObjectType objectType, boolean isOpened){
        this.name = name;
        this.objectType = objectType;
        if (isOpened  == true){isOpened();}
        else{isClosed();}
        floorsCount = 0;
    }
    ObjectRealize(String name, ObjectType objectType, boolean isOpened, int floorsCount){
        this.name = name;
        this.objectType = objectType;
        if (isOpened  == true){isOpened();}
        else{isClosed();}
        this.floorsCount = floorsCount;
    }

    public String getName() {
        return name;
    }

    public int getCountFloors() {
        return floorsCount;
    }

    @Override
    public boolean isSafety() {
        if (this.floorsCount < 3){return true;}
        else {return false;}
    }

    @Override
    public boolean isClosed() {
        if (this.objectType == objectType.DOOR | this.objectType == objectType.WINDOW){
            return true;
        }
        else {throw new IllegalArgumentException();}
    }

    @Override
    public boolean isOpened() {
        if (this.objectType == objectType.DOOR | this.objectType == objectType.WINDOW){
            return true;
        }
        else {throw new IllegalArgumentException();}
    }

    @Override
    public boolean isBroken() {
        if (this.objectType == objectType.DOOR | this.objectType == objectType.WINDOW){
            return true;
        }
        else {throw new IllegalArgumentException();}
    }

    public ObjectType getObjectType() {
        return objectType;
    }

    @Override
    public String toString() {
        return "AObject{" +
                "objectType=" + objectType +
                ", name='" + name + '\'' +
                ", floorsCount=" + floorsCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectRealize aObject = (ObjectRealize) o;
        return objectType == aObject.objectType &&
                Objects.equals(name, aObject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectType, name);
    }
}