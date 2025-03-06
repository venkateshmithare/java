public class Numbers1Runner{
	public static void main(String[] args) {
		for (int i = 0; i < NumberOfArray.length - 1; i++) {
            for (int j = 0; j < NumberOfArray.length - 1 - i; j++) {
                if (NumberOfArray[j] > NumberOfArray[j + 1]) {
                    int temp = NumberOfArray[j];
                    NumberOfArray[j] = NumberOfArray[j + 1];
                    NumberOfArray[j + 1] = temp;
                }
            }
        }

	}

}