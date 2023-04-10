package gov.iti.jets.servcies.interfaces;

import gov.iti.jets.Exceptions.InvalidDataException;
import java.util.ArrayList;

import gov.iti.jets.model.dtos.*;
import gov.iti.jets.model.entities.*;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface CityServices {

    @WebMethod
    public CityDto getCityById(@WebParam(name = "cityId") int id) throws InvalidDataException;

   

}
