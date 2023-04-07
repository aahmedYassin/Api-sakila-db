package gov.iti.jets.servcies.interfaces;


import java.util.ArrayList;

import gov.iti.jets.Exceptions.InvalidFirstNameException;
import gov.iti.jets.model.dtos.*;
import gov.iti.jets.model.entities.*;

public interface ActorServices {
    

    public ActorDto findActorById(int id);
    public ArrayList<ActorDto> findAllActors();
    public ActorDto findActorByFirstName(String name) throws InvalidFirstNameException;
    public ActorDto createActor(ActorDto actorDto);
    public ActorDto updateActorById(int id, String firstName);
    public int deleteActorById(int id);
    public ArrayList<FilmDto> getActorFilmsById(int id);

}
