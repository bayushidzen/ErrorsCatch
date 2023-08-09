public class HW2_2 {
    public static void main(String[] args) {
        try {
            int[] intArray = new int[] {1,2,3,4,5,6,7,8,9}; //Не хватает массива с которым проводятся вычисления
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
