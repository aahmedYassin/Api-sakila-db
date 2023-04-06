package gov.iti.jets.controller.repositories.interfaces;

import gov.iti.jets.model.dtos.ActorDto;

public interface ActorRepo {

    public ActorDto findActor(int id);

}
