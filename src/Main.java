import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer [] array1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};//searchArray
        Integer[] array3 = searchArray(array1);

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
        }
    }

    public static Integer[] searchArray(Integer[] array) throws RuntimeException {

        int lastIndex = Arrays.asList(array).lastIndexOf(4);

        if(lastIndex == -1){
            throw new RuntimeException();
        }

        Integer[] array2 = new Integer [array.length-(lastIndex+1)];
        int j = 0;

        for (int i = lastIndex+1; i < array.length; i++){
            array2[j]=array[i];
            j++;
        }
        return array2;
    }

    public static boolean searchOneAndFour(Integer[] array) {

        int index1 = Arrays.asList(array).indexOf(1);
        int index4 = Arrays.asList(array).indexOf(4);

        if(index1 == -1 && index4 == -1){
            return false;
        }else {
            return true;
        }
    }
}
