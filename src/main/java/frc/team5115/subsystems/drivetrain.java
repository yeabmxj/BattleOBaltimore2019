package frc.team5115.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.team5115.robot.Robot;

import static frc.team5115.robot.Robot.joy;

public class drivetrain {

    TalonSRX frontLeft;
    TalonSRX frontRight;
    TalonSRX backLeft;
    TalonSRX backRight;

    private double throttle = .5;
    private double MIN_VALUE = 0;

    public drivetrain() {
        frontLeft = new TalonSRX(1);
        frontRight = new TalonSRX(2);
        backLeft = new TalonSRX(3);
        backRight = new TalonSRX(4);

        frontLeft.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
        frontRight.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
        backLeft.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
        backRight.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
    }

    public void drive(double x, double y, double thrott, double speedCap) {
        y *= -1;
        x *= -1;
        double leftSpd = ((y + x) * thrott)*speedCap;
        double rightSpd= ((y - x) * thrott)*speedCap;

        frontLeft.set(ControlMode.PercentOutput, -leftSpd);
        backLeft.set(ControlMode.PercentOutput, -leftSpd);
        frontRight.set(ControlMode.PercentOutput, rightSpd);
        backRight.set(ControlMode.PercentOutput, rightSpd);


    }

    public double throttle(double t) {
        throttle += t *(joy.getRawAxis(3) - joy.getRawAxis(2));

        if (throttle > 1){
            throttle = 1;
        } else if(throttle < MIN_VALUE){
            throttle = MIN_VALUE;
        }
        return throttle;
    }

    public void resetEncoders() {
        frontLeft.set(ControlMode.PercentOutput, 0);
        backLeft.set(ControlMode.PercentOutput, 0);
        frontRight.set(ControlMode.PercentOutput, 0);
        backRight.set(ControlMode.PercentOutput, 0);
    }
}