package TugasJS101841720116zakhy;

public abstract class Zombie1841720116zakhy implements Destroyable1841720116zakhy {

    protected int health;
    protected int level;

    public String getZombieInfo() {
        return "\nHealth = " + health + "\nLevel = " + level;
    }

    public abstract void heal();

    @Override
    public abstract void destroyed();
}
