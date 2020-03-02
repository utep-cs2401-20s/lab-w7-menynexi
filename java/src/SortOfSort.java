public class SortOfSort{
    public static int SortOfSortCount;

    public static void SortOfSort(int[] arr){
        SortOfSortCount = 0;
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        int max = arr[firstIndex];


        while(SortOfSortCount != arr.length){

            for(int i = firstIndex; i < lastIndex; i++){
                   if(max < arr[i]){
                       max = arr[i];
                   }
            }
            if(){

            }
            else{

            }
            SortOfSortCount++;
        }




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
}