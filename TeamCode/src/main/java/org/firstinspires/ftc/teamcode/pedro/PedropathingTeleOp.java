package org.firstinspires.ftc.teamcode.pedro;

import com.pedropathing.drivetrain.DrivePowers;
import com.pedropathing.follower.Follower;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.pedro.Constants;

@TeleOp(name = "Example TeleOp")
public class PedropathingTeleOp extends OpMode {

    private Follower follower;

    boolean isDPadUpPressed = false;
    boolean DPadUpPrev      = false;

    boolean isFieldCentric = false;

    @Override
    public void init() {
        follower = Constants.create(hardwareMap);
    }

    @Override
    public void loop() {


        DrivePowers pw =


        follower.manual(
                -gamepad1.left_stick_y,
                gamepad1.left_stick_x,
                gamepad1.right_stick_x
        );

        follower.update();

        // Buttons presses
        isDPadUpPressed = gamepad1.dpad_up;

        // Do logic
        if (isDPadUpPressed != DPadUpPrev)
        {
            isFieldCentric = !isFieldCentric;
        }

        // update previous
        DPadUpPrev = isDPadUpPressed;


    }
}