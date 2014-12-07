package team.gif.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import team.gif.RobotMap;

/**
 *
 * @author Patrick
 */
public class CollectorMotor extends Subsystem {
    
    public void collect(double speed) {
        RobotMap.collectorMotor.set(speed);
    }

    public void initDefaultCommand() {
    }
}
