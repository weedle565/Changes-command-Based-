package frc.robot.command;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ShooterTake extends Command {

    @Override
    protected void execute() {
        super.execute();
        Robot.Shooter.takeBall(-0.8);
    }


    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return false;
    }

    
    
}
