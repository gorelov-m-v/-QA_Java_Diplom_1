package practicum;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class BurgerOtherTest {

    Burger burger = new Burger();
    Ingredient ingredientFirst;
    Ingredient ingredientSecond;


    @Test
    public void addIngredientTest() {
        int before = burger.ingredients.size();
        burger.addIngredient(ingredientFirst);
        int after = burger.ingredients.size();

        Assert.assertEquals(before + 1, after);
    }

    @Test
    public void removeIngredientTest() {
        int before = burger.ingredients.size();
        burger.addIngredient(ingredientFirst);
        burger.removeIngredient(0);
        int after = burger.ingredients.size();

        Assert.assertEquals(before, after);
    }

    @Test
    public void moveIngredientTest() {
        ingredientFirst = new Ingredient(IngredientType.FILLING, "something", 100);
        ingredientSecond =  new Ingredient(IngredientType.SAUCE, "something", 200);
        burger.addIngredient(ingredientFirst);
        burger.addIngredient(ingredientSecond);

        burger.moveIngredient(1,0);
        Assert.assertEquals(ingredientSecond, burger.ingredients.get(0));
    }
}
