import java.util.*;

public class Chocolatedis {


    public static int chocolateDis(ArrayList<Integer>nums, int m){
       Collections.sort(nums);
       int ans = Integer.MAX_VALUE;
       int j= m-1;
       for(int i=0; i<nums.size()&&j<nums.size(); i++){
         ans = Math.min(ans, nums.get(j)-nums.get(i));
         j++;
       }
       return ans;
    }

    public static void main(String args[]){
       ArrayList<Integer> nums = new ArrayList<Integer>();
       nums.add(3);
       nums.add(4);
       nums.add(1);
       nums.add(9);
       nums.add(56);
       nums.add(7);
       nums.add(9);
       nums.add(12);
       int m = 5;
       int ans = chocolateDis(nums, m);
       System.out.println(ans);
    }
}