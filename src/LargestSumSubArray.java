public class LargestSumSubArray {
    public static int LargestSum(int[] array) {
        int size = array.length;
        int maxSum = 0;
        int maxNumber = 0;
        for (int i = 0; i < size; i++) {
            maxSum = maxSum + array[i];
            if (maxSum < 0)
                maxSum = 0;
            else if (maxNumber < maxSum)
                maxNumber = maxSum;
        }
        return maxNumber;
    }
}
