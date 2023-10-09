import java.util.Arrays;

public class Monster extends Entity{
    private int ATK = 40;
    private int DEF = 23;
    private int HEALTH = 75;
    private int[] DMG = {1,6};

    public Monster(int ATK, int DEF, int HEALTH, int[] DMG) {
        this.ATK = ATK;
        this.DEF = DEF;
        this.HEALTH = HEALTH;
        this.DMG = DMG;
    }
    public Monster(){

    }
    public void hit(Entity player){
        player.setHEALTH(Math.max(0, player.getHEALTH() - Dice.randomDamage(this.getDMG())));
    }
    public int getATK() {
        return ATK;
    }

    public int getDEF() {
        return DEF;
    }

    public int getHEALTH() {
        return HEALTH;
    }

    public int[] getDMG() {
        return DMG;
    }
    public void setHEALTH(int HEALTH) {
        this.HEALTH = HEALTH;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "ATK=" + ATK +
                ", DEF=" + DEF +
                ", HEALTH=" + HEALTH +
                ", DMG=" + Arrays.toString(DMG) +
                '}';
    }
}