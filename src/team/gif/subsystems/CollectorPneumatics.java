package team.gif.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import team.gif.RobotMap;
import team.gif.commands.CollectorLower;

/**
 *
 * @author Patrick
 */
public class CollectorPneumatics extends Subsystem {
    
    public void raiseCollector(boolean isRaised) {
        RobotMap.collectorRaise.set(isRaised);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new CollectorLower());
    }
}
