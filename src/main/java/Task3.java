public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        int sum = summ(arr);
        System.out.println(sum);
        System.out.println(findInd(arr, sum));

    }

    public static int summ (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
        }
        return sum;
    }

    public static int findInd(int[] arr, int sum) {
        int arrSize = arr.length-1;
        int leftSum = 0;
        int ind = 0;
        for (int i = 0; i < arrSize; i++) {
            if (i == 0) {
                leftSum =0;
            }else {
                leftSum += arr[i-1];
            }
            if (leftSum * 2 + arr[i] == sum) ind = i;
        }
        return ind;
    }
}
