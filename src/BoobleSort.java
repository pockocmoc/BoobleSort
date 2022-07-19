//1.1. Реализуйте алгоритм сортировки пузырьком для сортировки массива

public class BoobleSort {
    public static void main(String[] args) {

        int[] array = {3,2,4,0,1,9,6,7,5,8};

       //  System.out.println(testArray.length);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
