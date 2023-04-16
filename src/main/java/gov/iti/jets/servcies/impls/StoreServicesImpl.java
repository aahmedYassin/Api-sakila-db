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

@WebService(endpointInterface = "gov.iti.jets.servcies.interfaces.StoreServices")
public class StoreServicesImpl implements StoreServices {

    @Override
    public StoreDto getStoreById(int id) throws InvalidDataException {
        StoreRepoImpl storeRepoImpl = new StoreRepoImpl();

        if (storeRepoImpl.getStoreById(id) == null) {

            throw new InvalidDataException(" store id not exist");
        }

        return StoreMapper.INSTANCE.toDto(storeRepoImpl.getStoreById(id));
    }

    @Override
    public ArrayList<StaffDto> getStoreStaff(int id) throws InvalidDataException {
        StoreRepoImpl storeRepoImpl = new StoreRepoImpl();

        if (storeRepoImpl.getStoreStaff(id) == null) {

            throw new InvalidDataException(" store id not exist");
        }

        ArrayList<Staff> staff = storeRepoImpl.getStoreStaff(id);
        ArrayList<StaffDto> staffDto = new ArrayList<>();
        for (int i = 0; i < staff.size(); i++) {
            staffDto.add(StaffMapper.INSTANCE.toDto(staff.get(i)));
        }

        return staffDto;

    }

    @Override
    public ArrayList<CustomerDto> getStoreCustomer(int id) throws InvalidDataException {

        StoreRepoImpl storeRepoImpl = new StoreRepoImpl();

        if (storeRepoImpl.getStoreCustomer(id) == null) {

            throw new InvalidDataException(" store id not exist");
        }

        ArrayList<Customer> customer = storeRepoImpl.getStoreCustomer(id);
        ArrayList<CustomerDto> CustomerDto = new ArrayList<>();
        for (int i = 0; i < customer.size(); i++) {
            CustomerDto.add(CustomerMapper.INSTANCE.toDto(customer.get(i)));
        }

        return CustomerDto;

    }

}
