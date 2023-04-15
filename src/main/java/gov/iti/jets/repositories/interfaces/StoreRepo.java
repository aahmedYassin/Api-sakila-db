package gov.iti.jets.repositories.interfaces;

import gov.iti.jets.Exceptions.InvalidDataException;
import gov.iti.jets.model.dtos.CityDto;
import gov.iti.jets.model.dtos.StoreDto;
import java.util.ArrayList;
import java.util.List;

import gov.iti.jets.model.entities.*;
import jakarta.jws.WebParam;

public interface StoreRepo {

      public Store getStoreById(int id);


}
