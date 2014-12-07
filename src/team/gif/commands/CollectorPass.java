package team.gif.commands;

import team.gif.Globals;

/**
 *
 * @author Patrick
 */
public class CollectorPass extends CommandBase {
    
    public CollectorPass() {
        requires(collectorMotors);
    }

    protected void initialize() {
    }

    protected void execute() {
        collectorMotors.collect(-Globals.collectSpeed);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
