package helloworld;

public class Main2 {

    public static void main(String[] args) {
    execute();
    }

    private static void execute() {
        Integer decimal = 1024;
        System.out.println("leftShift BEFORE = " + Integer.toBinaryString(decimal));
        System.out.println("leftShift INTEGER = " + decimal);
        int leftShift = decimal;
        for (int i = 0; leftShift >1; i++) {
            leftShift = decimal >> i;
            System.out.print("leftShift = " + Integer.toBinaryString(leftShift));
            System.out.print("leftShift INTEGER = " + leftShift);
            System.out.println("------------------------------------------------");
        }
        decimal = 1;
        for (int i = 0; leftShift < 1024; i++) {
            leftShift = decimal << i;
            System.out.print("leftShift = " + Integer.toBinaryString(leftShift));
            System.out.print("leftShift INTEGER = " + leftShift);
            System.out.println("------------------------------------------------");
        }
    }
}
