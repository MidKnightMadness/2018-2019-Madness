package org.firstinspires.ftc.teamcode.common;

import org.firstinspires.ftc.teamcode.visual.VisualImpl;

/**
 * Created by Gregory on 9/10/18.
 */

public final class Config {
    public static final class Visual {
        public static VisualImpl NEW() {
            return new VisualImpl();
        }
    }
}

