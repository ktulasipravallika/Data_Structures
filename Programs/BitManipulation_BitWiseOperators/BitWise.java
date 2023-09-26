package BitManipulation_BitWiseOperators;

public class BitWise {
    public static void main(String[] args) {

        System.out.println("OR : " + (5 | 9));
        System.out.println("AND : " + (5 & 9));
        System.out.println("XOR : " + (5 ^ 9));
        System.out.println("Left_SHIFT : " + (5 << 1));
        System.out.println("SIGNED_RIGHT_SHIFT : " + (5 >> 1));
        System.out.println("SIGNED_RIGHT_SHIFT : " + (-5 >> 1));
        System.out.println("UNSIGNED_RIGHT_SHIFT : " + (5 >>> 1));
        System.out.println("UNSIGNED_RIGHT_SHIFT : " + (-5 >>> 1));
        
    }
    
}
