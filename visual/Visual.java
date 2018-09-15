package org.firstinspires.ftc.teamcode.visual;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.common.Assembly;

/**
 * Created by Gregory on 9/14/18.
 */

public interface Visual extends Assembly {
    void init(HardwareMap hardwareMap, Telemetry telemetry);
    void inspectFrame(boolean debug) throws InterruptedException;
}
