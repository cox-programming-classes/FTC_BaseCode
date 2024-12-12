package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name = "Mecanum")
public class MecanumTeleOp extends LinearOpMode
{
    MechanumBot robot;

    @Override
    public void runOpMode() throws InterruptedException
    {
        robot = new MechanumBot(this.hardwareMap);

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
            //             PRINT STATEMENTS
            //_______________________________________________
            //joystick inputs
            telemetry.addData("x: ", x);
            telemetry.addData("y: ", y);
            telemetry.addData("t: ", t);
        }
    }
}
