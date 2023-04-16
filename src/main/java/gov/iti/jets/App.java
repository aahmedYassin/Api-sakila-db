
package gov.iti.jets;

import gov.iti.jets.Exceptions.InvalidDataException;
import java.sql.Timestamp;
import java.util.*;
import gov.iti.jets.model.dtos.*;
import gov.iti.jets.repositories.impls.*;
import gov.iti.jets.servcies.impls.CategoryServicesImpl;
import gov.iti.jets.servcies.impls.CityServicesImpl;
import gov.iti.jets.servcies.impls.CustomerServicesImpl;
import gov.iti.jets.servcies.impls.StaffServicesImpl;
import gov.iti.jets.servcies.impls.StoreServicesImpl;
import gov.iti.jets.servcies.interfaces.CityServices;
import gov.iti.jets.servcies.interfaces.StaffServices;
import gov.iti.jets.servcies.interfaces.StoreServices;
import gov.iti.jets.repositories.impls.*;
import gov.iti.jets.servcies.impls.AddressServicesImpl;

public class App {

  public static void main(String[] args) throws InvalidDataException {

    AddressServicesImpl a=new AddressServicesImpl();
    System.out.println(a.getAddressById(1));

  }
}
