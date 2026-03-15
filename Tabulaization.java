import java.util.*;
public class Tabulaization{
public static int frogJump(int[] height){
int i;
int n=height.length;
int[] dp=new int[n];
dp[0]=0;
for(i=1;i<n;i++){
int jump1=dp[i-1]+Math.abs(height[i]-height[i-1]);
int jump2=Integer.MAX_VALUE;
if(i>1){
jump2=dp[i-2]+Math.abs(height[i]-height[i-2]);
}
dp[i]=Math.min(jump1,jump2);
}
return dp[i];
}
public static void main(String[] args){
int[] height={10,20,30,10};
System.out.println(frogJump(height));
}
}
