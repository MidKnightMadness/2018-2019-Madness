package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * TankDrive: A simple Drive implementation for a tank-drive robot.
 *
 * Created by Gregory on 9/10/18.
 */

@TeleOp
public class CarnivalMain extends OpMode {

    // Declare Motors
    // DO NOT assign them to anything yet because hardwareMap is not necessarily defined until init runs.
    private DcMotor left;
    private DcMotor right;

    @Override
    public void init() {
        left = hardwareMap.dcMotor.get("left");    // Retrieve the motor from the hardwareMap with the name set in the Config class
        left.resetDeviceConfigurationForOpMode();                   // Reset the motor
        left.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);          // Set the runMode
        left.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE); // Set the motor to brake when stopped as opposed to coast.
        left.setDirection(DcMotorSimple.Direction.REVERSE);         // Reverse the left motors because they are facing the opposite direction.

        right = hardwareMap.dcMotor.get("right");
        right.resetDeviceConfigurationForOpMode();
        right.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        right.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    @Override
    public void loop() {
        left.setPower(gamepad1.left_stick_y);
        right.setPower(gamepad1.right_stick_y);
    }
}