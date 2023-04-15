package gov.iti.jets.servcies.interfaces;

import gov.iti.jets.Exceptions.InvalidDataException;
import java.util.ArrayList;

import gov.iti.jets.model.dtos.*;
import gov.iti.jets.model.entities.*;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface AddressServices {

    @WebMethod
    public AddressDto getAddressById(@WebParam(name = "addressId") int id) throws InvalidDataException;

    @WebMethod
    public ArrayList<AddressDto> getAddressByPostalCode(@WebParam(name = "postalCode") String code) throws InvalidDataException;

    @WebMethod
    public ArrayList<AddressDto> getAddressByDistrict(@WebParam(name = "district") String name) throws InvalidDataException;
}
