package com.company;

interface CreatureActions{
    void jumpOutWindow(boolean isSafety);
    void helpAnother(Creature creature, Actions action);
    void linkShares(int sharesCount, object obj);//связывать акции (количество акций)
    void breakDown(int blowsCount,object obj);//выломать (количество ударов)
}