package gov.iti.jets.controller.repositories.impls;

import gov.iti.jets.controller.repositories.interfaces.ActorRepo;
import gov.iti.jets.model.dtos.ActorDto;
import gov.iti.jets.model.entities.Actor;
import gov.iti.jets.utils.EntityManagerSingleton;
import gov.iti.jets.utils.mappers.ActorMapper;

public class ActorRepoImpl implements ActorRepo {

  

    public ActorRepoImpl() {
        
    }

    @Override
    public ActorDto findActor(int id) {
        return ActorMapper.toDto(EntityManagerSingleton.getEntityManager().find(Actor.class, id));

    }

  

}
