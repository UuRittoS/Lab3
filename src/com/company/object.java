package com.company;

class object extends ObjectRealize {

    object(){
        super();
    }
    object(String name, ObjectType objectType){
        super(name,objectType);
    }
    object(String name, ObjectType objectType, boolean isOpened){
        super(name,objectType,isOpened);
    }
    object(String name, ObjectType objectType, boolean isOpened, int floorsCount){
        super(name, objectType, isOpened, floorsCount);
    }

}