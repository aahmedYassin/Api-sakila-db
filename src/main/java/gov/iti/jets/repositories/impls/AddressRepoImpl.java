package gov.iti.jets.repositories.impls;

import java.util.ArrayList;

import gov.iti.jets.repositories.interfaces.*;
import gov.iti.jets.model.entities.*;
import gov.iti.jets.utils.EntityManagerSingleton;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import java.util.*;
import gov.iti.jets.model.entities.*;

public class AddressRepoImpl implements AddressRepo {

    public AddressRepoImpl() {

    }

    @Override
    public Address getAddressById(int id) {
        try {
            return EntityManagerSingleton.getEntityManager().find(Address.class, id);
        } catch (NoSuchElementException e) {

            return null;
        }
    }


}
