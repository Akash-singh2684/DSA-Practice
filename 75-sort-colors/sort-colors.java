class Solution {
    public void sortColors(int[] nums) {
       int zero = 0;
       int one =0;
       int two=0;
       for(int i : nums){
        if(i == 0){
            zero++;
        }else if(i == 1){
            one++;
        }else{
            two++;
        }
       } 
       for(int j = 0; j < nums.length; j++){
          if(zero >0){
            nums[j] = 0;
            zero--;
          }else if(one > 0){
            nums[j] = 1;
            one--;
          }else if(two >0){
            nums[j] = 2;
            two--;

          }

         }
    }
}