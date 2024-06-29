package lt.techin.pvz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalcTest {

    Calc calc;

    @BeforeEach
    void setup() {
        calc = new Calc();
    }


    @Test
    void testSum() {

        int actualResult = calc.sum(2, 2);

        int expected = 4;

        assertEquals(expected, actualResult);

        actualResult = calc.sum(2, 3);

        expected = 5;

        assertEquals(expected, actualResult, "2 + 3 should be 5");

        assertEquals(6, calc.sum(3, 3));

    }

    @Test
    void testMultiply() {
        assertEquals(2, 4);
    }
}
