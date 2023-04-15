package gov.iti.jets.servcies.interfaces;

import gov.iti.jets.Exceptions.InvalidDataException;
import java.util.ArrayList;

import gov.iti.jets.model.dtos.*;
import gov.iti.jets.model.entities.*;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface CustomerServices {

    @WebMethod
    public CustomerDto getCustomerById(@WebParam(name = "customerId") int id) throws InvalidDataException;

    @WebMethod

    public CustomerDto getCustomerByName(@WebParam(name = "customerName") String name) throws InvalidDataException;


}
