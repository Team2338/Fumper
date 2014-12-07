package team.gif.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import team.gif.RobotMap;
import team.gif.commands.ShifterLow;

/**
 *
 * @author Patrick
 */
public class Shifter extends Subsystem {
    
    public void shiftHigh(boolean isHigh) {
        if (isHigh) {
            RobotMap.shifter.set(DoubleSolenoid.Value.kForward);
        } else {
            RobotMap.shifter.set(DoubleSolenoid.Value.kReverse);
        }
    }

    public void initDefaultCommand() {
        setDefaultCommand(new ShifterLow());
    }
}
