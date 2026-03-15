public class Knapsack {
		static int knapsack(int index,int capacity,int[] weight,int[] value) {
			if(index==0)
			{
				if(weight[0]<=capacity)
				{
					return value[0];
				}
				return 0;
			}
			int  notTake=knapsack(index-1,capacity,weight,value);
			int take=Integer.MIN_VALUE;
			if(weight[index]<=capacity) {
				take=value[index]+knapsack(index-1,capacity-weight[index],weight,value);
			}
			return Math.max(take, notTake);
			}
		public static void main(String args[])
		{
			 int[] weight = {1, 2, 4, 2};
		        int[] value = {30, 60, 70, 10};
		        int capacity = 5;
		        int n = weight.length;

		        int result = knapsack(n - 1, capacity, weight, value);

		        System.out.println("Maximum value = " + result);
		}
		
}
