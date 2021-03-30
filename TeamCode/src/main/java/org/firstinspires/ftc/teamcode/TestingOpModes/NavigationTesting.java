package org.firstinspires.ftc.teamcode.TestingOpModes;

import com.acmerobotics.dashboard.FtcDashboard;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Core.Input.ControllerInput;

//The class for controlling the robot in teleop. Includes basic drive movement, shooter operations,
//and advanced autonomous functions.

//REQUIRED TO RUN: Phones | REV Hub | Demobot Chassis | Shooter | Odometry Unit
//REQUIRED TO FUNCTION: Controllers

//@Config
@TeleOp(name = "*Testing OpMode*")
@Disabled
public class NavigationTesting extends OpMode {
    ////Dependencies////
    private ControllerInput controllerInput1;
    private ControllerInput controllerInput2;
    FtcDashboard dashboard;

    ////Variables////
    //Tweaking Vars
    public static double turnWhileDrivingSpeed = 0.5;//used to change how fast robot turns when driving
    public static double driveSpeed = 0.8;//used to change how fast robot drives
    public static double turnSpeed = 0.5;//used to change how fast robot turns
    public static double headingP = 0.002;
    public static double headingI = 0;
    public static double headingD = 0.001;
    //Utility Vars
    private boolean busy = false;

    @Override
    public void init() {
        //Sets up demobot control class

        //Sets up controller inputs
        /*controllerInput1 = new ControllerInput(gamepad1, 1);
        controllerInput1.addListener(this);
        controllerInput2 = new ControllerInput(gamepad2, 2);
        controllerInput2.addListener(this);*/

        dashboard = FtcDashboard.getInstance();
        dashboard.setTelemetryTransmissionInterval(25);
    }

    @Override
    public void start() {

    }

    @Override
    public void loop() {
        return;
    }
}