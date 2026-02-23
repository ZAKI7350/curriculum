package battle;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("プレイヤー名を入力してください: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);
        Daemon daemon = new Daemon("daemon_status1.txt");
       // Daemon daemon = new Daemon("C:\\Users\\user\\git\\リポジトリー\\curriculum\\src\\daemon_status.txt");
        try (FileWriter writer = new FileWriter("battle_log.txt")) {

            writer.write("=== バトル開始 ===\n");
            writer.write(player.getStatus() + "\n");
            writer.write(daemon.getStatus() + "\n\n");

            
            Character first;
            Character second;

            if (player.getSp() > daemon.getSp()) {
                first = player;
                second = daemon;
            } else if (player.getSp() < daemon.getSp()) {
                first = daemon;
                second = player;
            } else {
                if (new Random().nextBoolean()) {
                    first = player;
                    second = daemon;
                } else {
                    first = daemon;
                    second = player;
                }
            }

            writer.write("先攻: " + first.getName() + "\n\n");

            
            while (player.isAlive() && daemon.isAlive()) {

                first.attack(second);
                writer.write(first.getName() + " の攻撃！\n");
                writer.write(second.getName() + " のHP: " + second.getHp() + "\n\n");

                if (!second.isAlive()) break;

                second.attack(first);
                writer.write(second.getName() + " の攻撃！\n");
                writer.write(first.getName() + " のHP: " + first.getHp() + "\n\n");
            }

            
            if (player.isAlive()) {
                writer.write("勝者: " + player.getName() + "\n");
            } else {
                writer.write("勝者: " + daemon.getName() + "\n");
            }

            writer.write("=== バトル終了 ===");
        }

        System.out.println("バトル終了！結果は battle_log.txt に保存されました。");
    }
}