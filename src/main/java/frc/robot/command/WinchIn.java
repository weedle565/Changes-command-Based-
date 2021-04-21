package frc.robot.command;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class WinchIn extends Command {

    @Override
    protected void execute() {
        super.execute();
        Robot.Climber.winch(1);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
    
}
