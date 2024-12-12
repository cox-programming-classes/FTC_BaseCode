package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;


@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name = "TeleOp")
public class TeleOp extends LinearOpMode {

    Robot robot;

    public void runOpMode() throws InterruptedException {
        robot = new Robot(this);

        waitForStart();

        while (opModeIsActive())
        {

            //_______________________________________________
            //             MAIN CONTROLLER
            //_______________________________________________
            
            float x = gamepad1.right_stick_x;
            float y = -gamepad1.right_stick_y; //inputs from joystick are opposite
            float t = gamepad1.left_stick_x;

            robot.driveTrain.joystickDrive(x, y, t);

            //_______________________________________________
            //             MECH CONTROLLER
            //_______________________________________________


            //_______________________________________________
            //             PRINT STATEMENTS
            //_______________________________________________


            telemetry.addLine("Joystick Inputs");
            //joystick inputs
            telemetry.addData("x: ", x);
            telemetry.addData("y: ", y);
            telemetry.addData("t: ", t);



            telemetry.update();
        }
    }
}