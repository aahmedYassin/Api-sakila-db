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

@WebService(endpointInterface = "gov.iti.jets.servcies.interfaces.CountryServices")
public class CountryServicesImpl implements CountryServices {

    @Override
    public CountryDto getCountryById(int id) throws InvalidDataException {
        CountryRepoImpl countryRepoImpl = new CountryRepoImpl();

        if (countryRepoImpl.getCountryById(id) == null) {

            throw new InvalidDataException(" country id not exist");
        }

        return CountryMapper.INSTANCE.toDto(countryRepoImpl.getCountryById(id));

    }

    @Override
    public ArrayList<CityDto> getCountryCities(int id) throws InvalidDataException {
        CountryRepoImpl countryRepoImpl = new CountryRepoImpl();

        if (countryRepoImpl.getCountryById(id) == null) {

            throw new InvalidDataException(" country id not exist");
        }

        ArrayList<City> allCities = countryRepoImpl.getCountryCities(id);

        ArrayList<CityDto> allCitiesDto = new ArrayList<>();
        for (int i = 0; i < allCities.size(); i++) {

            allCitiesDto.add(CityMapper.INSTANCE.toDto(allCities.get(i)));
        }

        return allCitiesDto;

    }

}
