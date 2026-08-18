class Solution {
    public boolean hasDuplicate(int[] nums) {
    Arrays.sort(nums);
    int c = 0;
    for(int i = 1 ; i < nums.length ; i++)
    {
        if(nums[i-1]==nums[i])c++;
    }
    return c > 0; 
}
}