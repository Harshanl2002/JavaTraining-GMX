import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    static int add(int num1, int num2) {
        return (num1 + num2);
    }

    static int subract(int num1, int num2) {
        return (num1 - num2);
    }

    static int muiltiplay(int num1, int num2) {
        return (num1 * num2);
    }

    static int divide(int num1, int num2) {
        return (num1 / num2);
    }

    static int remider(int num1, int num2) {
        return (num1 % num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "Enter exit to stop program (or) Enter mathamatical Expression supported opprations (+,-,*,/,%) on non negative numbers:");
            String str = sc.nextLine();
            if (str.equalsIgnoreCase("exit")) {
                break;
            }
            List<Integer> nums = new ArrayList<Integer>();
            String oppration = str.replaceAll("[0-9\\/]", "");
            for (String s : str.split("[^0-9\\/]")) {
                nums.add(Integer.parseInt(s));
            }
            int index = 0;
            int result = nums.get(index++);
            for (int i = 0; i < oppration.length(); i++) {
                switch (oppration.charAt(i)) {
                    case '+':
                        result = add(result, nums.get(index++));
                        break;
                    case '-':
                        result = subract(result, nums.get(index++));
                        break;
                    case '*':
                        result = muiltiplay(result, nums.get(index++));
                        break;
                    case '/':
                        result = divide(result, nums.get(index++));
                        break;
                    case '%':
                        result = remider(result, nums.get(index++));
                        break;
                    default:
                        break;
                }
            }
            System.out.println("Result:" + result);
        }
        sc.close();
    }
}
