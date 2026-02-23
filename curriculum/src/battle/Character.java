package battle;

public class Character {

   private String name;
   private int hp;
   private int at;
   private int sp;

    public Character(String name, int hp, int at, int sp) {
        this.name = name;
        this.hp = hp;
        this.at = at;
        this.sp = sp;
    }

    public void attack(Character opponent) {
        opponent.hp -= this.at;
    }

    public boolean isAlive() {
        return hp > 0;
    }
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getSp() {
        return sp;
    }

    public int getAt() {
        return at;
    }
    protected void setName(String name) {
        this.name = name;
    }

    protected void setHp(int hp) {
        this.hp = hp;
    }

    protected void setAt(int at) {
        this.at = at;
    }

    protected void setSp(int sp) {
        this.sp = sp;
    }
    public String getStatus() {
        return name + " HP:" + hp + " AT:" + at + " SP:" + sp;
    }
}