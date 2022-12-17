public class Boletin2UT03Ejercicio5TEST {
    public static void main(String[] args) {
      int[] array1 = new int[100];
      int[] array2 = new int[100];
  
      for (int i = 0; i < 100; i++) {
        array1[i] = i + 1;
      }
  
      for (int i = 0; i < 100; i++) {
        array2[i] = array1[99 - i];
      }
  
      System.out.println("Array 1:");
      for (int num : array1) {
        System.out.print(num + " ");
      }
      System.out.println();
      System.out.println("Array 2:");
      for (int num : array2) {
        System.out.print(num + " ");
      }
    }
  }
  