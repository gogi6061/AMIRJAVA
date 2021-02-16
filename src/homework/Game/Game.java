package homework.Game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws Player.ValueException {
        Scanner scan = new Scanner(System.in);
        Player Boxer1 = new Player("Amir", 50);
        Player Boxer2 = new Player("Nigga", 50);

        while (Boxer1.getHp() > 0 & Boxer2.getHp() > 0) {
            System.out.println(" ");
            System.out.printf("Введите силу удара игрока %s \n", Boxer1.getName());
            Boxer1.setImpactForce(scan.nextInt());
            System.out.printf("Введите силу удара игрока %s \n", Boxer2.getName());
            Boxer2.setImpactForce(scan.nextInt());
            double[] valuesPlayers = Player.getChanceSelf(Boxer1.getImpactForce(), Boxer2.getImpactForce());

            if (valuesPlayers[0] * Math.random() > 0.3 * Math.random()) {

                Boxer1.hitPlayer(Boxer2);
            } else {
                System.out.printf("\n Промахнулся %s", Boxer1.getName());
            }
            if (valuesPlayers[1] * Math.random() > 0.3 * Math.random()) {
                Boxer2.hitPlayer(Boxer1);
            } else {
                System.out.printf("\n Промахнулся %s", Boxer2.getName());
            }


            System.out.printf("\n Здоровье игрока %s равно %d, \n здоровье игрока %s равно %d", Boxer1.getName(), Boxer1.getHp(), Boxer2.getName(), Boxer2.getHp());

        }
        if (Boxer1.getHp() < 1) {
            System.out.println(" \n Выиграл игрок " + Boxer2.getName());


        }
        if (Boxer2.getHp() < 1) {
            System.out.println(" \n Выиграл игрок " + Boxer1.getName());


        }
    }
}
