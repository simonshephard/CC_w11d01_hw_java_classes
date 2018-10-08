import org.junit.*;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 100);
    }

    @Test
    public void hasPaperLeft() {
        Assert.assertEquals(100, printer.getPaperLeft());
    }

    @Test
    public void hasTonerVolume() {
        Assert.assertEquals(100, printer.getTonerVolume());
    }

    @Test
    public void canPrint() {
        printer.print(20, 3);
        Assert.assertEquals(40, printer.getPaperLeft());
        Assert.assertEquals(40, printer.getTonerVolume());
    }

    @Test
    public void canRefill() {
        printer.print(20, 3);
        printer.refill();
        Assert.assertEquals(100, printer.getPaperLeft());
        Assert.assertEquals(100, printer.getTonerVolume());
    }

}
