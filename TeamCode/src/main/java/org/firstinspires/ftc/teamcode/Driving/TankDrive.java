package org.firstinspires.ftc.teamcode.Driving;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TankDrive implements IDriving
{

    DcMotor left;
    DcMotor right;

    public TankDrive(HardwareMap map)
    {
        left = map.tryGet(DcMotor.class, "left");
        right = map.tryGet(DcMotor.class, "right");
    }

    /**
     * Drive forward or backward.
     * @param power range, -1, 1; positive values go forward, negative values backwards, magnitude is speed
     */
    @Override
    public void vertical(double power)
    {
        if(power > 1) power = 1;
        if(power < -1) power = -1;
        left.setPower(power);
        right.setPower(power);
    }

    /**
     * Cannot drive sideways with a tank.  This does nothing.
     * @param power positive values go right, negative values go left, magnitude is speed
     */
    @Override
    public void horizontal(double power)
    {
        return; // Tank cannot go horizontal
    }

    @Override
    public void turn(double t)
    {
        left.setPower(t);
        right.setPower(-t);
    }

    @Override
    public void stop()
    {
        left.setPower(0);
        right.setPower(0);
    }

    /**
     * Standard Tank Drive Input using Two joysticks
     * @param x power to the Left track
     * @param y power to the Right track
     * @param t ignored.
     */
    @Override
    public void joystickDrive(float x, float y, float t)
    {
        left.setPower(x);
        right.setPower(y);
    }

    @Override
    public void adjustSpeed(double x) {

    }

    @Override
    public double getSpeed() {
        return 0;
    }
}
