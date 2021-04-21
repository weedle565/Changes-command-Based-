package frc.robot.command;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.controls.Controls;

public class Drive extends Command{

    @Override
    protected void execute() {
        super.execute();
        Robot.Drivetrain.arcadeDiffDrive(Controls.driver.getRawAxis(0), Controls.driver.getRawAxis(1));
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return false;
    }

}
