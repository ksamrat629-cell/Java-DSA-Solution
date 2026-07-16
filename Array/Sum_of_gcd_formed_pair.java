package Array;
// You are given an integer array nums of length n.

// Construct an array prefixGcd where for each index i:

// Let mxi = max(nums[0], nums[1], ..., nums[i]).
// prefixGcd[i] = gcd(nums[i], mxi).
// After constructing prefixGcd:

// Sort prefixGcd in non-decreasing order.
// Form pairs by taking the smallest unpaired element and the largest unpaired element.
// Repeat this process until no more pairs can be formed.
// For each formed pair, compute the gcd of the two elements.
// If n is odd, the middle element in the prefixGcd array remains unpaired and should be ignored.
// Return an integer denoting the sum of the GCD values of all formed pairs.

// The term gcd(a, b) denotes the greatest common divisor of a and b.

import java.util.Arrays;

public class Sum_of_gcd_formed_pair {
    public static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static long gcdSum(int[] nums) {
        long ans = 0;
        int max = Integer.MIN_VALUE;
        int[] prefixGcd = new int[nums.length];


        for(int i= 0; i<nums.length; i++){
            max = Math.max(max , nums[i]);
            prefixGcd[i] = gcd(nums[i] , max);
        }
        Arrays.sort(prefixGcd);

        int left = 0 , right = prefixGcd.length -1;
        while(left < right){
           ans += gcd(prefixGcd[left] , prefixGcd[right]);
            left++;
            right--;
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {2,6,3,8};
        System.out.println(gcdSum(arr));
    }
}
