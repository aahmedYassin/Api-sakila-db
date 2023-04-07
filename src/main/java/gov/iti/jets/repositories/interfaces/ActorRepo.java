package gov.iti.jets.repositories.interfaces;

import java.util.ArrayList;

import gov.iti.jets.model.entities.Actor;

public interface ActorRepo {

    public Actor findActorById(int id);
    public ArrayList<Actor> findAllActors();
    public Actor findActorByFirstName(String firstName);
    public Actor createActor(Actor actor);
    public Actor updateActorById(int id, String firstName);
  
}
