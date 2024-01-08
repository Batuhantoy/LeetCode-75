public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int maxArea=0,l=0,r=height.length-1;
        while(l<r){
            int temp=(r-l)*Math.min(height[l],height[r]);//(height[l]>height[r]?height[r]:height[l])

            if(temp>maxArea)maxArea=temp; // Much faster than using Math.max()
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;

        /*int maxArea=0,l=0,r=height.length-1;

        while(l<r){
            maxArea = Math.max(maxArea,(r-l)*Math.min(height[l],height[r]));
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;*/
    }

}
