package OOP;

/**
 * Created by ramon on 03-02-16.
 */
public class MotorCycle extends BiCycle{
    String define_me()
    {
        return "a cycle with an engine.";
    }

    MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am "+ define_me());
        String temp=super.define_me();
        System.out.println("My ancestor is a cycle who is "+ temp );
    }

}
