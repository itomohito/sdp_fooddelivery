import categories_realz.Cousine_realz.PanAsian;
import categories_realz.Meal_realz.Dinner;
import categories_realz.Taste_realz.Sweet;
import categories_realz.Type_realz.Hotmeal;

public class Plov extends FOOD{
    @Override
    public void display() {
        System.out.println("If you want to order Plov, " +
                "you should know next description of it");
        System.out.println(" " + new PanAsian().cousine() + "\n" +
                " " + new Dinner().meal() + "\n" +
                " " + new Sweet().taste() + "\n" +
                " " +   new Hotmeal().type());
    }
}
