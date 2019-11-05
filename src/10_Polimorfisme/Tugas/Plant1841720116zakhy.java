package TugasJS101841720116zakhy;

public class Plant1841720116zakhy {

    public void doDestroy(Destroyable1841720116zakhy d) {
        if (d instanceof WalkingZombie1841720116zakhy) {
            WalkingZombie1841720116zakhy wz = (WalkingZombie1841720116zakhy) d;
            wz.destroyed();
        } else if (d instanceof JumpingZombie1841720116zakhy) {
            JumpingZombie1841720116zakhy jz = (JumpingZombie1841720116zakhy) d;
            jz.destroyed();
        } else if (d instanceof Barrier1841720116zakhy) {
            Barrier1841720116zakhy b = (Barrier1841720116zakhy) d;
            b.destroyed();
        }
    }
}
