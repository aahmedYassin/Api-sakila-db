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

@WebService(endpointInterface = "gov.iti.jets.servcies.interfaces.CustomerServices")
public class CustomerServicesImpl implements CustomerServices {

    @Override
    public CustomerDto getCustomerById(int id) throws InvalidDataException {
        CustomerRepoImpl customerRepoImpl = new CustomerRepoImpl();

        if (customerRepoImpl.getCustomerById(id) == null) {

            throw new InvalidDataException(" customer id not exist");
        }

        return CustomerMapper.INSTANCE.toDto(customerRepoImpl.getCustomerById(id));

    }

    @Override
    public CustomerDto getCustomerByName(String name) throws InvalidDataException {

        CustomerRepoImpl customerRepoImpl = new CustomerRepoImpl();

        if (customerRepoImpl.getCustomerByName(name) == null) {

            throw new InvalidDataException(" customer name not exist");
        }

        return CustomerMapper.INSTANCE.toDto(customerRepoImpl.getCustomerByName(name));
    }

}
