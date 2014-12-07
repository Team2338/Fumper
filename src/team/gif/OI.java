package team.gif;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import team.gif.commands.*;

public class OI {
    
    public static final Joystick
        leftStick = new Joystick(1),
        rightStick = new Joystick(2),
        auxStick = new Joystick(3);
    
    private final Button
        leftTrigger = new JoystickButton(leftStick, 1),
        aux2 = new JoystickButton(rightStick, 2),
        aux3 = new JoystickButton(rightStick, 3),
        aux6 = new JoystickButton(rightStick, 6),
        aux7 = new JoystickButton(rightStick, 7);
    
    public static final Button auxTrigger = new JoystickButton(rightStick, 1);
    
    public OI() {
        leftTrigger.whileHeld(new ShifterHigh());
        
        aux2.whileHeld(new CollectorReceive());
        aux2.whenPressed(new EarsOpen());
        
        aux3.whileHeld(new CollectorPass());
        aux3.whenPressed(new EarsOpen());
        aux3.whenReleased(new CollectorStandby());
        aux3.whenReleased(new EarsClosed());
        
        aux6.whileHeld(new BumperUp());
        aux7.whileHeld(new CollectorRaise());
    }
}

