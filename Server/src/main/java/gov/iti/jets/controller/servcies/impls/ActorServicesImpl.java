package gov.iti.jets.controller.servcies.impls;

import gov.iti.jets.controller.repositories.impls.ActorRepoImpl;
import gov.iti.jets.controller.servcies.interfaces.ActorServices;
import gov.iti.jets.model.dtos.ActorDto;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class ActorServicesImpl implements ActorServices {
    
   @WebMethod
   @Override
    public ActorDto findActor(int id) {
        ActorRepoImpl actorRepoImpl = new ActorRepoImpl();
         return actorRepoImpl.findActor(id);

   
    }

}
