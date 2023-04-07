
package gov.iti.jets;

import java.sql.Timestamp;
import java.util.*;
import gov.iti.jets.Exceptions.InvalidFirstNameException;
import gov.iti.jets.servcies.impls.ActorServicesImpl;
import gov.iti.jets.model.dtos.*;
public class App {

  public static void main(String[] args) throws InvalidFirstNameException {
     ActorServicesImpl a = new ActorServicesImpl();
     ArrayList<FilmDto> film = a.getActorFilmsById(1);
    System.out.println(film.get(0).toString());

  }
}
