package frc.robot.command;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class WinchOut extends Command {

    @Override
    protected void execute() {
        super.execute();
        Robot.Climber.winch(-0.3);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
    
}
