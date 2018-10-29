/**
 * createby : lbj
 * date : 2018/7/26
 * desc :
 **/

package com.lbj.explore.easy;

public class Math32 {

    public static void main(String[] args) {
        int[] a = new int[]{ 0};
        new Math32().merge(a, 0, new int[]{1}, 1);
        System.out.println(a);
    }

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        if(m == 0){
//            nums1 = nums2;
//            return;
//        }
//        int nums1Length = nums1.length;
//        int nums2Length = nums2.length;
//        int index1 = 0;
//        int index2 = 0;
//        while (index2 < nums2Length && index1 + 1 < nums1Length) {
//            if (nums1[index1] > nums2[index2]) {
//                for (int i = nums1Length - nums2Length + index2; i > index1; i--) {
//                    int t = nums1[i];
//                    nums1[i] = nums1[i - 1];
//                    nums1[i - 1] = t;
//                }
//                nums1[index1] = nums2[index2];
//                index2++;
//                if (index1 >= m && nums1[index1 + 1] < nums2[index2]) {
//                    break;
//                }
//                index1++;
//            } else {
//                if (index1 >= m && nums1[index1 + 1] < nums2[index2]) {
//                    break;
//                }
//                index1++;
//            }
//        }
//        System.arraycopy(nums2, index2, nums1, nums1Length - nums2Length + index2, nums2Length - index2);
//    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            System.arraycopy(nums2,0,nums1,0,n);
            return;
        }
        System.arraycopy(nums2, 0, nums1, m, n);
        int[] copy = new int[nums1.length];
        System.arraycopy(nums1, 0, copy, 0, nums1.length);
        for (int i = 0; i < nums1.length; i++) {
            int location = -1;
            int MIN = nums1[i];
            for (int j = i + 1; j < nums1.length; j++) {
                if(MIN > nums1[j]){
                    MIN = nums1[j];
                    location = j;
                }
            }
            if(location != -1){
                int t = nums1[i];
                nums1[i] = nums1[location];
                nums1[location] = t;
            }
        }
    }

    //网上方法，较快
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m + n];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < m && j < n)
            if (nums1[i] <= nums2[j])
                nums[index++] = nums1[i++];
            else
                nums[index++] = nums2[j++];

        while (i < m)
            nums[index++] = nums1[i++];
        while (j < n)
            nums[index++] = nums2[j++];

        System.arraycopy(nums, 0, nums1, 0, nums.length);
    }
}
