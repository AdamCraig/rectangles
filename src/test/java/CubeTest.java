import org.junit.*;
import static org.junit.Assert.*;

public class CubeTest {

  @Test
  public void volume_determinesTheVolumeOfTheCube_27000() {
    Rectangles testRectangles = new Rectangles(30, 30);
    Cube testCube = new Cube(testRectangles);
    assertEquals(27000, testCube.volume());
  }

  @Test
  public void surfaceArea_determinesTheSurfaceAreaOfACube_5400() {
    Rectangles testRectangles = new Rectangles(30, 30);
    Cube testCube = new Cube(testRectangles);
    assertEquals(5400, testCube.surfaceArea());
  }

}
