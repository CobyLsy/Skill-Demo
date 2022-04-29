

import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void Division(){
        Boolean thrown = false;
        try {
            SkillDemo.divide(2,0);
        }
        catch (ArithmeticException e){
            thrown = true;
        }
        assertTrue(thrown);
    }
}
