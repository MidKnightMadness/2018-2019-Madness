package org.firstinspires.ftc.teamcode.visual;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.common.Config;

/**
 * Created by Gregory on 9/14/18.
 */

@Autonomous
public class MineralTest extends LinearOpMode {

    Visual v = Config.Visual.NEW();

    @Override
    public void runOpMode() throws InterruptedException {
        v.init(hardwareMap, telemetry);

        waitForStart();

        int i = 0;
        while (!isStopRequested()) {
            v.inspectFrame(i % 20 == 0);
            double waitUntil = time + 0.5;
            while (time < waitUntil && !isStopRequested());
        }
    }
}
