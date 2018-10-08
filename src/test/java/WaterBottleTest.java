import org.junit.*;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume() {
        Assert.assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canDrink() {
        waterBottle.drink();
        Assert.assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void canEmpty() {
        waterBottle.empty();
        Assert.assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canFill() {
        waterBottle.empty();
        waterBottle.fill();
        Assert.assertEquals(100, waterBottle.getVolume());
    }

}

