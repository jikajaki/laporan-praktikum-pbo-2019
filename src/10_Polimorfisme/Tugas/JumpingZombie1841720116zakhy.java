package TugasJS101841720116zakhy;

public class JumpingZombie1841720116zakhy extends Zombie1841720116zakhy {

    public JumpingZombie1841720116zakhy(int health, int level) {
        this.level = level;
        this.health = health;
    }

    public void heal() {
        if (level == 1) {
            health += health * 0.3;
        } else if (level == 2) {
            health += health * 0.4;
        } else if (level == 3) {
            health += health * 0.5;
        }
    }

    public void destroyed() {
        health -= health * 0.1;
    }

    public String getZombieInfo() {
        String info = "\nJumping Zombie Data = \n";
        info += super.getZombieInfo() + "\n";
        return info;
    }
}
