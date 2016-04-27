public class Cube {
  Rectangles mFace;

  public Cube(Rectangles rectangle) {
    mFace = rectangle;
  }

  public int volume() {
    int length = mFace.getLength();
    return length * length * length;
  }

  public int surfaceArea() {
    return mFace.area() * 6;
  }
}
