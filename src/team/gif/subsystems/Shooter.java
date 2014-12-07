package team.gif.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import team.gif.RobotMap;
import team.gif.commands.ShooterFireStates;

/**
 *
 * @author Patrick
 */
public class Shooter extends Subsystem {
    
    public void setSpeed(double speed) {
        RobotMap.cockingMotor.set(speed);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new ShooterFireStates());
    }
}
