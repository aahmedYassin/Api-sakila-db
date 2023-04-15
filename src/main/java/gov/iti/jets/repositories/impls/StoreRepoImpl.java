/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.iti.jets.repositories.impls;

import gov.iti.jets.model.dtos.StoreDto;
import gov.iti.jets.model.entities.Country;
import gov.iti.jets.model.entities.Store;
import gov.iti.jets.repositories.interfaces.StoreRepo;
import gov.iti.jets.utils.EntityManagerSingleton;
import java.util.NoSuchElementException;

/**
 *
 * @author Ahmed Yassin
 */
public class StoreRepoImpl implements StoreRepo {

    @Override
    public Store getStoreById(int id) {
        try {
            return EntityManagerSingleton.getEntityManager().find(Store.class, id);
        } catch (NoSuchElementException e) {

            return null;
        }
    }

}
