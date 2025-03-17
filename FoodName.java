class FoodName {
    static String[] foodNames;
    static int index = 0;

    public static void displayFoodNames() {
        System.out.println("Saved Food Names:");
        for (String food : foodNames) {
            if (food != null) {
                System.out.println(food);
            }
        }
    }

    public static boolean searchFood(String foodName) {
        for (int i = 0; i < index; i++) {
            if (foodNames[i] != null && foodNames[i].equalsIgnoreCase(foodName)) {
                System.out.println("Food found: " + foodName);
                return true;
            }
        }
        return false;
    }
    public static void delete(String foodname){
        for(int i=0;i<foodNames.length;i++){
            if(foodname==foodNames[i]){
                foodNames[i]=null;
                System.out.println("deleted successfully");

            }
        }

    }
 public static void update(String foodname){
        for(int i=0;i<foodNames.length;i++){
            if(foodname==foodNames[i]){
                foodNames[i]="Burger";
                System.out.println("updated successfully");

            }
        }

    }
    public static void saveFood(String foodName) {
        if (foodNames != null) {
            if (searchFood(foodName)) {
                System.out.println("Food name already exists: "+ foodName);
            } else if (index < foodNames.length) {
                foodNames[index] = foodName;
                index++;
                System.out.println("Food name saved successfully: " + foodName);
            } else {
                System.out.println("Food list is full, cannot save: " + foodName);
            }
        } else {
            System.out.println("Food storage is not initialized.");
                                        }
                }
}