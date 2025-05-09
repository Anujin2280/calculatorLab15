package labxx.sict.must.edu.mn;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    Multiplication mul = new Multiplication();

    @Test
    void testMultiplyPositive() {
        assertEquals(20.0, mul.multiply(4, 5));
    }

    @Test
    void testMultiplyByZero() {
        assertEquals(0.0, mul.multiply(4, 0));
        assertEquals(0.0, mul.multiply(0, 100));
        // assertEquals(0.0, mul.multiply(0, 100));
    }
}
