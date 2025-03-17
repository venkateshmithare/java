public class Venkatesh16 {
    public static void foodInfo(String name) {
        System.out.println("Food: " + name);
    }

    public static void foodInfo(String name, int calories) {
        System.out.println("Food: " + name + " : Calories: " + calories);
    }

    public static void foodInfo(String name, String cuisine) {
        System.out.println("Food: " + name + " : Cuisine: " + cuisine);
    }

    public static void foodInfo(String name, String cuisine, boolean isVegetarian) {
        System.out.println("Food: " + name + " : Cuisine: " + cuisine + " : Vegetarian: " + isVegetarian);
    }

    public static void foodInfo(String name, int calories, double price) {
        System.out.println("Food: " + name + " : Calories: " + calories + " : Price: " + price);
    }

    public static void foodInfo(String name, boolean isSpicy) {
        System.out.println("Food: " + name + " : Spicy: " + isSpicy);
    }

    public static void foodInfo(String name, String cuisine, int servings) {
        System.out.println("Food: " + name + " : Cuisine: " + cuisine + " : Servings: " + servings);
    }

    public static void foodInfo(String name, double price, boolean isGlutenFree) {
        System.out.println("Food: " + name + " : Price: " + price + " : Gluten-Free: " + isGlutenFree);
    }

    public static void foodInfo(String name, int calories, String category) {
        System.out.println("Food: " + name + " : Calories: " + calories + " : Category: " + category);
    }

    public static void foodInfo(String name, String cuisine, int servings, double price) {
        System.out.println("Food: " + name + " : Cuisine: " + cuisine + " : Servings: " + servings + " : Price: " + price);
    }
    
    public static void foodInfo(String name, boolean isHealthy, boolean isVegan) {
        System.out.println("Food: " + name + " : Healthy: " + isHealthy + " : Vegan: " + isVegan);
    }
    
    public static void foodInfo(String name, int proteinContent, boolean isKetoFriendly) {
        System.out.println("Food: " + name + " : Protein: " + proteinContent + "g : Keto-Friendly: " + isKetoFriendly);
    }
    
    public static void foodInfo(String name, String countryOfOrigin, double price) {
        System.out.println("Food: " + name + " : Origin: " + countryOfOrigin + " : Price: " + price);
    }
    
    public static void foodInfo(String name, int fatContent, boolean isLowCarb) {
        System.out.println("Food: " + name + " : Fat: " + fatContent + "g : Low-Carb: " + isLowCarb);
    }
    
    public static void foodInfo(String name, String cuisine, String dishType) {
        System.out.println("Food: " + name + " : Cuisine: " + cuisine + " : Dish Type: " + dishType);
    }
    
    public static void foodInfo(String name, int sugarContent, boolean isDiabeticFriendly) {
        System.out.println("Food: " + name + " : Sugar: " + sugarContent + "g : Diabetic-Friendly: " + isDiabeticFriendly);
    }
    
    public static void foodInfo(String name, int fiberContent, String healthBenefit) {
        System.out.println("Food: " + name + " : Fiber: " + fiberContent + "g : Benefit: " + healthBenefit);
    }
    
    public static void foodInfo(String name, int vitaminCContent, boolean boostsImmunity) {
        System.out.println("Food: " + name + " : Vitamin C: " + vitaminCContent + "mg : Boosts Immunity: " + boostsImmunity);
    }
    
    public static void foodInfo(String name, double price, String specialIngredient) {
        System.out.println("Food: " + name + " : Price: " + price + " : Special Ingredient: " + specialIngredient);
    }
    
    public static void main(String[] args) {
        foodInfo("Pasta");
        foodInfo("Pasta", 350);
        foodInfo("Pasta", "Italian");
        foodInfo("Pasta", "Italian", true);
        foodInfo("Pasta", 350, 12.99);
        foodInfo("Pasta", false);
        foodInfo("Pasta", "Italian", 2);
        foodInfo("Pasta", 12.99, true);
        foodInfo("Pasta", 350, "Main Course");
        foodInfo("Pasta", "Italian", 2, 12.99);
        foodInfo("Pasta", true, false);
        foodInfo("Pasta", 20, true);
        foodInfo("Pasta", "Italy", 12.99);
        foodInfo("Pasta", 10, true);
        foodInfo("Pasta", "Italian", "Appetizer");
        foodInfo("Pasta", 5, false);
        foodInfo("Pasta", 8, "Good for digestion");
        foodInfo("Pasta", 30, true);
        foodInfo("Pasta", 15.99, "Truffle oil");
    }
}
