package algorithm.MaxSubSum;
//分治法计算最大子序列和

public class MaxSubSum3 {
    private static int max3(int a,int b, int c){
        int temp = Math.max(a,b);
        return Math.max(temp,c);
    }

    private static int maxSumRec(int[] array,int left,int right){
        if(left == right)
            return array[left] > 0 ? array[left] : 0;

        int center = (left + right)>>1;
        int maxLeftSum = maxSumRec(array,left,center);
        int maxRightSum = maxSumRec(array,center,right);

        int maxLeftBorderSum = 0, curLeftBorderSum = 0;
            for(int i = center; i >= left; i--){
                curLeftBorderSum += array[i];
                if(curLeftBorderSum > maxLeftBorderSum){
                    maxLeftBorderSum = curLeftBorderSum;
                }
            }

        int maxRightBorderSum =0, curRightBorderSum =0;
            for(int i = center+1; i <=right; i++){
                curRightBorderSum += array[i];
                if(curRightBorderSum > maxRightBorderSum){
                    maxRightBorderSum = curRightBorderSum;
                }
            }

        return max3(maxLeftSum,maxRightSum,maxLeftBorderSum+maxRightBorderSum);
    }

    public static int maxSum(int[] array){
        return maxSumRec(array,0,array.length-1);
    }

    public static void main(String[] args) {
        int[] array = new int[]{4,-3,5,-2,-1,2,6,-2};
        long startTime = System.nanoTime();
        System.out.println(MaxSubSum3.maxSum(array));
        long endTime = System.nanoTime();
        System.out.println("time"+(endTime - startTime));
    }
}
