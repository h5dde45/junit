package cl;

public class CalculatorImpl implements Calculator{

    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }

    public int mul(int a, int b) {
        return a*b;
    }

    public int div(int a, int b) {
        int result=0;
        try {
            result=a/b;
        } catch (ArithmeticException e) {
            System.out.println("Divisor is 0. Divisin by 0 not possible");
        }
        return result;
    }
}
