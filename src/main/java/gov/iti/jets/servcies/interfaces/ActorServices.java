package gov.iti.jets.servcies.interfaces;

import java.util.ArrayList;

import gov.iti.jets.Exceptions.*;
import gov.iti.jets.model.dtos.*;
import gov.iti.jets.model.entities.*;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface ActorServices {

    @WebMethod
    public ActorDto getActorById(@WebParam(name="actorId")int id) throws InvalidDataException;

    @WebMethod
    public ArrayList<ActorDto> getAllActors();

    @WebMethod
    public ActorDto getActorByFirstName(@WebParam(name="actorFirstName") String name) throws InvalidDataException;

    @WebMethod
    public ActorDto createActor(@WebParam(name="actor") ActorDto actorDto);

    @WebMethod
    public ActorDto updateActorById(@WebParam(name="actorId") int id,@WebParam(name="actorFirstName") String firstName) throws InvalidDataException;

    @WebMethod
    public int deleteActorById(@WebParam(name="actorId") int id) throws InvalidDataException;

    @WebMethod
    public ArrayList<FilmDto> getActorFilmsById(@WebParam(name="actorId") int id) throws InvalidDataException;

}
