import java.util.Scanner;

public class countInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the range minimum: ");
        int rangeMin = scanner.nextInt();
        System.out.print("Enter the range maximum: ");
        int rangeMax = scanner.nextInt();

        int count = countInRange(nums, rangeMin, rangeMax);
        System.out.println("Count of elements between " + rangeMin + " and " + rangeMax + ": " + count);

        scanner.close();
    }

    public static int findMin(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int countInRange(int[] nums, int min, int max) {
        int count = 0;
        for (int num : nums) {
            if (num >= min && num <= max) {
                count++;
            }
        }
        return count;
    }
}
