package jyankenn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Player player = new Player(scanner);
        CPU cpu = new CPU();
        GetHandName gethandname = new GetHandName();

        boolean win = false;

        while (!win) {

            int playerHand = player.getHand();
            int cpuHand = cpu.getHand();

            System.out.println("あなたの手: " + gethandname.getHandName(playerHand));
            System.out.println("CPUの手: " + gethandname.getHandName(cpuHand));

            if (playerHand == cpuHand) {
                System.out.println("あいこです\n");
            }
            else if ((playerHand == 0 && cpuHand == 1) ||
                     (playerHand == 1 && cpuHand == 2) ||
                     (playerHand == 2 && cpuHand == 0)) {

                System.out.println("あなたの勝ち");
                win = true;
            }
            else {
                System.out.println("あなたの負け\n");
            }
        }

      
        scanner.close();
    }
}