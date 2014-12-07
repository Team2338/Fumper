package team.gif.commands;

import edu.wpi.first.wpilibj.Timer;
import team.gif.OI;
import team.gif.RobotMap;

/**
 *
 * @author Patrick
 */
public class ShooterFireStates extends CommandBase {
    
    private boolean isReady = false;
    
    public ShooterFireStates() {
        requires(shooter);
    }

    protected void initialize() {
    }

    protected void execute() {
        if (isReady) {
            if (OI.auxTrigger.get()) {
                System.out.println("Trigger hit");
                shooter.setSpeed(1);
                Timer.delay(1);
                isReady = false;
                System.out.println("Shooter has fired");
            } else {
                shooter.setSpeed(0);
            }
        } else {
            if (!RobotMap.shooterLimit.get()) {
                System.out.println("READY TO FIRE");
                shooter.setSpeed(0);
                isReady = true;
            } else {
                System.out.println("No Limits");
                shooter.setSpeed(1);
                isReady = false;
            }
        }
        
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
