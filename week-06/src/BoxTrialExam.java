// Create a class that represents a cuboid:
// It should take its three dimensions as constructor parameters. For example: x: 5, y: 6, z: 15
// It should have a method called `getSurface` that returns the cuboid's surface
// It should have a method called `getVolume` that returns the cuboid's volume

public class BoxTrialExam {

  public static void main(String[] args) {
    System.out.println("The surface is : " + getSurface(5, 6, 15));
    System.out.println("The volume is : " + getVolume(5, 6, 15));
  }

  public static int getSurface(int x, int y, int z) {
    int surface = 2 * (x * y + x * z + y * z);
    return surface;
  }

  public static int getVolume(int x, int y, int z) {
    int volume = x * y * z;
    return volume;
  }
}


