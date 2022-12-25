package main.java.ru.asteises;

// Дан отсортированный массив и число, необходимо найти индекс в массиве в котором лежит заданное число;
// Решить задачу с помощью бинарного поиска;
public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 9, 12, 13, 19};
        solution1(nums, 13, nums.length - 1, 0);
    }

    // TODO Сделать через цикл и элегантно!
    public static Integer solution1(int[] nums, int k, int rightIndex, int leftIndex) {
        int middleIndex = nums.length / 2;
        if (k == nums[rightIndex]) {
            System.out.println(rightIndex);
            return rightIndex;

        } else if (k == nums[leftIndex]) {
            System.out.println(leftIndex);
            return leftIndex;

        } else if (k == nums[middleIndex]) {
            System.out.println(middleIndex);
            return middleIndex;

        } else if (k < nums[middleIndex]) {
            leftIndex--;
            rightIndex = middleIndex - 1;
            solution1(nums, k, rightIndex, leftIndex);
        } else if (k > nums[middleIndex]) {
            rightIndex--;
            leftIndex = middleIndex + 1;
            solution1(nums, k, rightIndex, leftIndex);
        }
        return null;
    }
}
