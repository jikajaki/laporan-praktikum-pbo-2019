package TugasJS101841720116zakhy;

public class Barrier1841720116zakhy implements Destroyable1841720116zakhy {

    private int strength;

    public Barrier1841720116zakhy(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void destroy() {
        strength -= strength * 0.1;
    }

    public void destroyed() {
        destroy();
    }

    public String getBarrierInfo() {
        return "\nBarrier Strength = " + strength + "\n";
    }
}
