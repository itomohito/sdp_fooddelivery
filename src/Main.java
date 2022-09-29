import categories_realz.*;
import categories_realz.Meal_realz.*;
import categories_realz.Taste_realz.*;
import categories_realz.Type_realz.*;
import categories_realz.Cousine_realz.*;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Hello! Welcome to our Food recommendation system!\n"  +
                "You have to choose certain food description that we're offering you.\n" +
                "If you don't know what you actually want, trust our programme and lets start our journey!");
        FOOD food = new FOOD() {@Override public void display(){

        } };
        String[] foodDescription = new String[4];

        while(true) {
            /*Choosing the cousine*/
            System.out.println("\n" +
                    "First description is related to the cousine of the food\n" +
                    "Read all the variants and enter the name of the one, that ypu are craving\n" +
                    " European, NorthAmerican, PanAsian or SouthAmerican\n");
            String cousine = scan.nextLine();
            if (Objects.equals(cousine, "European")) {
                foodDescription[0] = new European().cousine();}
            else if (Objects.equals(cousine, "NorthAmerican")) {
                foodDescription[0] = new MorthAmerican().cousine();}
            else if (Objects.equals(cousine, "PanAsian")) {
                foodDescription[0] = new PanAsian().cousine();
            } else if (Objects.equals(cousine, "SouthAmerican")) {
                foodDescription[0] = new SouthAmerican().cousine();
            } else System.out.println("We don't have any food from this cousine, Please Try again");
           /*Choosing meal*/
            System.out.println("\n" +
                    "Second description is related to the meal time of the food\n" +
                    "Read all the variants and enter the name of the one, that ypu are craving\n" +
                    " Breakfast, Lunch, Dinner or Snack\n");
            String meal = scan.nextLine();
            if (Objects.equals(meal, "Breakfast")) {
                foodDescription[1] = new Breakfast().meal();
            } else if (Objects.equals(meal, "Lunch")) {
                foodDescription[1] = new Lunch().meal();
            } else if (Objects.equals(meal, "Dinner")) {
                foodDescription[1] = new Dinner().meal();
            } else if (Objects.equals(meal, "Snack")) {
                foodDescription[1] = new Snack().meal();
            } else System.out.println("We don't have any food for this type of meal, Please Try again\n");
            /*Taste choosing*/
            System.out.println("\n" +
                    "Third description is related to the meal time of the food\n" +
                    "Read all the variants and enter the name of the one, that ypu are craving\n" +
                    " Amateur, Sour, Spicy or Sweet\n");
            String taste = scan.nextLine();
            if (Objects.equals(taste, "Amateur")) {
                foodDescription[2] = new Amateur().taste();
            } else if (Objects.equals(taste, "Sour")) {
                foodDescription[2] = new Sour().taste();
            } else if (Objects.equals(taste, "Spicy")) {
                foodDescription[2] = new Spicy().taste();
            } else if (Objects.equals(taste, "Sweet")) {
                foodDescription[2] = new Sweet().taste();
            } else System.out.println("We don't have any food of this taste, Please Try again\n");
            /*choosing the type*/
            System.out.println("\n" +
                    "Fourth description is related to the meal time of the food\n" +
                    "Read all the variants and enter the name of the one, that ypu are craving\n" +
                    " Dessert, Fastfood, Hotmeal,ProperNutrtion or Soups\n");
            String type = scan.nextLine();
            if (Objects.equals(type, "Dessert")) {
                foodDescription[3] = new Dessert().type();
            } else if (Objects.equals(type, "Fastfood")) {
                foodDescription[3] = new Fastfood().type();
            } else if (Objects.equals(type, "Hotmeal")) {
                foodDescription[3] = new Hotmeal().type();
            } else if (Objects.equals(type, "ProperNutrition")) {
                foodDescription[3] = new Proper_nutrition().type();
            } else if (Objects.equals(type, "Soups")) {
                foodDescription[3] = new Soups().type();
            }else
            System.out.println("We don't have any food in this category, Please Try again\n");
            break;

        }
        food.choosePositionFromMenu(foodDescription);
        System.out.println("\n" +
                "Hope we helped you to choose food you r craving.");
    }
}
