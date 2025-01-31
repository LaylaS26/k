package pkg;

import robocode.*;

public class LaylaS extends Robot {
    public void run() {

        while (true) {
           //random move distance from 50-100
            int moveDistance = (50 + (int) (Math.random() * ((101 - 50) + 1)));


            ahead(moveDistance);
            turnGunRight(360);
            back(moveDistance);
            turnGunRight(360);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        //turn in the direction of the robot and fire
        setTurnRight(e.getBearing());
        fire(3);

    }

    public void onHitByBullet(HitByBulletEvent e) {
        // If hit by a bullet, move away
        turnRight(90);
        ahead(100);
        turnRight(180);

    }

    public void onHitWall(HitWallEvent e) {
        // If you hit a wall, move away from it
        back(100);
        turnRight(180);

    }
}
