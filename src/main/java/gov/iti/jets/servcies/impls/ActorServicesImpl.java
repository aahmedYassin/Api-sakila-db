package gov.iti.jets.servcies.impls;

import java.sql.Timestamp;
import java.util.ArrayList;

import gov.iti.jets.Exceptions.*;
import gov.iti.jets.repositories.impls.ActorRepoImpl;
import gov.iti.jets.servcies.interfaces.ActorServices;
import gov.iti.jets.model.dtos.*;
import gov.iti.jets.model.entities.*;
import gov.iti.jets.utils.mappers.*;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(endpointInterface = "gov.iti.jets.servcies.interfaces.ActorServices")
public class ActorServicesImpl implements ActorServices {

    @Override
    public ActorDto getActorById(int id) throws InvalidDataException {
        ActorRepoImpl actorRepoImpl = new ActorRepoImpl();

        if (actorRepoImpl.getActorById(id) == null) {

            throw new InvalidDataException(" actor id not exist");
        }
        return ActorMapper.INSTANCE.toDto(actorRepoImpl.getActorById(id));

    }

    @Override
    public ArrayList<ActorDto> getAllActors() {
        ActorRepoImpl actorRepoImpl = new ActorRepoImpl();
        ArrayList<Actor> allActors = actorRepoImpl.getAllActors();
        ArrayList<ActorDto> allActorsDto = new ArrayList<>();
        for (int i = 0; i < allActors.size(); i++) {

            allActorsDto.add(ActorMapper.INSTANCE.toDto(allActors.get(i)));
        }

        return allActorsDto;

    }

    @Override
    public ActorDto getActorByFirstName(String name) throws InvalidDataException {
        ActorRepoImpl actorRepoImpl = new ActorRepoImpl();
        if (actorRepoImpl.getActorByFirstName(name) == null) {

            throw new InvalidDataException(" first name not exist");
        }
        return ActorMapper.INSTANCE.toDto(actorRepoImpl.getActorByFirstName(name));

    }

    @Override
    public ActorDto createActor(ActorDto actorDto) {
        ActorRepoImpl actorRepoImpl = new ActorRepoImpl();
        actorDto.setLastUpdate(new Timestamp(System.currentTimeMillis()));
        actorRepoImpl.createActor(ActorMapper.INSTANCE.toEntity(actorDto));
        return actorDto;
    }

    @Override
    public ActorDto updateActorById(int id, String firstName) throws InvalidDataException {
        ActorRepoImpl actorRepoImpl = new ActorRepoImpl();
        if (actorRepoImpl.updateActorById(id, firstName) == null) {

            throw new InvalidDataException(" actor id not exist");
        }
        return ActorMapper.INSTANCE.toDto(actorRepoImpl.updateActorById(id, firstName));

    }

    @Override
    public int deleteActorById(int id) throws InvalidDataException {
        ActorRepoImpl actorRepoImpl = new ActorRepoImpl();

        return actorRepoImpl.deleteActorById(id);

    }

    @Override
    public ArrayList<FilmDto> getActorFilmsById(int id) throws InvalidDataException {

        ActorRepoImpl actorRepoImpl = new ActorRepoImpl();
        if (actorRepoImpl.getActorFilmsById(id) == null) {

            throw new InvalidDataException(" actor id not exist");
        }
        ArrayList<Film> film = actorRepoImpl.getActorFilmsById(id);
        ArrayList<FilmDto> filmDto = new ArrayList<>();
        for (int i = 0; i < film.size(); i++) {
            filmDto.add(FilmMapper.INSTANCE.toDto(film.get(i)));
        }

        return filmDto;
    }

}
