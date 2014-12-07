package team.gif.commands;

/**
 *
 * @author Patrick
 */
public class BumperDown extends CommandBase {
    
    public BumperDown() {
        requires(bumper);
    }

    protected void initialize() {
    }

    protected void execute() {
        bumper.bump(false);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
