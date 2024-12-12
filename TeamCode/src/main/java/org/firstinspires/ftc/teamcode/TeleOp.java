package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Driving.TankDrive;


@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name = "TeleOp")
public class TeleOp extends LinearOpMode {

    Tank robot;

    public void runOpMode() throws InterruptedException {
        robot = new Tank(this);

        waitForStart();

        while (opModeIsActive())
        {

            //_______________________________________________
            //             MAIN CONTROLLER
            //_______________________________________________
            
            float r = -gamepad1.right_stick_y;
            float l = -gamepad1.left_stick_y; //inputs from joystick are opposite


            robot.driveTrain.tankDrive(l, r);

            //_______________________________________________
            //             MECH CONTROLLER
            //_______________________________________________


            //_______________________________________________
            //             PRINT STATEMENTS
            //_______________________________________________


            telemetry.addLine("Joystick Inputs");
            //joystick inputs
            telemetry.addData("left: ", l);
            telemetry.addData("right: ", r);

            telemetry.update();
        }
    }
}