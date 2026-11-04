package org.firstinspires.ftc.teamcode.pedro;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp (name = "Meet0WhyDontBuilderReplaceWire")
public class TankDrive extends OpMode {

    DcMotor rightFront;
    DcMotor rightBack;
    DcMotor leftFront;
    DcMotor leftBack;

    @Override
    public void init() {
        rightFront = hardwareMap.get(DcMotor.class, "frontRight");
        rightBack = hardwareMap.get(DcMotor.class, "backRight");
        leftFront = hardwareMap.get(DcMotor.class, "frontLeft");
        leftBack = hardwareMap.get(DcMotor.class, "backLeft");

        rightFront.setDirection(DcMotorSimple.Direction.FORWARD);
        rightBack.setDirection(DcMotorSimple.Direction.REVERSE);
        leftFront.setDirection(DcMotorSimple.Direction.REVERSE);
        leftBack.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    @Override
    public void loop() {
        rightFront.setPower(-gamepad1.right_stick_y);
        rightBack.setPower(-gamepad1.right_stick_y);
        leftFront.setPower(-gamepad1.right_stick_y);
        leftBack.setPower(-gamepad1.left_stick_y);
    }
}