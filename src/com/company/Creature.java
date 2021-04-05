package com.company;

import java.util.Objects;

public abstract class Creature implements Skills, CreatureActions{
    private String name;
    private boolean isHuman;
    int sharesCount;
    HumanType humanType;
    int blowsCount;
    int blowsConst = 1000;

    Creature(){
        name = "Безымянный";
    }
    Creature(String name){
        this.name = name;
        this.humanType = humanType.OTHER;
    }
    Creature(String name, HumanType humanType){
        this.name = name;
        this.humanType = humanType;
    }

    public String getName() {
        return name;
    }
    public boolean getHumanity(){
        return isHuman;
    }
    public void setHumanity(boolean isHuman){
        this.isHuman = isHuman;
    }
    public void shout() {
        System.out.println("Объект "+this.getName() + " начал кричать");
    }
    @Override
    public void run() {
        System.out.println("Объект "+this.getName() + " начал бегать");
    }

    @Override
    public void jumpUp() {
        System.out.println("Объект "+this.getName() + " подскочил");
    }
    @Override
    public void jumpOutWindow(boolean isSafety) {
        if (isSafety == true) {System.out.println(this.getName() + " спрыгивает из окна, так как этаж низкий");}
        else {System.out.println(this.getName() + " не спрыгивает из окна, из-за большой высоты");}
    }
    @Override
    public void helpAnother(Creature creature, Actions action) {
        System.out.println(this.getName() + " помогает " + creature.getName() + " c "+ action.getName());
    }

    @Override
    public void linkShares(int sharesCount,object obj) {
        System.out.println("Вызвано действие связывание акций (ценных бумаг) для покидания здания ->");
        if (obj.floorsCount >= 3 ){
            this.sharesCount = sharesCount - obj.floorsCount*10;
            System.out.print("Было "+ sharesCount + " акций ");
            System.out.println("-> Стало "+this.sharesCount+" акций");
        }
        else {
            System.out.println("-> Акции не связываются из-за низкого этажа");}
    }

    @Override
    public void breakDown(int blowsCount, object obj) {
        System.out.println("Вызвано действие сломать дверь ->");
        if(this.humanType == humanType.GIGANT_SHARES_OWNERS){
            this.blowsCount = blowsConst - blowsCount;
            blowsConst = blowsConst - blowsCount;
            if (this.blowsCount <= 0){System.out.println("-> Дверь сломана"); obj.isBroken(); this.caught(); System.exit(0);}
            else {System.out.println("-> Осталось " + blowsConst + " ударов, чтобы сломать дверь");;}
        }
        else{
            System.out.println("-> Силы остальных персонажей мало");
        }
    }

    @Override
    public void caught() {
        System.out.println("Существа пойманы");
    }

    @Override
    public void leave() {
        System.out.println("Существа покинули здание");
        System.exit(0);
    }

    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                ", isHuman=" + isHuman +
                ", sharesCount=" + sharesCount +
                ", humanType=" + humanType +
                ", blowsCount=" + blowsCount +
                ", blowsConst=" + blowsConst +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creature creature = (Creature) o;
        return Objects.equals(name, creature.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}