import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class ArraysPractise {
    //Create a function that returns the max integer in an array of integers. For example: 
    // EvaArraysUtils.max([1, 4, 10, 2, 3 ]) -> 10  
    @Contract(pure = true)
    public static int getMax(@NotNull int[] a) {
        int max = a[0];
        for(int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    // Create a function that returns the min integer in an array of integers. For example:
    //  EvaArraysUtils.min([1, 4, 10, 2, 3 ]) -> 1 
    // EvaArraysUtils.min([1, 4, -10, 2, 3 ]) -> -10  
    public static int getMin(@NotNull int[] a) {
        int min = a[0];
        for(int i = 0; i < a.length; i++) {
            if(a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    // Create a function that inserts an integer in a given position of an array of integers:  	 
    // EvaArraysUtils.insertIn(3, 0, [1, 4, 10, 2, 3 ]) -> [3, 1, 4, 10, 2, 3 ]  
    public static double[] insertIn(double number, int position, @NotNull double[] array) {
        double[] newArray = new double[array.length+1];

        for(int i = 0; i < position; i ++) {
            newArray[i] = array[i];
        }
        newArray[position] = number;

        for(int i = (position+1); i < newArray.length; i++) {
            newArray[i] = array[i-1];
        }
        return newArray;
    }

    // Create a function that removes an integer of an array of integers:  
    //  EvaArraysUtils.remove(3, [1, 4, 10, 2, 3 ]) -> [1, 4, 10, 2]
    //  EvaArraysUtils.remove(3, [3, 4, 3, 2, 3 ]) -> [4, 2] 
    //this is very haskell
    public static void remove(int number, @NotNull int[] array) {
        int arrayLength = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] != number){
                arrayLength ++;
            }
        }

        int[] newArray = new int[arrayLength];
        int index = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] != number) {
                newArray[index] = array[i];
                index ++;
            }else {
            }
        }

        for(int i = 0; i <newArray.length; i++) {
            System.out.print(newArray[i]);
        }

        System.out.println();
    }


    public static void main(String[] args) {
//        final int ARRAY_LENGTH = 10;
//        int[] array = new int[ARRAY_LENGTH];
//        for (int i = 0; i < ARRAY_LENGTH; i++) {
//            array[i] = (int)(Math.random()*10);
//            System.out.print(array[i]);
//        }
//        System.out.println();

//        System.out.println(getMax(array));
//        System.out.println(getMin(array));
        //insertIn(3,10, array);
//        remove(3, array);

    }
}
