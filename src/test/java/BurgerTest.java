import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    private final float bunPrice;
    private final float ingredientPrice;
    private final float expectedPrice;


    public BurgerTest(float bunPrice, float ingredientPrice, float expectedPrice) {
        this.bunPrice = bunPrice;
        this.ingredientPrice = ingredientPrice;
        this.expectedPrice = expectedPrice;
    }

    @Parameterized.Parameters
    public static Object[][] getPriceData() {
        return new Object[][]{  {  0,   0,   0},
                                {  0, 100, 100},
                                {100,   0, 200},
                                {100, 100, 400},
        };

    }
}

