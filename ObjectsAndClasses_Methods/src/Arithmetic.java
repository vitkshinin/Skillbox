public class Arithmetic {

    private static int firstNum;
    private static int secondNum;
    private static int sum = 0;
    private static int multiplication = 0;
    private static int max = 0;
    private static int min = 0;

    public static void main(String[] args) {
        Arithmetic Task = new Arithmetic(2, 3);
        add();
        multiply();
        findMax();
        findMin();
    }

    public Arithmetic(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public static int add() {
        sum = firstNum + secondNum;
        System.out.println("C���� ����� = " + sum);
        return sum;
    }

    public static int multiply () {
        multiplication = firstNum * secondNum;
        System.out.println("������������ ����� = " + multiplication);
        return multiplication;
    }

    public static int findMax () {
        max = firstNum > secondNum ? firstNum : secondNum;
        System.out.println("������������ �������� �� ���� ����� = " + max);
        return max;
    }

    public static int findMin () {
        min = firstNum < secondNum ? firstNum : secondNum;
        System.out.println("����������� �������� �� ���� ����� = " + min);
        return min;
    }
}
