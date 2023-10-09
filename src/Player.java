import java.util.Arrays;

public class Player extends Entity {
    public final int MaxHP;
    private int ATK = 24;
    private int DEF = 39;
    private int HEALTH = 100;
    private int[] DMG = new int[]{2, 8};
    private int kit = 4;

    public Player(int ATK, int DEF, int HEALTH, int[] DMG) {
        this.MaxHP = this.HEALTH;
        this.ATK = ATK;
        this.DEF = DEF;
        this.HEALTH = HEALTH;
        this.DMG = DMG;
    }

    public Player() {
        this.MaxHP = this.HEALTH;
    }

    public int getATK() {
        return this.ATK;
    }

    public int getDEF() {
        return this.DEF;
    }

    public int getHEALTH() {
        return this.HEALTH;
    }

    public int[] getDMG() {
        return this.DMG;
    }

    public int getKit() {
        return this.kit;
    }

    public void setHEALTH(int HEALTH) {
        this.HEALTH = HEALTH;
    }

    public void setKit(int kit) {
        this.kit = kit;
    }

    public int getMaxHP() {
        return this.MaxHP;
    }

    public void hit(Entity monster) {
        monster.setHEALTH(Math.max(0, monster.getHEALTH() - Dice.randomDamage(this.getDMG())));
    }
    public void heal(){
        int lastValueHp = this.HEALTH;
        int newHealth = this.getHEALTH() + this.getMaxHP() * 3 / 10;
        //Проверка на лечение сверх максимального здоровья
        this.setHEALTH(Math.min(newHealth, this.getMaxHP()));
        System.out.println("Здоровье восстановлено на " + (this.HEALTH - lastValueHp));
        this.setKit(this.getKit() - 1);
    }

    public String toString() {
        int var10000 = this.ATK;
        return "Player{, ATK=" + var10000 + ", DEF=" + this.DEF + ", HEALTH=" + this.HEALTH + ", DMG=" + Arrays.toString(this.DMG) + ", kit=" + this.kit + "}";
    }
}