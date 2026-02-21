package b;

public class Animal{
	// フィールド
    private String name;   // 動物名
    private double length; // 体長(m)
    private int speed;     // 速度(km/h)

    // getter / setter（this を使う）
    public String getName() {
        return name;
    }

    
    
    
    public void setName(String name) {
        this.name = name;
    }

    
    
    
    public double getLength() {
        return length;
    }

    
    
    
    
    public void setLength(double length) {
        this.length = length;
    }

    
    
    
    public int getSpeed() {
        return speed;
    }

    
    
    
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}


