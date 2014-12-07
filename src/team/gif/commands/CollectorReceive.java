package team.gif.commands;

import team.gif.Globals;

/**
 *
 * @author Patrick
 */
public class CollectorReceive extends CommandBase {
    
    public CollectorReceive() {
        requires(collectorMotors);
    }

    protected void initialize() {
    }

    protected void execute() {
        collectorMotors.collect(Globals.collectSpeed);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
