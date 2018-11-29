// Create a class that represents a cuboid:
// It should take its three dimensions as constructor parameters. For example: x: 5, y: 6, z: 15
// It should have a method called `getSurface` that returns the cuboid's surface
// It should have a method called `getVolume` that returns the cuboid's volume

public class Cuboid3 {
  int x;
  int y;
  int z;

  public Cuboid3(int x, int y, int z) {
    this.x = x;
    this.z = z;
    this.y = y;
  }

  public static int getSurface(Cuboid3 box) {
    return 2 * (box.x * box.y + box.x* box.z + box.y * box.z);
  }

  public static int getVolume(Cuboid3 box) {
    return box.x * box.y * box.z;
  }

  public static void main(String[] args) {
    Cuboid3 box = new Cuboid3(5, 6, 15);
    System.out.println("The surface is: " + getSurface(box));
    System.out.println("The volume is: " + getVolume(box));
  }
}
