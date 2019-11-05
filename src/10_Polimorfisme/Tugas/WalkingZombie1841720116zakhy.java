package TugasJS101841720116zakhy;

public class WalkingZombie1841720116zakhy extends Zombie1841720116zakhy {

    public WalkingZombie1841720116zakhy(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        if (level == 1) {
            health += health * 0.2;
        } else if (level == 2) {
            health += health * 0.3;
        } else if (level == 3) {
            health += health * 0.4;
        }
    }

    public void destroyed() {
        health -= health * 0.2;
    }

    public String getZombieInfo() {
        String info = "\nWalking Zombie Data = \n";
        info += super.getZombieInfo() + "\n";
        return info;
    }
}
