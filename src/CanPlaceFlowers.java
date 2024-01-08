

// Using two pointers to check if we can plant the point
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(flowerbed.length == 0 || n<=0){return true;}
        for(int i=0; i<flowerbed.length;i++){
            if(flowerbed[i] == 1){
                continue;
            }
            int before = (i==0) ? 0 : flowerbed[i-1]; //Array start from 0
            int after = (i==flowerbed.length-1) ? 0 : flowerbed[i+1]; ////Array bound flowerbed.length
            if(before==0 && after==0){
                flowerbed[i] = 1;
                n--;
            }
            if(n<=0){
                return true;
            }
        }
        return false;
    }
}
