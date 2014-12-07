package team.gif.commands;

/**
 *
 * @author Patrick
 */
public class EarsClosed extends CommandBase {
    
    public EarsClosed() {
        requires(ears);
    }

    protected void initialize() {
    }

    protected void execute() {
        ears.activate(false);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
