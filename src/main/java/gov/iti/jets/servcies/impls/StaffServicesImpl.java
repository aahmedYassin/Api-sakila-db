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

@WebService(endpointInterface = "gov.iti.jets.servcies.interfaces.StaffServices")
public class StaffServicesImpl implements StaffServices {

    @Override
    public StaffDto getStaffById(int id) throws InvalidDataException {
        StaffRepoImpl staffRepoImpl = new StaffRepoImpl();

        if (staffRepoImpl.getStaffById(id) == null) {

            throw new InvalidDataException(" staff id not exist");
        }

        return StaffMapper.INSTANCE.toDto(staffRepoImpl.getStaffById(id));
    }

    @Override
    public StaffDto getStaffByName(String name) throws InvalidDataException {
        StaffRepoImpl staffRepoImpl = new StaffRepoImpl();

        if (staffRepoImpl.getStaffByName(name) == null) {

            throw new InvalidDataException(" staff name not exist");
        }

        return StaffMapper.INSTANCE.toDto(staffRepoImpl.getStaffByName(name));

    }

}
