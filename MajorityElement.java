
// using boyer-moore majority voting algorithm
import java.util.Scanner;
public class MajorityElement {
     public static int majorityElement(int nums[]){
        int candidate=0;
        int count=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
           if(count==0){
            candidate=nums[i];
           }
           if(candidate==nums[i]){
            count++;
           }else{
            count--;
           }
            
        }

        return candidate;
       
     }
     public static void main(String[] args) {
        int nums[] ={2,2,1,1,1,2,2};
       System.out.println( majorityElement(nums));
     }
}
