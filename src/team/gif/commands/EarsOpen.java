package team.gif.commands;

/**
 *
 * @author Patrick
 */
public class EarsOpen extends CommandBase {
    
    public EarsOpen() {
        requires(ears);
    }

    protected void initialize() {
    }

    protected void execute() {
        ears.activate(true);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}