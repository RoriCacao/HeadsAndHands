public abstract class Entity {
    private int ATK;
    private int DEF;
    private int HEALTH;
    private int[] DMG;

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

    public void setHEALTH(int HEALTH) {
        this.HEALTH = HEALTH;
    }

    public abstract String toString();
}
