// Create a class that represents a cuboid:
// It should take its three dimensions as constructor parameters. For example: x: 5, y: 6, z: 15
// It should have a method called `getSurface` that returns the cuboid's surface
// It should have a method called `getVolume` that returns the cuboid's volume

public class Cuboid2 {
  int x;
  int y;
  int z;

  Cuboid2(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public static int getSurface(Cuboid2 box) {
    return 2 * (box.x * box.y + box.y * box.z + box.x * box.z);
  }

  public static int getVolume(Cuboid2 box) {

    return box.x * box.z * box.y;
  }

  public static void main(String[] args) {
    Cuboid2 box = new Cuboid2(5, 6, 7);
    System.out.println("The surface is: " + getSurface(box));
    System.out.println("The volume is: " + getVolume(box));
  }
}
