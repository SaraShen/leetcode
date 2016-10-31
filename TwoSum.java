package leetcode;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
    	int[] result = {-1,-1}; 
        int len = nums.length;
        HashMap <Integer,Integer> map = new HashMap<Integer, Integer>();  
        for(int i = 0; i<len; i++){
        	// Use HashMap save the position message of int[] nums
        	map.put(nums[i], i);
        }
        for(int i = 0; i<len; i++ ){
        	if (map.containsKey(target - nums[i]))
        	{        		
        		int p1 = i;
        		int p2 = map.get(target - nums[i]);
        		if(p1!=p2){// can not be the same position
        			result[0] = p1;
            		result[1] = p2;
            		System.out.println(p1+","+p2);
            		return result;
        		}
        	}
        }
        return null;
    }
    
    public static void main(String[] args){
    	TwoSum T = new TwoSum();
    	int[] n = {3,2,4};
    	int[] r = T.twoSum(n, 6);
    }
}
