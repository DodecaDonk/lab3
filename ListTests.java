import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

public class ListTests {
    @Test 
	public void filterTest() {
    int[] input1 = { 3 };
    ArrayList<String> input = new ArrayList<String>();
    input.add("Hello");
    input.add("my");
    input.add("name");
    input.add("Daniel");
    StringChecker sc = new StringImp();
    assertEquals(input, ListExamples.filter(input, sc));
	}
}
