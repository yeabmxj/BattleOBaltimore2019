import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;

public class Arm {
    public TalonSRX arm;

    public Arm(){
        arm = new TalonSRX(0);
    }

    public void moveArm(double throt){arm.set(ControlMode.PercentOutput, throt);}
}