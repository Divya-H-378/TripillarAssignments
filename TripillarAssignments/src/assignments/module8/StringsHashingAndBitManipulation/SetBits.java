package assignments.module8.StringsHashingAndBitManipulation;

public class SetBits {
    public static void main(String[] args) {
        int num = 13;
        int count = 0;

        while(num > 0) {
            count += num & 1;
            num >>= 1;
        }

        System.out.println("Set Bits: " + count);
    }
}
