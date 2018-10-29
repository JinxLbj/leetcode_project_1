/**
 * createby : JinxLbj
 * date : 2018/8/23
 * desc : 在排序数组中查找元素的第一个和最后一个位置
 **/

package com.lbj.explore.normal;

public class NormalMath25 {

    public static void main(String[] args) {
        new NormalMath25().searchRange(new int[]{1, 1, 2}, 1);
    }

    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        if (len == 1) {
            if (nums[0] == target) {
                return new int[]{0, 0};
            } else {
                return new int[]{-1, -1};
            }
        }
        if (len == 2) {
            if (nums[0] == target && nums[1] == target) {
                return new int[]{0, 1};
            } else if (nums[0] == target) {
                return new int[]{0, 0};
            } else if (nums[1] == target) {
                return new int[]{1, 1};
            } else {
                return new int[]{-1, -1};
            }
        }
        int[] result = new int[]{-1, -1};
        int begin = 0;
        int end = len - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (nums[mid] == target) {
                result[0] = mid;
                result[1] = mid;
                if (mid - 1 >= 0 && nums[mid - 1] == target) {
                    result[0] = getLeft(nums, begin, mid, target);
                }
                if (mid + 1 < len && nums[mid + 1] == target) {
                    result[1] = getRight(nums, mid, end, target);
                }
                break;
            } else {
                if (nums[mid] < target) {
                    begin = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return result;
    }

    public int getLeft(int[] nums, int begin, int end, int target) {
        int min = -1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (nums[mid] == target) {
                if (min == -1 || mid < min) {
                    min = mid;
                }
                end = mid - 1;
            } else {
                if (nums[mid] < target) {
                    begin = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return min;
    }

    public int getRight(int[] nums, int begin, int end, int target) {
        int max = -1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (nums[mid] == target) {
                if (max == -1 || max < mid) {
                    max = mid;
                }
                begin = mid + 1;
            } else {
                if (nums[mid] < target) {
                    begin = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return max;
    }

}
