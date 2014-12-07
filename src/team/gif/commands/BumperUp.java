package team.gif.commands;

/**
 *
 * @author Patrick
 */
public class BumperUp extends CommandBase {
    
    public BumperUp() {
        requires(bumper);
    }

    protected void initialize() {
    }

    protected void execute() {
        bumper.bump(true);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
