package main.java.ru.asteises;

// Дан отсортированный массив и число, необходимо найти индекс в массиве в котором лежит заданное число;
// Решить задачу с помощью бинарного поиска;
public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 9, 12, 13, 19};
        System.out.println("Solution1: " + solution1(nums, 13, 0, nums.length - 1));

        System.out.println("Solution2: " + solution2(nums, 6, 0, nums.length - 1));

    }

    public static Integer solution1(int[] nums, int k, int leftIndex, int rightIndex) {
        if (nums[leftIndex] == k) {
            return leftIndex;
        } else if (nums[rightIndex] == k) {
            return rightIndex;
        }

        int middleIndex = (leftIndex + rightIndex) / 2;

        if (nums[middleIndex] < k) {
            // Продолжить искать справа
            return solution1(nums, k, middleIndex, rightIndex);
        }
        if (nums[middleIndex] > k) {
            // Продолжить искать слева
            return solution1(nums, k, leftIndex, middleIndex);
        }
        return middleIndex;
    }

    public static Integer solution2(int[] nums, int k, int leftIndex, int rightIndex) {
        if (nums[leftIndex] == k) {
            return leftIndex;
        } else if (nums[rightIndex] == k) {
            return rightIndex;
        }
        while (leftIndex <= rightIndex) {

            int midIndex = (leftIndex + rightIndex) / 2;

            if (nums[midIndex] == k) {
                return midIndex;

            } else if (nums[midIndex] < k) {
                // Продолжить искать справа
                leftIndex = midIndex;
            } else if (nums[midIndex] > k) {
                // Продолжить искать слева
                rightIndex = midIndex;
            }
        }
        return null;
    }
}
