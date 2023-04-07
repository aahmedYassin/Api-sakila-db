package gov.iti.jets.utils.mappers;

import gov.iti.jets.model.dtos.ActorDto;
import gov.iti.jets.model.entities.Actor;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-07T22:22:51+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class ActorMapperImpl implements ActorMapper {

    @Override
    public ActorDto toDto(Actor actor) {
        if ( actor == null ) {
            return null;
        }

        ActorDto actorDto = new ActorDto();

        actorDto.setActorId( actor.getActorId() );
        actorDto.setFirstName( actor.getFirstName() );
        actorDto.setLastName( actor.getLastName() );
        actorDto.setLastUpdate( actor.getLastUpdate() );

        return actorDto;
    }

    @Override
    public Actor toEntity(ActorDto actorDto) {
        if ( actorDto == null ) {
            return null;
        }

        Actor actor = new Actor();

        actor.setActorId( actorDto.getActorId() );
        actor.setFirstName( actorDto.getFirstName() );
        actor.setLastName( actorDto.getLastName() );
        actor.setLastUpdate( actorDto.getLastUpdate() );

        return actor;
    }
}
