public class maximumarray{
    public static void main(String[] args){
        int arr[] = {1, 2, 4, 8};
        int max = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                remove(max);
            }
        }
        System.out.println(max);
    }
}