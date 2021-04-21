package frc.robot.command;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class IntakeUp extends Command {

    @Override
    protected void execute() {
        super.execute();
        Robot.Intake.intakeArmUp(-0.8);
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return false;
    }
    
}