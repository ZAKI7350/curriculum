package jyankenn;
import java.util.Random;

public class CPU {

    private Random random = new Random();

    public int getHand() {
        return random.nextInt(3); // 0〜2
    }

//    public String getHandName(int hand) {
//        switch (hand) {
//            case 0: return "グー";
//            case 1: return "チョキ";
//            case 2: return "パー";
//            default: return "不正な値";
//        }
//    }
}