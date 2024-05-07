package ec.edu.epn;

public class calculator {
    private int answer;

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    @SuppressWarnings("IntegerDivisionInFloatPointContext")
    public double division(int a, int b) {
        return a / b;
    }

    public void timeout(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
