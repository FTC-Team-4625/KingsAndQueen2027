package org.firstinspires.ftc.teamcode.pedro;

import static com.pedropathing.api.Paths.line;

import com.pedropathing.api.PoseFactory;
import com.pedropathing.drivetrain.DrivePowers;
import com.pedropathing.follower.Follower;
import com.pedropathing.math.Pose;
import com.pedropathing.paths.Path;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import com.pedropathing.ivy.Scheduler;
import static com.pedropathing.ivy.Scheduler.schedule;
import static com.pedropathing.ivy.pedro.PedroCommands.follow;



@Autonomous
public class PedropathingAuto extends OpMode {

    private final PoseFactory poseFactory = PoseFactory.degrees();
    private Follower follower;

    boolean isDPadUpPressed = false;
    boolean DPadUpPrev      = false;

    boolean isFieldCentric = false;

    @Override
    public void start() {
        Pose startPose = poseFactory.of(0,0,0);
        Pose endPose = poseFactory.of(24,0,0);
        Path myPath = line(startPose,endPose);

        schedule(follow(follower,myPath));
    }
    @Override
    public void init() {
        follower = Constants.create(hardwareMap);
        follower.setPose(poseFactory.of(0,0,0));
    }

    @Override
    public void loop() {
        Scheduler.execute();
        follower.update();
    }
}

