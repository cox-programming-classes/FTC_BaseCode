package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Driving.StrafeDrive;

public class MechanumBot
{
    StrafeDrive driveTrain;

    public MechanumBot(HardwareMap map)
    {
        driveTrain = new StrafeDrive(map);
    }
}
