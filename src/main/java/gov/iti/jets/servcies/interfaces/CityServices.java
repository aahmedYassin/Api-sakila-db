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

    @WebMethod

    public CityDto getCityByName(@WebParam(name = "cityName") String name) throws InvalidDataException;

    @WebMethod

    public ArrayList<CityDto> getAllCities() throws InvalidDataException;

    @WebMethod

    public ArrayList<AddressDto> getCityAddresses(@WebParam(name = "cityId") int id) throws InvalidDataException;

    @WebMethod

    public CountryDto getCityCountryById(@WebParam(name = "cityId") int id) throws InvalidDataException;

}
