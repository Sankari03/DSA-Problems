package Arrays.Easy;

public class MaximumPopulationYear_LC1854 {
    public static void main(String[] args) {
        int [][] arr = {{1993,1999},{2000,2010}};
        System.out.println(maximumPopulation(arr));
    }

    public static int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for(int[] log : logs){
            for(int j = log[0]; j < log[1]; j++){
                arr[j-1950]++;
            }
        }
        int maxYear = 1950; int maxVal = 0;
        for(int i = 0; i < 101; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
                maxYear = i+1950;
            }
        }
        return maxYear;
    }
//OR
//    public int maximumPopulation(int[][] logs) {
//        int[] arr = new int[101];
//        for(int[] log : logs){
//            arr[log[0]-1950]++;
//            arr[log[1]-1950]--;
//        }
//        for(int i = 1; i < 101; i++){ //Running sum
//            arr[i] += arr[i-1];
//        }
//        int maxVal = 0, maxYear = 1950;
//        for(int i = 0; i < 101; i++){
//            if(arr[i]>maxVal){
//                maxVal = arr[i];
//                maxYear = i+1950;
//            }
//        }
//        return maxYear;
//    }
}
