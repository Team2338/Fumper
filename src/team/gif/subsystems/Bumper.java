package team.gif.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import team.gif.RobotMap;
import team.gif.commands.BumperDown;

/**
 *
 * @author Patrick
 */
public class Bumper extends Subsystem {
    
    public void bump(boolean bumpState) {
        RobotMap.autoCollectorDrop.set(bumpState);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new BumperDown());
    }
}
