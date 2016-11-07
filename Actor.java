
public interface Actor {

  publict act();
  public speak();
  default void comedy()
  {
	System.out.println("commedy");
  }

}
