package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        dog dog1 = new dog("дружок");
        homecat homecat1 = new homecat("пирожок");
        tiger tiger1 = new tiger("шлепа");
        dog1.run(200);
        homecat1.swim(200);
        tiger1.swim(500);
        dog1.animalInfo();
        Animal[] lodka= {dog1, homecat1, tiger1};
        for (int i = 0; i<3; i++)
        {
            lodka[i].run(200);
        }
        for (int i = 0; i<3; i++)
        {
            lodka[i].swim(200);
        }
    }
}