import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SILab2Test {

    @Test
    void multipleConditions(){
        // test slucai za prviot if
        assertFalse(SILab2.function(new User(null, "pas1","em@out.com"), Arrays.asList("u1", "u2")));
        assertFalse(SILab2.function(new User("u1", "pas1",null), Arrays.asList("u1", "u2")));
        assertFalse(SILab2.function(new User("u1", "pas1","em@out.com"), Arrays.asList("u2", "u3")));
        assertTrue(SILab2.function(new User("u1", "pas1", "em@out.com"), Arrays.asList("u1", "u2")));

        //test slucai za vtoriot if
        assertFalse(SILab2.function(new User("u1", "pas1", "emout.com"), Arrays.asList("u1", "u2")));
        assertFalse(SILab2.function(new User("u1", "pas1", "em@outcom"), Arrays.asList("u1", "u2")));
        assertTrue(SILab2.function(new User("u1", "pas1", "em@out.com"), Arrays.asList("u1", "u2")));

        //test slucai za tretiot if
        assertFalse(SILab2.function(new User("u1", "pas1", "emout.com"), Arrays.asList("u1", "u2")));
        assertFalse(SILab2.function(new User("u1", "pas1", "em@outcom"), Arrays.asList("u1", "u2")));
        assertTrue(SILab2.function(new User("u1", "pas1", "em@out.com"), Arrays.asList("u1", "u2")));
    }

    @Test
    void everyBranch() {
        assertFalse(SILab2.function(null, Arrays.asList("u1", "u2")));
        assertFalse(SILab2.function(new User("u1", "pas1", null), Arrays.asList("u2", "u3")));
        assertFalse(SILab2.function(new User("u1", "pas1", ""), Arrays.asList("u1", "u2")));
        assertTrue(SILab2.function(new User("u1", "pas1", "em@out.com"), Arrays.asList("u1", "u2")));
    }
}