package Seminar1;

public class HW1_1 {

    // public static void main(String[] args) {
    //     int[] array = new int[] {1, 2, 3, 4, 5};
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Введите индекс элемента массива: ");
    //     int arrIndex = input.nextInt();
    //     if (array.length < arrIndex) {System.out.println("Вы ввели несуществующий индекс");}
    //     else System.out.println(array[arrIndex]);
    //     input.close();
    // }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        int arrIndex = 6;
        for (int i = 0; i < arrIndex; i++) {
            array[i] += i;
        }
    }
}
