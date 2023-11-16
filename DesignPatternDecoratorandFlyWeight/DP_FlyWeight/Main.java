package DesignPatternDecoratorandFlyWeight.DP_FlyWeight;

public class Main {
    public static void main(String[] args) {
        PaintApp app=new PaintApp();
        app.render(10);
    }
}

/*
Flyweight:
It refers to an object that minimizes memory
usage by sharing some of the initial object's data with other similar objects.

you split the state of initial object into :
instrinsic immutabke state and extrinsic immutable state .

steps to create flyweight:
separate teh extrinsic state
pass them as paramaters
create a factory class
main or client acces via factory class.
Usage:It shd be used only when a program must support a huge number of similar objects
which barelyfit into available amount of RAM.

refer the geekific channel.
https://youtube.com/watch?v=v6tpISNjHf8


https://www.youtube.com/watch?v=qscOsQV-K14&list=PLlsmxlJgn1HJpa28yHzkBmUY-Ty71ZUGc&index=22

lets you fit more objects into the available RAM
by sharing the common parts and state between mulitple objects
,instead of storing all of the data in each object individually.
 */
