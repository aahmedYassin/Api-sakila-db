package gov.iti.jets.utils.mappers;

import gov.iti.jets.model.dtos.ActorDto;
import gov.iti.jets.model.entities.Actor;

public class ActorMapper {

    public static ActorDto toDto(Actor actor) {
        if (actor == null) {
            return null;
        }
        ActorDto actorDto = new ActorDto(actor.getActorId(), actor.getFirstName(), actor.getLastName(),
                actor.getLastUpdate());

        return actorDto;
    }

    public static Actor toEntity(ActorDto actorDto) {
        if (actorDto == null) {
            return null;
        }
        Actor actor = new Actor(actorDto.getFirstName(), actorDto.getLastName(),
                actorDto.getLastUpdate());
        return actor;

    }
}
