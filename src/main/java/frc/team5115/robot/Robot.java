package frc.team5115.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;

import frc.team5115.subsystems.*;

public class Robot extends TimedRobot {
    public static Arm arm;
    public static Joystick joy;
    public static drivetrain dt;
    public static wrist w;
    public static Limelight camera;

    double THROTTLE_GAIN = .001;
    double SPEED_CAP = 1;

    public void robotInit() {
        joy = new Joystick(0);
        arm = new Arm();
        dt = new drivetrain();
        w = new wrist();
        camera = new Limelight();
        camera.cameraMode();
    }

    public void robotPeriodic() {
        arm.moveArm();
        w.moveY();
        System.out.println("Throttle: "+dt.throttle(THROTTLE_GAIN));
        System.out.println("Capped Throttle: "+dt.throttle(THROTTLE_GAIN)*SPEED_CAP);
        dt.drive(joy.getRawAxis(4), joy.getRawAxis(1), dt.throttle(THROTTLE_GAIN), SPEED_CAP);
    }
}


