import categories_realz.Cousine_realz.European;
import categories_realz.Meal_realz.Lunch;
import categories_realz.Taste_realz.Amateur;
import categories_realz.Type_realz.Hotmeal;

public class Pasta extends FOOD{
    @Override
    public void display() {
        System.out.println("If you want to order Pasta, " +
                "you should know next description of it");
        System.out.println( " " + new European().cousine() + "\n" +
                " " + new Lunch().meal() + "\n" +
                " " +  new Amateur().taste() + "\n" +
                " " + new Hotmeal().type());
    }
}
