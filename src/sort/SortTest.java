package sort;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/2
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @since
 */
public class SortTest {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 6, 4, 15, 8, 11, 9, 2};

        mergeSort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * 冒泡排序
     *
     * @param nums
     */
    public static void bubbleSort(int[] nums) {
        if (nums == null) return;

        int temp;
        boolean flag = true;
        int size = nums.length;

        for (int i = 0; i < size - 1 && flag; i++) {
            flag = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }

    /**
     * 选择排序
     *
     * @param nums
     */
    public static void selectSort(int[] nums) {
        if (nums == null) return;

        int temp, min, size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }

            if (min != i) {
                temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
    }

    /**
     * 插入排序
     *
     * @param nums
     */
    public static void insertSort(int[] nums) {
        if (nums == null) return;

        int temp, size = nums.length;
        for (int i = 1; i < size; i++) {
            temp = nums[i];
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] > temp) {
                    nums[j + 1] = nums[j];
                } else {
                    nums[j + 1] = temp;
                    break;
                }
            }
        }
    }

    /**
     * 希尔排序
     *
     * @param nums
     */
    public static void shellSort(int[] nums) {
        if (nums == null) return;

        int temp, size = nums.length;
        for (int increment = size / 2; increment >= 1; increment /= 2) {
            for (int i = increment; i < size; i++) {
                temp = nums[i];
                for (int j = i - increment; j >= 0; j -= increment) {
                    if (nums[j] > temp) {
                        nums[j + increment] = nums[j];
                    } else {
                        nums[j + increment] = temp;
                        break;
                    }
                }
            }
        }
    }

    /**
     * 堆排序
     *
     * @param nums
     */
    public static void heapSort(int[] nums) {
        if (nums == null) return;

        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            buildMaxHeap(nums, size - i - 1);
            swap(nums, 0, size - i - 1);
        }
    }

    /**
     * 建立大堆
     *
     * @param nums
     * @param lastIndex
     */
    public static void buildMaxHeap(int[] nums, int lastIndex) {
        for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
            for (int j = i; j * 2 + 1 <= lastIndex; ) {
                int maxIndex = j * 2 + 1;
                //right node > left
                if (maxIndex < lastIndex && nums[maxIndex + 1] > nums[maxIndex]) {
                    maxIndex = maxIndex + 1;
                }
                if (nums[j] < nums[maxIndex]) {
                    swap(nums, j, maxIndex);
                    j = maxIndex;
                } else {
                    break;
                }
            }
        }
    }

    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    /**
     * 快速排序
     *
     * @param nums
     */
    public static void quickSort(int[] nums) {
        if (nums == null) return;

        quick(nums, 0, nums.length - 1);
    }

    /**
     * 快排的一次
     *
     * @param nums
     * @param low
     * @param high
     */
    public static void quick(int[] nums, int low, int high) {
        if (low >= high) return;

        int middle = getMiddle(nums, low, high);
        quick(nums, low, middle - 1);
        quick(nums, middle + 1, high);
    }

    /**
     * 获取中轴
     *
     * @param nums
     * @param low
     * @param high
     * @return
     */
    public static int getMiddle(int[] nums, int low, int high) {
        int temp = nums[low];
        while (low < high) {
            for (; nums[high] >= temp && low < high; high--) ;
            nums[low] = nums[high];
            for (; nums[low] <= temp && low < high; low++) ;
            nums[high] = nums[low];
        }
        nums[low] = temp;
        return low;
    }

    /**
     * 归并排序
     *
     * @param nums
     */
    public static void mergeSort(int[] nums) {
        if (nums == null) return;

        quick(nums, 0, nums.length - 1);
    }

    public static void mergeSort(int[] nums, int low, int high) {
        if (low >= high) return;

        int middle = (low + high) / 2;
        mergeSort(nums, 0, middle - 1);
        mergeSort(nums, middle, nums.length);
        merge(nums, low, middle, high);
    }

    public static void merge(int[] nums, int low, int middle, int high) {
        int[] temp = new int[high - low + 1];
        int i = 0;
        while (low < middle && high >= middle) {
            if (nums[low] < nums[high]) {
                temp[i++] = nums[low++];
            } else {
                temp[i++] = nums[high++];
            }
        }
        while (low < middle) {
            temp[i++] = nums[low++];
        }
        while (high >= middle) {
            temp[i++] = nums[high++];
        }
    }

}
