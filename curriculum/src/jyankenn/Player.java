package jyankenn;

import java.util.Scanner;

public class Player {

    private Scanner scanner;

    
    public Player(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getHand() {

        int hand;

        while (true) {

            System.out.print("グー(0), チョキ(1), パー(2) を入力: ");

            if (!scanner.hasNextInt()) {
                System.out.println("数字を入力してください。\n");
                scanner.next();
                continue;
            }

            hand = scanner.nextInt();

            if (hand >= 0 && hand <= 2) {
                break;
            } else {
                System.out.println("0～2の数字を入力してください。\n");
            }
        }

        return hand;
    }
}

//    public String getHandName(int hand) {
//        switch (hand) {
//            case 0: return "グー";
//            case 1: return "チョキ";
//            case 2: return "パー";
//            default: return "不正な値";
//        }
//    }

