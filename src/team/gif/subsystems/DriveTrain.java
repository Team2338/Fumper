package team.gif.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import team.gif.RobotMap;

/**
 *
 * @author Patrick
 */
public class DriveTrain extends Subsystem {
    
    public void moveLeft(double speed) {
        RobotMap.frontLeft.set(speed);
        RobotMap.rearLeft.set(speed);
    }
    
    public void moveRight(double speed) {
        RobotMap.frontRight.set(speed);
        RobotMap.rearRight.set(speed);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
