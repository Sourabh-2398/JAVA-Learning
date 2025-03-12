package Practice;

public class MAxPointsFromCard {

    public static int maxScore(int[] cardPoints, int k) {
        int lsum=0,rsum=0,sum=0;
        int left=0,right =k-1;
        int n=cardPoints.length;
        int maxSum= Integer.MIN_VALUE;
        for(int i=left;i<=right;i++){
            lsum+=cardPoints[i];
        }
        System.out.println("lsum outside loop" + lsum);
        left=k-1;
        right=n-1;
        sum=lsum;
        maxSum= Math.max(sum,maxSum);
        for(int i=0;i<k;i++){
            lsum=lsum-cardPoints[left--];
            System.out.println("lsum " + lsum);
            rsum=rsum+cardPoints[right--];
            System.out.println("rsum " + rsum);
            sum=lsum+rsum;
            System.out.println("sum " + sum);
            maxSum= Math.max(sum,maxSum);
            System.out.println("maxSum " + maxSum);
        }
        return maxSum;
    }
}
