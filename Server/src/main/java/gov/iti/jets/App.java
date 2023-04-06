
package gov.iti.jets;

import gov.iti.jets.controller.servcies.impls.ActorServicesImpl;

public class App {

  public static void main(String[] args) {

   
   
         ActorServicesImpl actorServiceImpl=new ActorServicesImpl();
         System.out.println( actorServiceImpl.findActor(1).getFirstName());
   
  }
}
