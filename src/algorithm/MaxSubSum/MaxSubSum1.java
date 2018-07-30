package algorithm.MaxSubSum;

public class MaxSubSum1 {
    public static int maxSum(int[] array) {
        int maxSubSum = 0;
        for(int i = 0;i< array.length;i++){
            int curSum = 0;
            for(int j=i;j<array.length;j++){


                    curSum += array[j];
                    if(curSum > maxSubSum){
                        maxSubSum = curSum;
                    }

            }
        }
        return maxSubSum;
    }

    public static void main(String[] args) {
        int[] array = new int[]{4,-3,5,-2,-1,2,6,-2};
        long startTime = System.nanoTime();
        System.out.println(maxSum(array));
        long endTime = System.nanoTime();
        System.out.println("time:"+(endTime-startTime));
    }
}
