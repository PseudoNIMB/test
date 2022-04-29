import java.util.Scanner;

public class Calc {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operand1 = nextInt();
        int operand2 = nextInt();
        char operation = getOperation();
        int result = calc(operand1,operand2,operation);
        System.out.println("Результат: " +result);
    }

    public static int nextInt(){
        System.out.println("Введите целое число:");
        int operand;
        if(scanner.hasNextInt()){
            operand = scanner.nextInt();
        } else {
            System.out.println("Ошибка при вводе числа");
            scanner.nextInt();
            operand = nextInt();
        }
        return operand;
    }

    public static char getOperation(){
        System.out.println("Выберите операцию:");
        char operation;
        if (scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка при вводе операции");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int operand1, int operand2, char operation){
        int result;
        switch (operation) {
            case '+' -> result = operand1 + operand2;
            case '-' -> result = operand1 - operand2;
            case '*' -> result = operand1 * operand2;
            case '/' -> result = operand1 / operand2;
            default -> {
                System.out.println("Неверная операция");
                result = calc(operand1, operand2, getOperation());
            }
        }
        return result;
    }
}
