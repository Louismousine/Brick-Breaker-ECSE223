/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;
import java.io.Serializable;

// line 36 "../../../../../Block223Persistence.ump"
// line 48 "../../../../../Block223.ump"
public class Player extends UserRole implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Player(String aPassword, Block223 aBlock223)
  {
    super(aPassword, aBlock223);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 39 "../../../../../Block223Persistence.ump"
  private static final long serialVersionUID = -8062584216235283243L ;

  
}