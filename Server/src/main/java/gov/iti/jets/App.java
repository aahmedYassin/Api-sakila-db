
package gov.iti.jets;

import gov.iti.jets.Exceptions.InvalidFirstNameException;
import gov.iti.jets.servcies.impls.ActorServicesImpl;

public class App {

  public static void main(String[] args) throws InvalidFirstNameException {

   
   
          ActorServicesImpl actorServiceImpl=new ActorServicesImpl();
          System.out.println( actorServiceImpl.findActorByFirstName("yassin").getLastName());
   
  }
}
