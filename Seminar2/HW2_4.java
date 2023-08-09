import java.util.Objects;
import java.util.Scanner;

public class HW2_4 {
    public static void main(String[] args) {
        String userString = null;
        boolean check = true;
        do{
            try{
                Scanner in = new Scanner(System.in);
                System.out.print("Введите строку: ");
                userString =  in.nextLine();
                if(Objects.equals(userString, "")){
                    throw new RuntimeException();
                }
                check = false;
            } catch (RuntimeException e){
                System.out.println("Вы ввели пустую строку, попробуйте ввести снова");
            }
        }
        while(check);
        System.out.println("Вы ввели: " + userString);
    }
}
