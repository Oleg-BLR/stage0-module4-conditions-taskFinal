package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public static void main(String[] args) {
        swap(5,3);
    }
    public static void swap(int first, int second) {
        first = first ^ second;
//        System.out.println(first);
        second = second ^ first;
//        System.out.println(second);
        first = first ^ second;
        System.out.println(first);
        System.out.println(second);
    }
}
