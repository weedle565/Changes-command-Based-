package frc.robot.command;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class RopeUp extends Command {

    @Override
    protected void execute() {
        super.execute();
        Robot.Climber.climberMove(0.6);
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return false;
    }  
}
