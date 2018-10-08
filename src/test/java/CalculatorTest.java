import org.junit.*;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        Assert.assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void canSubtract() {
        Assert.assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    public void canMultiply() {
        Assert.assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void canDivide() {
        Assert.assertEquals(2, calculator.divide(6, 3));
    }

}
