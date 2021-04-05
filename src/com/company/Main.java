package com.company;

public class Main{
    public static void main(String[] args) {
        Animal kozlik = new Animal("Козлик", AnimalType.GOAT);
        kozlik.jumpUp();
        object door = new object("Дверь", ObjectType.DOOR, true,3 );
        door.isClosed();
        Human gigant_shares_society = new Human("Владельцы гигантских акций", HumanType.GIGANT_SHARES_OWNERS);
        gigant_shares_society.run();
        gigant_shares_society.breakDown(100, door);
        gigant_shares_society.shout();
        kozlik.run();
        object window = new object("Окно", ObjectType.WINDOW, false, 3);
        window.isOpened();
        kozlik.jumpOutWindow(window.isSafety());
        kozlik.linkShares(500,window);
        Human neznaika = new Human("Незнайка", HumanType.OTHER);
        Actions linkShares = new Actions("связывание акций");
        neznaika.helpAnother(kozlik, linkShares);
        gigant_shares_society.breakDown(890, door);
        kozlik.leave();
    }
}