package team.gif.commands;

/**
 *
 * @author Patrick
 */
public class ShifterLow extends CommandBase {
    
    public ShifterLow() {
        requires(shifter);
    }

    protected void initialize() {
    }

    protected void execute() {
        shifter.shiftHigh(false);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
