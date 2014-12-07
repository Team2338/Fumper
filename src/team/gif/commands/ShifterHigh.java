package team.gif.commands;

/**
 *
 * @author Patrick
 */
public class ShifterHigh extends CommandBase {
    
    public ShifterHigh() {
        requires(shifter);
    }

    protected void initialize() {
    }

    protected void execute() {
        shifter.shiftHigh(true);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
