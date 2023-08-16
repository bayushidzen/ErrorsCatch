// Реализуйте метод subArrays, принимающий в качестве аргументов два целочисленных массива a и b, и возвращающий новый массив c, 
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны - верните нулевой массив длины 1.



package Seminar1;

public class HW2_1 {
    
    public int[] subArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int[] c = new int[a.length];
        int[] d = new int[] {0};
        if (a.length == b.length){
          for (int i = 0; i < c.length; i++) {
            c[i] = a[i] - b[i];
          }
        return c;
        }
          else return d;
      }
    
}
