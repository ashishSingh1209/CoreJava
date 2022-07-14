package Practice;

import java.util.*;

class Solution {
    public static int[] sortEvenOdd(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // Queue for Non-Increasing


        for (int i = 1; i < nums.length; i += 2) {
            pq.add(nums[i]);
        }

        for (int i = 1; i < nums.length; i += 2) {
            nums[i] = pq.remove();
        }

        pq = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i += 2) {
            pq.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i += 2){
            nums[i] = pq.remove();
        }

        return nums;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int ans : sortEvenOdd(a)) {
            System.out.println(ans);
        }
    }
}

