import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int positionsToRotate = 8; // Change this to the number of positions you want to rotate

        // Check for negative values
        if (positionsToRotate < 0) {
            System.out.println("Error: Negative positions to rotate");
            return;
        }

        // Handle the case where positionsToRotate is greater than the array length
        int effectiveRotations = positionsToRotate % arr.length;

        // Create a new array to store the rotated elements
        int[] rotatedArray = new int[arr.length];

        // Perform the rotation
        for (int i = 0; i < arr.length; i++) {
            int newPosition = (i + arr.length - effectiveRotations) % arr.length;
            rotatedArray[newPosition] = arr[i];
        }

        // Print the rotated array
        System.out.println(Arrays.toString(rotatedArray));
    }
}
