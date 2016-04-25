import org.junit.*;
import static org.junit.Assert.*;

public class RectanglesTest {

  @Test
  public void newRectangles_instantiatesCorrectly() {
    Rectangles testRectangles = new Rectangles (2, 4);
    assertEquals(true, testRectangles instanceof Rectangles);
  }
  @Test
  public void getLength_getsRectanglesLength_2() {
    Rectangles testRectangles = new Rectangles(2, 4);
    assertEquals(2, testRectangles.getLength());
  }
  @Test
  public void getWidth_getsRectanglesWidth_4() {
    Rectangles testRectangles = new Rectangles(2, 4);
    assertEquals(4, testRectangles.getWidth());
  }
  @Test
  public void isSquare_whenNotASquare_false() {
    Rectangles testRectangles = new Rectangles(2, 4);
    assertEquals(false, testRectangles.isSquare());
  }
  @Test
  public void isSquare_allSidesEqual_true() {
    Rectangles testRectangles = new Rectangles(4, 4);
    assertEquals(true, testRectangles.isSquare());
  }
}
