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

    @Override
    public ArrayList<AddressDto> getAddressByPostalCode(String code) throws InvalidDataException {
        AddressRepoImpl addressRepoImpl = new AddressRepoImpl();

        if (addressRepoImpl.getAddressByPostalCode(code) == null || addressRepoImpl.getAddressByPostalCode(code).size() == 0) {

            throw new InvalidDataException(" postal code  not exist");
        }

        ArrayList<AddressDto> addressDtos = new ArrayList<>();

        for (int i = 0; i < addressRepoImpl.getAddressByPostalCode(code).size(); i++) {
            addressDtos.add(AddressMapper.INSTANCE.toDto(addressRepoImpl.getAddressByPostalCode(code).get(i)));
        }
        return addressDtos;

    }

    @Override
    public ArrayList<AddressDto> getAddressByDistrict(String name) throws InvalidDataException {
        AddressRepoImpl addressRepoImpl = new AddressRepoImpl();

        if (addressRepoImpl.getAddressByDistrict(name) == null || addressRepoImpl.getAddressByDistrict(name).size() == 0) {

            throw new InvalidDataException(" district name  not exist");
        }
        ArrayList<AddressDto> addressDtos = new ArrayList<>();

        for (int i = 0; i < addressRepoImpl.getAddressByDistrict(name).size(); i++) {
            addressDtos.add(AddressMapper.INSTANCE.toDto(addressRepoImpl.getAddressByDistrict(name).get(i)));
        }
        return addressDtos;
    }

}
