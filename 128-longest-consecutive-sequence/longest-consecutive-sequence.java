class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0;
        for(int val : nums)
            set.add(val);
        for(int val : nums){
            if(set.contains(val) && !set.contains(val -1)){
                int curr = val;
                int cnt = 0;
                while(set.contains(curr)){
                    set.remove(curr);
                    curr++;
                    cnt++;
                }
                 longest = Math.max(longest , cnt);
            }
        }
       return longest;
    }
}