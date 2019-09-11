package frc.team5115.subsystems;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.team5115.robot.Robot;



public class drivetrain {

    TalonSRX frontLeft;
    TalonSRX frontRight;
    TalonSRX backLeft;
    TalonSRX backRight;

    public drivetrain() {
        frontLeft = new TalonSRX(0);
        frontRight = new TalonSRX(1);
        backLeft = new TalonSRX(2);
        backRight = new TalonSRX(3);

        frontLeft.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
        frontRight.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
        backLeft.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
        backRight.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
    }
    
}