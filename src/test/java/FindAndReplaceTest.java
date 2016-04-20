import org.junit.*;
import static org.junit.Assert.*;


public class FindAndReplaceTest {

  @Test
  public void CheckString_GiveInputReceiveOutput_SameString() {
    FindAndReplace testFindAndReplace = new FindAndReplace( );
    String testString = "Test!";
    assertEquals(testString, testFindAndReplace.replace(testString, testString, testString));
  }

  @Test
  public void CheckString_ReplaceWordsAnywhere_NewString() {
    FindAndReplace testFindAndReplace = new FindAndReplace( );
    String testString = "cat in a cathedral";
    assertEquals("dog in a doghedral", testFindAndReplace.replace(testString, "cat", "dog"));
  }

  @Test
  public void CheckString_ReplaceOnlyCompleteWords_NewString() {
    FindAndReplace testFindAndReplace = new FindAndReplace( );
    assertEquals("dog in a cathedral", testFindAndReplace.replace(cat in a cathedral, "cat", "dog"));
  }
}
