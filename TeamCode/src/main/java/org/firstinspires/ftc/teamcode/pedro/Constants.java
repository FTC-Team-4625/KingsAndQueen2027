package org.firstinspires.ftc.teamcode.pedro;

import com.pedropathing.follower.Follower;
import com.pedropathing.revhub.drivetrains.MecanumConfig;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Constants {
    public static Follower create(HardwareMap h) {
        // return new Follower(Drivetrain, Localizer, Foresight);
        return null;
    }

    public static MecanumConfig driveConfig = new MecanumConfig(
            c -> {
                c.backLeftName.set("leftBack");
                c.frontLeftName.set("leftFront");
                c.backRightName.set("rightBack");
                c.frontRightName.set("rightFront");

                c.backLeftDirection.set(DcMotorSimple.Direction.REVERSE);
                c.frontLeftDirection.set(DcMotorSimple.Direction.REVERSE);
                c.backRightDirection.set(DcMotorSimple.Direction.FORWARD);
                c.frontRightDirection.set(DcMotorSimple.Direction.FORWARD);
            }
    );
}