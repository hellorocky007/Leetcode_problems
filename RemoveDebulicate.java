import java.util.*;
public class RemoveDebulicate {
    public static int removeDebulicate(int nums[]){
       int k=0;
       int count=0;
       for(int i=1;i<nums.length;i++){
             if(nums[i]==nums[i-1]){
               count++;
                }else{
                    count=0;
                }

                if(count<2){
                    nums[k]=nums[i];
                    System.out.println(nums[k]);
                    k=k+1;
                }
             }
       
       return k;
    }
    public static void main(String[] args) {
        int[] nums ={0,0,1,1,1,1,2,3,3};
        System.out.println(removeDebulicate(nums));
    }
} 
