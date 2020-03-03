public class SortOfSort {
    public static int SortOfSortCount;

    public static void sortOfSort(int[] arr) {
        SortOfSortCount = 0;
        int counterA = 2;
        int counterB = 2;
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (SortOfSortCount < arr.length - 1) {
            int max = arr[firstIndex];
            int maxIndex = firstIndex;
            int temp;

            for (int i = firstIndex; i <= lastIndex; ++i) {
                //System.out.println("I have cheacked this value" + arr[i] + " it is not more than " + max);
                if (max < arr[i]){
                    maxIndex = i;
                    max = arr[i];
                    //System.out.println("this is the index of the max value " + maxIndex);
                    //System.out.println("The max value is " + max);
                }
            }

            if (counterA != 0) {
                //System.out.println("This came here once");
                temp = arr[lastIndex];
                arr[lastIndex] = max;
                arr[maxIndex] = temp;
                lastIndex = lastIndex - 1;
                //make a flag methad that woks better I think flags will work
                counterA--;
                if (counterA == 0) {
                    counterB = 2;
                }
            }

            else{
                temp = arr[firstIndex];
                arr[firstIndex] = max;
                arr[maxIndex] = temp;

                //System.out.println("This is the temp " + temp);
                //System.out.println("This is the arr[firstIndex] " + arr[firstIndex] + " And this is its index " + firstIndex);
                //System.out.println("This is the value of arr[maxIndex]" + arr[maxIndex] + " and thi sis its index " + maxIndex);
                firstIndex++;
                counterB--;
                if (counterB == 0) {
                    counterA = 2;
                }
            }

            SortOfSortCount++;
            print(arr);
            //System.out.println(counterA);
            //System.out.println(counterB);
            //System.out.println(lastIndex);
            //System.out.println(firstIndex);
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }


    /* public static void main(String[] args){ //I used this as my first test case instead of creating  an new file
        int[] arr = {7, 8, 6, 9, 3};
        sortOfSort(arr);
    } */
}
   /* public static int greatest(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }*/
