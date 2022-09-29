import categories_realz.Cousine_realz.European;
import categories_realz.Meal_realz.Breakfast;
import categories_realz.Taste_realz.Amateur;
import categories_realz.Type_realz.Proper_nutrition;

public class AocadoToast extends FOOD{
    @Override
    public void display() {
        System.out.println("If you want to order Avocado toast, " +
                "you should know next description of it");
        System.out.println( " " + new European().cousine() + "\n" +
                " " + new Breakfast().meal() + "\n" +
                " " + new Amateur().taste() + "\n" +
                " " + new Proper_nutrition().type());
    }
}

