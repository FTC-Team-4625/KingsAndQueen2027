package org.firstinspires.ftc.teamcode.pedro;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp (name = "MotorTest1")
public class MotorTest extends OpMode {

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
        leftFront.setDirection(DcMotorSimple.Direction.FORWARD);
        leftBack.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    @Override
    public void loop() {
        if (gamepad1.a){
            rightFront.setPower(1);
            telemetry.addLine("RF Running");
        } else {
            rightFront.setPower(0);
        }
        if (gamepad1.b){
            rightBack.setPower(1);
            telemetry.addLine("RB Running");
        } else {
            rightBack.setPower(0);
        }
        if (gamepad1.x){
            leftFront.setPower(1);
            telemetry.addLine("LF Running");
        } else {
            leftFront.setPower(0);
        }
        if (gamepad1.y){
            leftBack.setPower(1);
            telemetry.addLine("LB Running");
        } else {
            leftBack.setPower(0);
        }
        telemetry.update();
    }
}