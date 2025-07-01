package GreedyApproach;
import java.util.*;
public class Problem1_BuyTwoChocolates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int []arr = new int[n];
    for(int i=0;i<n;i++) {
    	arr[i]=sc.nextInt();
    }
    int money = sc.nextInt();
    System.out.println(buyChoco(arr,money));
    sc.close();
	}
	 public static int buyChoco(int[] prices, int money) {
	        Arrays.sort(prices);
	        int ans = money;
	        int c = 0;
	        for(int i=0;i<prices.length;i++){
	            if(money-prices[i]>=0){
	               c++;
	               money-=prices[i];
	               if(c==2) return money; 
	            }
	        }
	        return ans;
	    }

}
