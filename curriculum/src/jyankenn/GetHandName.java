package jyankenn;

public class GetHandName {
	public  String getHandName(int hand) {
        switch (hand) {
            case 0: return "グー";
            case 1: return "チョキ";
            case 2: return "パー";
            default: return"不正な値";
        }
	}
}
