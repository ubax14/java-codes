package Ch7Array;
import java.util.Arrays;
public class InsertElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int newElement = 6;
        int position = 5;

        insertElement(arr, position, newElement);
    }
        public static void insertElement(int[] arr, int pos, int newElement) {
            int newArr[] = new int[arr.length + 1];
             int j=0;
            for (int i = 0; i < newArr.length; i++) {
                if (i == pos) {
                    newArr[i] = newElement;
                } else {
                    newArr[i] = arr[j];
                    j++;
                }
            }
            System.out.println("this is original array");
           for (int x:arr){

               System.out.println(x);
           }
            System.out.println("this is new array");
          for (int y:newArr){

              System.out.println(y);
          }

        }


    }

