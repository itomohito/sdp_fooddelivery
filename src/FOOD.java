import categories_realz.*;
import categories_realz.Meal_realz.*;
import categories_realz.Taste_realz.*;
import categories_realz.Type_realz.*;
import categories_realz.Cousine_realz.*;

public abstract class FOOD {

    public abstract void display();

    public CousineCategory cousineCategory;
    public MealCategory mealCategory;
    public TasteCategory tasteCategory;
    public TypeCategory typeCategory;

    public void choosePositionFromMenu(String[] position) {
        if (position[0].equals(new European().cousine()) &&
                position[1].equals(new Breakfast().meal()) &&
                position[2].equals(new Amateur().taste()) &&
                position[3].equals(new Proper_nutrition().type()))
            new AocadoToast().display();
        else if
        (position[0].equals(new MorthAmerican().cousine()) &&
                        position[1].equals(new Lunch().meal()) &&
                        position[2].equals(new Sweet().taste()) &&
                        position[3].equals(new Dessert().type()))
            new Brownie().display();
        else if
        (position[0].equals(new European().cousine()) &&
                        position[1].equals(new Lunch().meal()) &&
                        position[2].equals(new Amateur().taste()) &&
                        position[3].equals(new Hotmeal().type()))
            new Pasta().display();
        else if
        (position[0].equals(new PanAsian().cousine()) &&
                        position[1].equals(new Dinner().meal()) &&
                        position[2].equals(new Sweet().taste()) &&
                        position[3].equals(new Hotmeal().type()))
            new Plov().display();
        else
            System.out.println("This position is not in our menu. Please try again");
    }

    public void setCousineCategory(CousineCategory cousineCategory){
        this.cousineCategory = cousineCategory;}
    public String getCousineCategory() { return this.cousineCategory.cousine();}

    public void setMealCategory(MealCategory mealCategory){
        this.mealCategory = mealCategory;}
    public String getMealCategory() { return this.mealCategory.meal();}

    public void setTasteCategory(TasteCategory tasteCategory){
        this.tasteCategory = tasteCategory;}
    public String getTasteCategory() { return this.tasteCategory.taste();}

    public void setTypeCategory(TypeCategory typeCategory){
        this.typeCategory = typeCategory;}
    public String getTypeCategory() { return this.typeCategory.type();}

}
