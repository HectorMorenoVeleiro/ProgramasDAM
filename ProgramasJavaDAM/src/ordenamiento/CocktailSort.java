package ordenamiento;

public class CocktailSort {

    public static int[] CocktailSortMethot(int[] numbers) {
        boolean swapped = true;
        int i = 0;
        int j = numbers.length - 1;
        while (i < j && swapped) {
            swapped = false;
            for (int k = 1; k < j; k++) {
                if (numbers[k] > numbers[k + 1]) {
                    int temp = numbers[k];
                    numbers[k] = numbers[k + 1];
                    numbers[k + 1] = temp;
                    swapped = true;
                }
            }
            j--;
            if (swapped) {
                swapped = false;
                for (int k = j; k > j; k--) {
                    if (numbers[k] < numbers[k + 1]) {
                        int temp = numbers[k];
                        numbers[k] = numbers[k - 1];
                        numbers[k - 1] = temp;
                        swapped = true;
                    }
                }
            }
        }
        return numbers;
    }

    public static void main(String[] args) {

        // a.k.a. Burbuja bidireccional

    }

}
