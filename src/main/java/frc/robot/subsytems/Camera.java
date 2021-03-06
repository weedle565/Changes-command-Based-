/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsytems;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Camera extends Subsystem{

    private UsbCamera camera1;

    private UsbCamera camera2;

    public Camera(){
        try{
            camera1 = CameraServer.getInstance().startAutomaticCapture(0);

            camera1.setFPS(10);
            camera1.setResolution(320, 180);

            camera2 = CameraServer.getInstance().startAutomaticCapture(1);

            camera2.setFPS(10);
            camera2.setResolution(320, 180);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    protected void initDefaultCommand() {

    }


}
