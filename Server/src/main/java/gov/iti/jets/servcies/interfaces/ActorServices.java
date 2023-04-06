package gov.iti.jets.servcies.interfaces;


import java.util.ArrayList;

import gov.iti.jets.Exceptions.InvalidFirstNameException;
import gov.iti.jets.model.dtos.ActorDto;

public interface ActorServices {
    

    public ActorDto findActorById(int id);
    public ArrayList<ActorDto> findAllActors();
    public ActorDto findActorByFirstName(String name) throws InvalidFirstNameException;

}
