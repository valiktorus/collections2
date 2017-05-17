import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {


    public static final int SIZE = 100_000;
    public static final int BIG_PART = 90_000;

    public static List<Integer> getA(){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            list.add((int) (Math.random()*100));
        }
        return list;
    }

    public static List<Integer> getB(){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }
        return list;
    }

    public static List<Integer> getC(){
        List<Integer> list = new ArrayList<>();
        for (int i = SIZE - 1; i > 0; i--) {
            list.add(i);
        }
        return list;
    }
    public static List<Integer> getD(){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < BIG_PART; i++) {
            list.add(i);
        }
        for (int i = BIG_PART; i < SIZE ; i++) {
            list.add(SIZE - (i - BIG_PART));
        }
        return list;
    }

    public static List<Integer> getE(){
        List<Integer> list = new ArrayList<>();
        int previousQuantity = 1;
        int currentQuantity = 1;
        for (int i = 0; i < SIZE ; i++) {
            if (currentQuantity <= previousQuantity ){
                list.add(previousQuantity);
                currentQuantity++;
            }else {
                list.add(previousQuantity);
                previousQuantity = currentQuantity;
                currentQuantity = 1;
            }
        }
        return list;
    }


    /*public static int[] getA(){
        int[] array= new int[1_00_000];
        for (int i = 0; i <array.length ; i++) {
            array[i] = (int)(Math.random()*1000);
        }
        return array;
    }*/
   /* public static int[] getB(){
        int[] array= new int[1_00_000];
        for (int i = 0; i <array.length ; i++) {
            array[i] = i;
        }
        return array;
    }*/

    /*public static int[] getC(){
        int[] array= new int[1_00_000];
        for (int i = array.length-1; i >0 ; i--) {
            array[i] = i;
        }
        return array;
    }*/



   /* public static int[] getD() {
        int[] array= new int[1_00_000];
        for (int i = 0; i < 95_000 ; i++) {
            array[i] = i;
        }
        for (int i = 950_00; i < 1_00_000 ; i++) {
            array[i] = 1_000_00 - (i - 95_000);
        }
        return array;
    }*/
    /*public static int[] getE() {
        int previousQuantity = 1;

        int currentQuantity = 1;
        int[] array= new int[1_00_000];
        for (int i = 0; i <array.length ; i++) {
            if (currentQuantity <= previousQuantity ){
                array[i] = previousQuantity;
                currentQuantity++;
            }else {
                array[i] = previousQuantity;
                 previousQuantity = currentQuantity;
                 currentQuantity = 1;
            }
        }
        return array;
    }*/
}
