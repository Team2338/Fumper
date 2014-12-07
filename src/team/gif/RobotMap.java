package team.gif;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

public class RobotMap {
    public static Talon
        frontLeft = new Talon(1),
        frontRight = new Talon(2),
        rearLeft = new Talon(3),
        rearRight = new Talon(4),
        collectorMotor = new Talon(5),
        cockingMotor = new Talon(7);
    
    public static Solenoid
        autoCollectorDrop = new Solenoid(4),
        collectorRaise = new Solenoid(6);
    
    public static DoubleSolenoid
        shifter = new DoubleSolenoid(1, 2),
        ears = new DoubleSolenoid(7, 8);
    
    public static Encoder
            leftEncoder = new Encoder(1, 2),
            rightEncoder = new Encoder(3, 4);
    
    public static DigitalInput shooterLimit = new DigitalInput(5);
    
    public static Compressor compressor = new Compressor(14, 1);
}
