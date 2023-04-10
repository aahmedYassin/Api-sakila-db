
package gov.iti.jets;

import gov.iti.jets.Exceptions.InvalidDataException;
import java.sql.Timestamp;
import java.util.*;
import gov.iti.jets.model.dtos.*;
import gov.iti.jets.repositories.impls.*;
import gov.iti.jets.servcies.impls.CityServicesImpl;
import gov.iti.jets.servcies.interfaces.CityServices;
import gov.iti.jets.repositories.impls.*;

public class App {

  public static void main(String[] args) throws InvalidDataException {

    CityServicesImpl s = new CityServicesImpl();
    System.out.println(s.getCityById(1));

  }
}
