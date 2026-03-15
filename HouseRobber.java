import java.util.Arrays;
public class HouseRobber {
    public static int rob(int[] house) {
        int[] dp = new int[house.length];
        Arrays.fill(dp, -1);
        return helper(house, 0, dp);
    }
    private static int helper(int[] house, int i, int[] dp){
        if (i >= house.length) {
            return 0;
        }
            if (dp[i] != -1) {
            return dp[i];
        }
        int rob = house[i] + helper(house, i + 2, dp);
        int skip = helper(house, i + 1, dp);
        dp[i] = Math.max(rob, skip);
        return dp[i];
    }
    public static void main(String[] args) {
        int[] house = {2, 7, 9, 3, 1};
        System.out.println(rob(house));  
    }
}