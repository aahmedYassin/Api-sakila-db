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

@WebService(endpointInterface = "gov.iti.jets.servcies.interfaces.CityServices")
public class CityServicesImpl implements CityServices {

    @Override
    public CityDto getCityById(int id) throws InvalidDataException {
        CityRepoImpl cityRepoImpl = new CityRepoImpl();

        if (cityRepoImpl.getCityById(id) == null) {

            throw new InvalidDataException(" city id not exist");
        }

        return CityMapper.INSTANCE.toDto(cityRepoImpl.getCityById(id));

    }

}
