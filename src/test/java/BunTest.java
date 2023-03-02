import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class BunTest {

    @Test
    public void getBunName() {
        Bun bun = new Bun("testBun", 100);
        Assert.assertEquals("testBun", bun.getName());
    }

    @Test
    public void getBunPrice() {
        Bun bun = new Bun("testBun", 100);
        Assert.assertEquals(100, bun.getPrice(), 0);
    }
}
