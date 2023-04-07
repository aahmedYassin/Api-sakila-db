package gov.iti.jets.servcies.impls;

import java.sql.Timestamp;
import java.util.ArrayList;

import gov.iti.jets.Exceptions.InvalidFirstNameException;
import gov.iti.jets.repositories.impls.ActorRepoImpl;
import gov.iti.jets.servcies.interfaces.ActorServices;
import gov.iti.jets.model.dtos.ActorDto;
import gov.iti.jets.model.entities.Actor;
import gov.iti.jets.utils.mappers.ActorMapper;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class ActorServicesImpl implements ActorServices {

    @WebMethod
    @Override
    public ActorDto findActorById(int id) {
        ActorRepoImpl actorRepoImpl = new ActorRepoImpl();
        return ActorMapper.toDto(actorRepoImpl.findActorById(id));

    }

    @WebMethod
    @Override
    public ArrayList<ActorDto> findAllActors() {
        ActorRepoImpl actorRepoImpl = new ActorRepoImpl();
        ArrayList<Actor> allActors = actorRepoImpl.findAllActors();
        ArrayList<ActorDto> allActorsDto = new ArrayList<>();
        for (int i = 0; i < allActors.size(); i++) {

            allActorsDto.add(ActorMapper.toDto(allActors.get(i)));
        }

        return allActorsDto;

    }

    @WebMethod
    @Override
    public ActorDto findActorByFirstName(String name) throws InvalidFirstNameException {
        ActorRepoImpl actorRepoImpl = new ActorRepoImpl();
        if (actorRepoImpl.findActorByFirstName(name) == null) {

            throw new InvalidFirstNameException(" first name not exist");
        }
        return ActorMapper.toDto(actorRepoImpl.findActorByFirstName(name));

    }

    @Override
    public ActorDto createActor(ActorDto actorDto) {
        ActorRepoImpl actorRepoImpl = new ActorRepoImpl();
        actorDto.setLastUpdate(new Timestamp(System.currentTimeMillis()));
        actorRepoImpl.createActor(ActorMapper.toEntity(actorDto));
        return actorDto;
    }

}
