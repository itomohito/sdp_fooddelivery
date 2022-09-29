import categories_realz.Cousine_realz.MorthAmerican;
import categories_realz.Meal_realz.Lunch;
import categories_realz.Taste_realz.Sweet;
import categories_realz.Type_realz.Dessert;

public class Brownie extends FOOD {
    @Override
    public void display() {
        System.out.println("If you want to order Brownie, " +
                "you should know next description of it");
        System.out.println( " " + new MorthAmerican().cousine() + "\n" +
                " " + new Lunch().meal() + "\n" +
                " " + new Sweet().taste() + "\n" +
                " " + new Dessert().type());
    }
}
