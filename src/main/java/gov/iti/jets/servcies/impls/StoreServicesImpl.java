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

}
