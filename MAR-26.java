class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int count=0;
        int current=0;
        int step=0;
        for(int i=0;i<n-1;i++){
           count=Math.max(count,i+nums[i]);

         if(i==current){
            step=step+1;
            current=count;
         }

        }
       
        return step;

   }
}
