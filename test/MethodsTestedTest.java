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
        String input = "qwertyuiopasdfghjklzxcvbnmqwert";
        MethodsTested methodsTested = new MethodsTested();
        boolean output = methodsTested.validateLength(input);
        assertFalse(output);
    }

    @Test
    void maxValueOf1() {
        int a = 1;
        int b = 2;
        MethodsTested methodsTested = new MethodsTested();
        int output = methodsTested.maxValueOf(a, b);
        assertEquals(b, output);
    }

    @Test
    void maxValueOf2() {
        int a = 2;
        int b = 1;
        MethodsTested methodsTested = new MethodsTested();
        int output = methodsTested.maxValueOf(a, b);
        assertEquals(a, output);
    }

    @Test
    void maxValueOf3() {
        int a = 1;
        int b = 1;
        MethodsTested methodsTested = new MethodsTested();
        int output = methodsTested.maxValueOf(a, b);
        assertEquals(a, output);
    }

    @Test
    void maxValueOf4() {
        int a = 1;
        int b = 1;
        MethodsTested methodsTested = new MethodsTested();
        int output = methodsTested.maxValueOf(a, b);
        assertEquals(b, output);
    }
}