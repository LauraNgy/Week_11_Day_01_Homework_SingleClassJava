import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void canSubstract() {
        assertEquals(3, calculator.substract(5, 2));
    }

    @Test
    public void canMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void canDivide() {
        assertEquals(4.00, calculator.divide(8, 2), 0.9);
    }
}
