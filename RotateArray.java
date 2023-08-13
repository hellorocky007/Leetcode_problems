import java.util.*;
public class RotateArray {
    public static void rotateArray(int nums[],int k){
        int n = nums.length;
           k = k%n;
           int j=0;
           for(int i=0;i<n;i++){
            if(i<k){
              System.out.print(nums[n+i-k]+" ");
                
            }else{
                
                System.out.print(nums[i-k]+" ");
            }
           }
          
        
    }
    public static void main(String[] args) {
        int nums[] ={2,3,6,7,8,3};
        int key = 3;
      rotateArray(nums, key);
    }
}


// class Solution {
//     public void reverse(int[] nums,int start,int end){
//         while(start<end){
//         int temp = nums[start];
//         nums[start]=nums[end];
//         nums[end]=temp;
//         start++;
//         end--;
//         }
//     }
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         k = k%n;
//         reverse(nums,0,n-1);
//         reverse(nums,0,k-1);
//         reverse(nums,k,n-1);

//     }
// }
