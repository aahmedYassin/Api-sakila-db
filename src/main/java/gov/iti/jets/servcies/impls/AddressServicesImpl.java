package gov.iti.jets.servcies.impls;

import gov.iti.jets.Exceptions.InvalidDataException;
import java.sql.Timestamp;
import java.util.ArrayList;

import gov.iti.jets.repositories.impls.*;
import gov.iti.jets.servcies.interfaces.*;
import gov.iti.jets.model.dtos.*;
import gov.iti.jets.model.entities.*;
import gov.iti.jets.utils.mappers.*;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(endpointInterface = "gov.iti.jets.servcies.interfaces.AddressServices")
public class AddressServicesImpl implements AddressServices {

    @Override
    public AddressDto getAddressById(int id) throws InvalidDataException {
        AddressRepoImpl addressRepoImpl = new AddressRepoImpl();

        if (addressRepoImpl.getAddressById(id) == null) {

            throw new InvalidDataException(" address id not exist");
        }

        return AddressMapper.INSTANCE.toDto(addressRepoImpl.getAddressById(id));

    }

}
