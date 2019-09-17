package frc.team5115.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;

public class intakeMech {
    public DoubleSolenoid leftAbove;
    public DoubleSolenoid rightAbove;
    public DoubleSolenoid leftBelow;
    public DoubleSolenoid rightBelow;

    public TalonSRX leftIntake;
    public TalonSRX rightIntake;

    public intakeMech()
    {
        leftAbove = new DoubleSolenoid(0, 1, 1);
        rightAbove = new DoubleSolenoid(0, 0,0);
        leftBelow = new DoubleSolenoid(0,0,0);
        rightBelow = new DoubleSolenoid(0,0,0);

        leftIntake = new TalonSRX(1);
        rightIntake = new TalonSRX(2);
    }
}
