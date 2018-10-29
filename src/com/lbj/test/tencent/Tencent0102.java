/**
 * createby : JinxLbj
 * date : 2018/9/12
 * desc : 两个排序数组的中位数
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。
 * <p>
 * 请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。
 * <p>
 * 你可以假设 nums1 和 nums2 不同时为空。
 **/

package com.lbj.test.tencent;

public class Tencent0102 {

    public static void main(String[] args) {
        double d = new Tencent0102().findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
        System.out.println(d);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1length = nums1.length;
        int nums2length = nums2.length;
        int sumlength = nums1length + nums2length;
        int k = sumlength / 2;
        int cut1 = nums1.length / 2;
        int cut2 = k - cut1;
        while (nums1[cut1 - 1] > nums2[cut2]) {
            cut1--;
            cut2++;
            if (cut1 == 0) {
                if (nums2length >= k) {
                    if (sumlength % 2 == 0) {
                        int r1 = nums2[k - 1];
                        if (nums1length >= k + 1) {
                            int r2 = nums2[k];
                            return ((double) r1 + (double) r2) / 2;
                        } else {
                            int r2 = nums1[0];
                            return ((double) r1 + (double) r2) / 2;
                        }
                    } else {
                        int r1 = nums2[k - 1];
                        return (double) r1;
                    }
                } else {
                    if (sumlength % 2 == 0) {
                        int r1 = nums1[k - nums1length - 1];
                        int r2 = nums1[k - nums1length];
                        return ((double) r1 + (double) r2) / 2;
                    } else {
                        return nums1[k - nums1length - 1];
                    }
                }
            }
        }
        while (nums2[cut2 - 1] > nums1[cut1]) {
            cut1++;
            cut2--;
            if (cut2 == 0) {
                if (nums1length >= k) {
                    if (sumlength % 2 == 0) {
                        int r1 = nums1[k - 1];
                        if (nums1length >= k + 1) {
                            int r2 = nums1[k];
                            return ((double) r1 + (double) r2) / 2;
                        } else {
                            int r2 = nums2[0];
                            return ((double) r1 + (double) r2) / 2;
                        }
                    } else {
                        int r1 = nums1[k - 1];
                        return (double) r1;
                    }
                } else {
                    if (sumlength % 2 == 0) {
                        int r1 = nums2[k - nums1length - 1];
                        int r2 = nums2[k - nums1length];
                        return ((double) r1 + (double) r2) / 2;
                    } else {
                        return nums2[k - nums1length - 1];
                    }
                }
            }
        }
        if (sumlength % 2 == 0) {
            return ((double) Math.max(nums1[cut1 - 1], nums2[cut2 - 1]) + (double) Math.min(nums1[cut1], nums2[cut2])) / 2;
        } else {
            return (double) Math.max(nums1[cut1 - 1], nums2[cut2 - 1]);
        }

    }
}
