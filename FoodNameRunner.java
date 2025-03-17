public class FoodNameRunner {
    public static void main(String[] args) {
        FoodName.saveFood("Pizza");
        FoodName.saveFood("Burger");
        FoodName.saveFood("Pizza");  
        FoodName.saveFood("Pasta");
        FoodName.saveFood("Fries");
         

        FoodName.displayFoodNames();
        FoodName.delete("Pizza");
        FoodName.update("idly");

        boolean found = FoodName.searchFood("Burger");
        System.out.println("Search result: " +found);
                        }
}