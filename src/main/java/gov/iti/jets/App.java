
package gov.iti.jets;

import java.sql.Timestamp;
import java.util.*;
import gov.iti.jets.Exceptions.InvalidFirstNameException;
import gov.iti.jets.servcies.impls.ActorServicesImpl;
import gov.iti.jets.model.dtos.*;
import gov.iti.jets.repositories.impls.ActorRepoImpl;
import gov.iti.jets.repositories.impls.FilmRepoImpl;

public class App {

  public static void main(String[] args) throws InvalidFirstNameException {
        
        ActorRepoImpl filmRepoImpl=new ActorRepoImpl();

        System.out.println(filmRepoImpl.getActorById(1));
   

  }
}
