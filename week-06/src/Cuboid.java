// Create a class that represents a cuboid:
// It should take its three dimensions as constructor parameters. For example: x: 5, y: 6, z: 15
// It should have a method called `getSurface` that returns the cuboid's surface
// It should have a method called `getVolume` that returns the cuboid's volume

public class Cuboid {
  int x;
  int y;
  int z;

  Cuboid(int x, int y, int z) {
      this.x = x;
      this.y = y;
      this.z = z;
  }

  public static int getSurface(Cuboid box) {
    return 2 * (box.x * box.y + box.x * box.z + box.y * box.z);
  }

  public static int getVolume(Cuboid box) {
    return box.x * box.y * box.z;
  }

  public static void main(String[] args) {
    Cuboid box = new Cuboid(5, 6, 15);
    System.out.println("The surface of your box is: " + getSurface(box));
    System.out.println("The volume of your box is: " + getVolume(box));
  }
}
