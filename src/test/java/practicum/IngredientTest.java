package practicum;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class IngredientTest {

    Ingredient ingredient = new Ingredient(IngredientType.FILLING, "something", 100);

    @Test
    public void getIngredientType() {
        Assert.assertEquals(IngredientType.FILLING, ingredient.getType());
    }

    @Test
    public void getIngredientName() {
        Assert.assertEquals("something", ingredient.getName());
    }

    @Test
    public void getIngredientPrice() {
        Assert.assertEquals(100, ingredient.getPrice(), 0);
    }
}
