package frc.robot.command;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class IntakeDown extends Command {

    @Override
    protected void execute() {
        super.execute();
        Robot.Intake.intakeArmUp(-0.3);
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return false;
    }
    
}