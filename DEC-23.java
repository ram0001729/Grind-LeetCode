class Solution {
    public int maxArea(int[] height) {
        int f=0;
         int maxwater=0;
        int l=height.length-1;
        while(f<l){
         int length=Math.min(height[f],height[l]);
            int width=l-f;
            int insidewater=width*length;
             maxwater=Math.max(maxwater,insidewater);
           if(height[f]<height[l]){
            f=f+1;
          }else{
            l=l-1;

          }
          
        }
        return maxwater;
    }
}
