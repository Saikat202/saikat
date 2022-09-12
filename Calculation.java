import java.util.Scanner;

public class Calculation
{
    public  static void main(String[] args)
    {
        char operator;
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float result;
        operator = sc.next().charAt(0);
        switch (operator){
            case'+':
                result=a+b;
            System.out.println("sum is "+result);
            break;

            case'-':

                result= a - b;
                System.out.println("subtract is " +result);
                break;

            case'*':

                result= a * b;
                System.out.println("multiplication is " +result);
                break ;

            case'/':

                result= a / b;
                System.out.println("divide is " +result);
                break ;

            default:
                System.out.println("invalid operator");
                break;

        }
    }
}
