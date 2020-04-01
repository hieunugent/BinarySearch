import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;

class TestBS{
  @Test
  public void TestCase1(){
    assertTrue(BinarySearch.binarySearch(new int[]{1, 3, 4, 5 ,11, 12},11)==4);
  }
  @Test
  public void TestCase2(){
    assertTrue(BinarySearch2.binarySearch(new int[]{1, 3, 4, 5 ,11, 12},11)==4);
  }
  @Test
  public void TestCase3(){
    assertTrue(BinarySearch.binarySearch(new int[]{1, 3, 4, 5 ,11, 12},1) == 0);
  }
  @Test
  public void TestCase4(){
    assertTrue(BinarySearch2.binarySearch(new int[]{1, 3, 4, 5 ,11, 12},1) == 0);
  }
}
