package frc.robot.auto;

import frc.robot.Robot;
import frc.robot.subsytems.Drivetrain;
import frc.robot.subsytems.Shooter;

public class ShootAuto extends AutoStrategy {

    private long timeTakenToLocations = 0;

    @Override
    public void doStrategy(Robot robot) {

        //Move to the wall
        Drivetrain drivetrain = robot.getDrivetrain();

        System.out.println("doStrategy");

        timeTakenToLocations = System.currentTimeMillis();

        while(timeTaken() < 3000){
            drivetrain.driveStraight(.5);
            System.out.println("sleeping");
            sleep(10);
        }

        drivetrain.stop();

        Shooter shooter = robot.getShooter();

        while(timeTaken() < 10000){
            shooter.shootBall(1);
            sleep(5);
            shooter.takeBall(-0.8);
        }

    }
    
    private long timeTaken() {
        long timeTakenMs = System.currentTimeMillis() - timeTakenToLocations;
        System.out.println("timeTakenMs:" + timeTakenMs);
        return timeTakenMs;
    }
}
