package team.gif.commands;

/**
 *
 * @author Patrick
 */
public class CollectorRaise extends CommandBase {
    
    public CollectorRaise() {
        requires(collectorPneumatics);
    }

    protected void initialize() {
    }

    protected void execute() {
        collectorPneumatics.raiseCollector(true);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
