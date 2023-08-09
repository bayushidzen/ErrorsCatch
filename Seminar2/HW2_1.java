import java.util.InputMismatchException;
import java.util.Scanner;

public class HW2_1 {
    public static void main(String[] args) {

        float num = 0;
        boolean check = true;
        do{
            try{
                Scanner in = new Scanner(System.in);
                System.out.print("Введите дробное число, знак разделитель запятая: ");
                num = in.nextFloat();
                check = false;
            }catch(InputMismatchException e){
                System.out.println("Введенные данные не являются дробным числом, повторите ввод.");
            }
        }while(check);
        System.out.println(num);
    }
}