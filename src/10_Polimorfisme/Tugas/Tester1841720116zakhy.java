package TugasJS101841720116zakhy;

public class Tester1841720116zakhy {
    public static void main(String[] args) {
        WalkingZombie1841720116zakhy wz = new WalkingZombie1841720116zakhy(100, 1);
        JumpingZombie1841720116zakhy jz = new JumpingZombie1841720116zakhy(100, 2);
        Barrier1841720116zakhy b = new Barrier1841720116zakhy(100);
        Plant1841720116zakhy p = new Plant1841720116zakhy();
        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
        System.out.println("---------------------");
        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
    }
}
