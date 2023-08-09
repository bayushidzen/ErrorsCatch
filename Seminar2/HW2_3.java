import java.io.FileNotFoundException;

public class HW2_3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch(ArithmeticException e){ //Нужно было добавить проверку на нуль, а Throwable пришлось убрать т.к. он родитель для Error, которые мы не можем обработать
            System.out.println("Упс... Произошло деление на нуль");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception ex) { //Exception слишком глобален и в начале он лишний т.к. перекрывает остальные обработчики
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) { //FileNotFoundException лишний т.к. с файлами вообще не работаем
        System.out.println(a + b);
    }

}
