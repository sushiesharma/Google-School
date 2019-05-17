/*
Consider the leftmost and righmost appearances of some value in an array. 
We'll say that the "span" is the number of elements between the two inclusive.
A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)


maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6

*/
public int maxSpan(int[] nums) {
  
  if(nums == null || nums.length == 0)
    return 0;
  if(nums.length == 1)
    return 1;
  
  
  int maxSpan = Integer.MIN_VALUE,span = Integer.MIN_VALUE;
  
  for(int i=0; i<nums.length ; i++){
    span = lastIndexOf(nums,nums[i]) - i + 1;
    maxSpan = span > maxSpan ? span : maxSpan;
  }
  
  return maxSpan;
}
  
  private int lastIndexOf(int[] nums, int item){
    
    for(int i=nums.length-1 ; i>=0; i--){
     if(nums[i] == item)
       return i;
  }
    return -1;
  }
