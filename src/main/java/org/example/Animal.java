package org.example;

public class Animal {
    String name;
    int go;
    int plivet;
    public Animal (){  }
    public void animalInfo(){System.out.println("Животное с кличкой: " + name);}
    public void run(int dist)
    {
        if (dist<=go)
        {
            System.out.println(name + " пробежал " + dist);
        }
        else
        {
            System.out.println(name + " не пробежал " + dist);
        }

    }
    public void swim(int dist)
    {
        if (dist<=plivet)
        {
            System.out.println(name + " проплыл " + dist);
        }
        else
        {
            System.out.println(name + " не проплыл " + dist);
        }

    }
    }
