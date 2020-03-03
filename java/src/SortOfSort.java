public class SortOfSort{



    public static void sortOfSort(int[] arr) {
        int SortOfSortCount = 0;
        int counterA = 2;
        int counterB = 2;
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (SortOfSortCount < arr.length - 1) {
            int max = arr[firstIndex];
            int maxIndex = firstIndex;
            int temp;

            for (int i = firstIndex; i <= lastIndex; ++i) {
                if (max < arr[i]){
                    maxIndex = i;
                    max = arr[i];
                }
            }

            if (counterA != 0) {
                temp = arr[lastIndex];
                arr[lastIndex] = max;
                arr[maxIndex] = temp;
                lastIndex = lastIndex - 1;
                counterA--;
                if (counterA == 0) {
                    counterB = 2;
                }
            }

            else{
                temp = arr[firstIndex];
                arr[firstIndex] = max;
                arr[maxIndex] = temp;
                firstIndex++;
                counterB--;
                if (counterB == 0) {
                    counterA = 2;
                }
            }

            SortOfSortCount++;
            print(arr);
        }
    }

    public  static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args){
        int[] arr = {7, 8, 6, 9, 3};
        //sortOfSort(arr);
    }

}
