//Time complexity : O(n)

public class TrappedRainWater {
    
    public static int calcTrappedWater(int height[]) {
        int n = height.length;

        //Calculate left boundary
        int left_bound[] = new int[n];
        left_bound[0] = height[0];
        for(int i=1;i<n;i++) {
            left_bound[i] = Math.max(height[i], left_bound[i-1]);
        }
        //Calculate right boundary
        int right_bound[] = new int[n];
        right_bound[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--) {
            right_bound[i] = Math.max(height[i], right_bound[i+1]);
        }

        int water = 0;
        //loop
        for(int i=0;i<n;i++) {
            //calculate waterlevel
            int waterlevel = Math.min(left_bound[i],right_bound[i]);

            //calculate trapped water
            water += waterlevel - height[i];
        }

        return water;


    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped water : "+calcTrappedWater(arr));
    }
}
