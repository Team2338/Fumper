package team.gif.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import team.gif.RobotMap;
import team.gif.commands.EarsClosed;

/**
 *
 * @author Patrick
 */
public class Ears extends Subsystem {
    
    public void activate(boolean open) {
        if (!open) {
            RobotMap.ears.set(DoubleSolenoid.Value.kForward);
        } else {
            RobotMap.ears.set(DoubleSolenoid.Value.kReverse);
        }
    }

    public void initDefaultCommand() {
        setDefaultCommand(new EarsClosed());
    }
}
