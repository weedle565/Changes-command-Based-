package frc.robot.controls;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.command.IntakeDown;
import frc.robot.command.IntakeIn;
import frc.robot.command.IntakeOut;
import frc.robot.command.IntakeUp;
import frc.robot.command.RopeDown;
import frc.robot.command.RopeUp;
import frc.robot.command.Shoot;
import frc.robot.command.ShooterTake;
import frc.robot.command.WinchIn;
import frc.robot.command.WinchOut;

public class Controls {
    
    public static XboxController driver;
    public final XboxController operator;

    public final Button intakeDown;
    public final Button intakeUp;
    public final Button intakeOut;
    public final Button intakeIn;

    public final Button ropeDown;
    public final Button ropeUp;
    public final Button winchUp;
    public final Button winchDown;

    public final Button shoot;
    public final Button takeBall;

    public Controls() {
        driver = new XboxController(0);
        operator = new XboxController(1);

        intakeDown = new JoystickButton(driver, Ps4Mapping.X);
        intakeDown.whileHeld(new IntakeDown());

        intakeUp = new JoystickButton(driver, Ps4Mapping.SQUARE);
        intakeUp.whileHeld(new IntakeUp());
        
        intakeIn = new JoystickButton(driver, Ps4Mapping.L2);
        intakeIn.whileHeld(new IntakeIn());

        intakeOut = new JoystickButton(driver, Ps4Mapping.SHARE);
        intakeOut.whileHeld(new IntakeOut());

        ropeDown = new JoystickButton(operator, Ps4Mapping.TRIANGLE);
        ropeDown.whileHeld(new RopeDown());

        ropeUp = new JoystickButton(operator, Ps4Mapping.CIRCLE);
        ropeUp.whileHeld(new RopeUp());

        winchUp = new JoystickButton(operator, Ps4Mapping.X);
        winchUp.whileHeld(new WinchIn());

        winchDown = new JoystickButton(operator, Ps4Mapping.SHARE);
        winchDown.whileHeld(new WinchOut());

        shoot = new JoystickButton(operator, Ps4Mapping.R2);
        shoot.whileHeld(new Shoot());

        takeBall = new JoystickButton(operator, Ps4Mapping.R1);
        takeBall.whileHeld(new ShooterTake());
    }

    public XboxController getDriver() {
        return driver;
    }

    public XboxController getOperator() {
        return operator;
    }
   

}
