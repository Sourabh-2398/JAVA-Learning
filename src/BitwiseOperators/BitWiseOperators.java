package BitwiseOperators;

public class BitWiseOperators {
    public static void main(String[] args) {
        int a = 4; // 0100 in binary
        int b = 6; // 0110 in binary

        // Bitwise XOR
        System.out.println(a ^ b); // 0100 ^ 0110 = 0010 (2 in decimal)

        // Bitwise AND
        System.out.println(a & b); // 0100 & 0110 = 0100 (4 in decimal)

        // Bitwise OR
        System.out.println(a | b); // 0100 | 0110 = 0110 (6 in decimal)

        // Bitwise NOT
        System.out.println(~a); // ~0100 = 1011 (-5 in decimal, as ~n = -(n+1))

        // Bitwise Shift operators
        // Signed left shift (<<)
        // Shifts bits to the left, filling with zeros on the right
        // Equivalent to multiplying by 2^n (where n is the number of positions shifted)
        // Example: 0100 << 1 = 1000 (8 in decimal)
        // Analogy simple it shift th bit to left and add 0 at right side
        System.out.println(a << 1); // 4 << 1 = 8

        // Signed right shift (>>)
        // Shifts bits to the right, filling with the sign bit (leftmost bit)
        // Equivalent to dividing by 2^n (where n is the number of positions shifted)
        // Example: 0100 >> 1 = 0010 (2 in decimal)
        // add zero if msb is 0 and add 1 if msb is 1
        // preserve the sign bit
        System.out.println(a >> 1); // 4 >> 1 = 2

        // Unsigned right shift (>>>)
        // Shifts bits to the right, filling with zeros on the left
        // Example: 0100 >>> 1 = 0010 (2 in decimal)
        // add zero to the left side
        // do not preserve the sign bit
        System.out.println(-4 >>> 1); // 4 >>> 1 = 2
    }
}