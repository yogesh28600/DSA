package assignments.arrays;

import java.util.*;


//6. [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)
public class kidswithCandies {

    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        List<Boolean> isMax=new ArrayList<>();
        isMax = kidsWithCandies(candies,extraCandies);
        System.out.println(isMax);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> isMax=new ArrayList<Boolean>();
        int max=findMax(candies);
        for (int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max){
                isMax.add(true);
            }else{
                isMax.add(false);
            }
        }
        return isMax;
    }

    static int findMax(int[] candies){
        int max=candies[0];
        for (int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        return max;
    }
}
