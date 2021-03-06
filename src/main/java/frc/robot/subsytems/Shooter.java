/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsytems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.command.ShooterTake;

/**
 * Add your docs here.
 */
public class Shooter extends Subsystem{

    private final PWMVictorSPX shooterFlywheel;
    private final PWMVictorSPX shooterEntryWheel;


    public Shooter(){
        shooterFlywheel = new PWMVictorSPX(Robot.SHOOTER_FLYWHEEL);
        shooterEntryWheel = new PWMVictorSPX(Robot.SHOOTER_ENTRY_WHEELS);
    }

    public void takeBall(double speed){
     
            shooterEntryWheel.set(speed);
         //   shooterEntryWheel.set(0);
    }

    public void shootBall(double speed){
         shooterFlywheel.set(speed);
    }
    
    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new ShooterTake());

    }


}
