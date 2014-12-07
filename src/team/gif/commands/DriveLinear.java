package team.gif.commands;

import team.gif.OI;
import team.gif.RobotMap;

/**
 *
 * @author Patrick
 */
public class DriveLinear extends CommandBase {
    
    public DriveLinear() {
        requires(driveTrain);
    }

    protected void initialize() {
        RobotMap.leftEncoder.start();
        RobotMap.rightEncoder.start();
    }

    protected void execute() {
        System.out.println(RobotMap.leftEncoder.get());
        System.out.println(RobotMap.rightEncoder.get());
        driveTrain.moveLeft(OI.leftStick.getY());
        driveTrain.moveRight(-OI.rightStick.getY());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
