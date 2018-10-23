package org.firstinspires.ftc.teamcode.OldFormat.lifter;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

/**
 * Drive: The control interface for the Drive Train
 *
 * Created by Gregory on 9/10/18.
 */

public abstract class Lift extends OpMode {
    public abstract void init(); // Initialize Motors
    public abstract void lowerRobot();
}
