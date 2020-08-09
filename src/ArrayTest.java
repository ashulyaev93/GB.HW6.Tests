import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayTest {

    @Test
    public void testAdd() {
        Integer [] array1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        Integer [] needArray = {1, 7};
        Integer[] array = Main.searchArray(array1);
        assertEquals(needArray, array);
    }

    @Test
    public void testAdd2() {
        Integer [] array1 = {1, 2, 3, 3, 2, 3, 7, 1, 7};
        try {
            Integer[] array = Main.searchArray(array1);
            fail();
        }catch (RuntimeException e){
            assertTrue(true);
        }
    }

    @Test
    public void testAdd3() {
        Integer [] array1 = {1, 2, 4, 6, 2, 3, 5, 1, 7};
        Integer [] needArray = {6, 2, 3, 5, 1, 7};
        Integer[] array = Main.searchArray(array1);
        assertEquals(needArray, array);
    }

    @Test
    public void testAdd4() {
        Integer [] array = {1, 1, 4, 4, 4};
        boolean check = Main.searchOneAndFour(array);
        assertTrue(check);
    }

    @Test
    public void testAdd5() {
        Integer [] array = {5, 3, 2, 6};
        boolean check = Main.searchOneAndFour(array);
        assertFalse(check);
    }

    @Test
    public void testAdd6() {
        Integer [] array = {5, 3, 2, 6, 4};
        boolean check = Main.searchOneAndFour(array);
        assertTrue(check);
    }
}
