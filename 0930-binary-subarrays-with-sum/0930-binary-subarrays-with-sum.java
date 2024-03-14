class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> hmap = new HashMap<>(); 

        int n = nums.length; 
        int count = 0; 
        int sum = 0;

        hmap.put(0,1);

        for(int i=0; i<n; i++) {
            sum = sum + nums[i]; 

            if(hmap.containsKey(sum-goal)) {
                count = count + hmap.get(sum-goal);
            } 
            if(hmap.containsKey(sum)) {
                hmap.put(sum, hmap.get(sum)+1);
            } else {
                hmap.put(sum,1);
            }
        }
        
        return count;
    }
}