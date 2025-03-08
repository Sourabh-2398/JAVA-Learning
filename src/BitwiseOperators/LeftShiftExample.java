package BitwiseOperators;

public class LeftShiftExample {
    public static void main(String[] args) {
        int largeNumber = 0x7FFFFFFF; // Maximum positive int value (2147483647)
        int shifted = largeNumber << 4; // Left shift by 1

        System.out.println("Original number: " + largeNumber);
        System.out.println("Binary: " + Integer.toBinaryString(largeNumber));
        System.out.println("After left shift: " + shifted);
        System.out.println("Binary: " + Integer.toBinaryString(shifted));
    }
}
