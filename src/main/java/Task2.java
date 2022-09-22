public class Task2 {
    public static void main(String[] args) {
        int [] arr = {1, 1, 1, 0, 1, 1, 1, 1};
        findMaxPeriod(arr);
    }
    public static void findMaxPeriod(int[] arr) {
        int count = 0;
        int max = 0;

        for (int j : arr) {
            if (j == 1) {
                count++;
                if (max < count) max = count;

            } else count = 0;

        }
        System.out.println(max);

    }

}
