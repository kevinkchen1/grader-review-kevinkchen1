import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  @Test
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {

  @Test
  public void testFilter() {
    List<String> input = Arrays.asList("moon", "sun", "star");
    IsMoon test = new IsMoon();
    List<String> filtered = ListExamples.filter(input, test);
    List<String> expected = Arrays.asList("moon");
    assertEquals(expected, filtered);
  }

  @Test
  public void testFilter2() {
    List<String> input = Arrays.asList();
    IsMoon test = new IsMoon();
    List<String> filtered = ListExamples.filter(input, test);
    List<String> expected = Arrays.asList();
    assertEquals(expected, filtered);
  }


  @Test
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }

  @Test
  public void testMergeRightEnd2() {
    List<String> left = Arrays.asList("1", "2", "3");
    List<String> right = Arrays.asList("1", "4");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("1", "1", "2", "3", "4");
    assertEquals(expected, merged);
  }

  
}