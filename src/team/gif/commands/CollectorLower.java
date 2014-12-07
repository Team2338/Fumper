package team.gif.commands;

/**
 *
 * @author Patrick
 */
public class CollectorLower extends CommandBase {
    
    public CollectorLower() {
        requires(collectorPneumatics);
    }

    protected void initialize() {
    }

    protected void execute() {
        collectorPneumatics.raiseCollector(false);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
