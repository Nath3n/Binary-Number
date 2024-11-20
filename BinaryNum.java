import java.util.Scanner;
public class BinaryNum {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What two numbers would you like to add? ");
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();

        BinaryNum bi = new BinaryNum();

        int result = bi.additionWithTwoNums(num1, num2);
        System.out.println(num1 + " + " +
                num2 + " = " + result);
        String binaryResult = Integer.toBinaryString(result);
        System.out.println("In binary the answer is " + binaryResult);
    }
    int additionWithTwoNums(int num1, int num2){
        int answer = 0;
        answer = num1 + num2;
        return answer;
    }
}
