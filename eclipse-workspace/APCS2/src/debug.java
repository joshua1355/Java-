import java.util.*;
import java.awt.*;

public class debug
{
  public static void main(String[] args)
  {
      debug w = new debug(300,0);
      debug t0;
      debug t1 = new debug();
      debug t2 = new debug(world, 100, 50);
      t0.forward();
      t1.turnRight();
      t2.turnLeft();
      world.show(true);
  }

}
