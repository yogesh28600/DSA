package assignments.arrays;

//4. [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)
public class richestMan {
    public static void main(String[] args) {
        int[][] accounts={{1,2},{3,4},{4,5},{10,10},{4,4}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        return helper(accounts,0,0);

    }

    static int helper(int[][] accounts,int n,int max){
        if(n==accounts.length){
            return max;
        }
        int temp=0;
        for(int i=0;i<accounts[n].length;i++){
            temp += accounts[n][i];
        }
        if(temp>max){
            max=temp;
        }
        return helper(accounts,n+1,max);

    }
}
