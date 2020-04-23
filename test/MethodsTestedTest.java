import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTestedTest {

    @Test
    void validateLength1() {
        String input = "";
        MethodsTested methodsTested = new MethodsTested();
        boolean output = methodsTested.validateLength(input);
        assertFalse(output);
    }

    @Test
    void validateLength2() {
        String input = "test";
        MethodsTested methodsTested = new MethodsTested();
        boolean output = methodsTested.validateLength(input);
        assertTrue(output);
    }

    @Test
    void validateLength3() {
        String input = "qwertyuiopasdfghjklzxcvbnmqwertyu";
        MethodsTested methodsTested = new MethodsTested();
        boolean output = methodsTested.validateLength(input);
        assertFalse(output);
    }
}