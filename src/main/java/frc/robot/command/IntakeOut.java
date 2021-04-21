package frc.robot.command;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class IntakeOut extends Command {

    @Override
    protected void execute() {
        super.execute();
        Robot.Intake.takeIn(0.5);
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
