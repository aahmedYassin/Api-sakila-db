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

    @Override
    public CityDto getCityByName(String name) throws InvalidDataException {
        CityRepoImpl cityRepoImpl = new CityRepoImpl();

        if (cityRepoImpl.getCityByName(name) == null) {

            throw new InvalidDataException(" city name not exist");
        }

        return CityMapper.INSTANCE.toDto(cityRepoImpl.getCityByName(name));
    }

    @Override
    public ArrayList<CityDto> getAllCities() {
        CityRepoImpl cityRepoImpl = new CityRepoImpl();

        ArrayList<City> allCities = cityRepoImpl.getAllCities();
        ArrayList<CityDto> allCitiesDto = new ArrayList<>();
        for (int i = 0; i < allCities.size(); i++) {

            allCitiesDto.add(CityMapper.INSTANCE.toDto(allCities.get(i)));
        }

        return allCitiesDto;

    }

    @Override
    public ArrayList<AddressDto> getCityAddresses(int id) throws InvalidDataException {
        CityRepoImpl cityRepoImpl = new CityRepoImpl();

        if (cityRepoImpl.getCityAddresses(id) == null) {

            throw new InvalidDataException(" city id not exist");
        }

        ArrayList<Address> address = cityRepoImpl.getCityAddresses(id);
        ArrayList<AddressDto> addressDto = new ArrayList<>();
        for (int i = 0; i < address.size(); i++) {

            addressDto.add(AddressMapper.INSTANCE.toDto(address.get(i)));
        }

        return addressDto;

    }

    @Override
    public CountryDto getCityCountryById(int id) throws InvalidDataException {
        CityRepoImpl cityRepoImpl = new CityRepoImpl();

        if (cityRepoImpl.getCityCountryById(id) == null) {

            throw new InvalidDataException(" city id not exist");
        }

        return CountryMapper.INSTANCE.toDto(cityRepoImpl.getCityCountryById(id));

    }

}
