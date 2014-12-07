package team.gif.commands;

/**
 *
 * @author Patrick
 */
public class CollectorStandby extends CommandBase {
    
    public CollectorStandby() {
        requires(collectorMotors);
    }

    protected void initialize() {
    }

    protected void execute() {
        collectorMotors.collect(0);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
