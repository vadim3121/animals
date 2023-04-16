package org.example;

public class Main {
    public static void main(String[] args) {

        dog dog1 = new dog("дружок");
        homecat homecat1 = new homecat("пирожок");
        tiger tiger1 = new tiger("Амур");
        Puma Puma1 = new Puma("Адидас");
        Caracal fatcat1 = new Caracal("Шлепа");

        dog1.animalInfo();
        Animal[] lodka= {dog1, homecat1, tiger1, Puma1, fatcat1};
        for (int i = 0; i< lodka.length; i++)
        {
            lodka[i].run(200);
        }
        for (int i = 0; i<lodka.length; i++)
        {
            lodka[i].swim(200);
        }
        homecat1.voice();

    }
}