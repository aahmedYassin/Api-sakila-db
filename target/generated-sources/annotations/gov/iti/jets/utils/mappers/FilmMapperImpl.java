package gov.iti.jets.utils.mappers;

import gov.iti.jets.model.dtos.FilmDto;
import gov.iti.jets.model.entities.Film;
import java.sql.Date;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-07T22:22:52+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class FilmMapperImpl implements FilmMapper {

    @Override
    public FilmDto toDto(Film film) {
        if ( film == null ) {
            return null;
        }

        FilmDto filmDto = new FilmDto();

        filmDto.setFilmId( film.getFilmId() );
        filmDto.setTitle( film.getTitle() );
        filmDto.setDescription( film.getDescription() );
        filmDto.setReleaseYear( film.getReleaseYear() );
        filmDto.setRentalDuration( film.getRentalDuration() );
        filmDto.setRentalRate( film.getRentalRate() );
        filmDto.setLength( film.getLength() );
        filmDto.setReplacementCost( film.getReplacementCost() );
        filmDto.setRating( film.getRating() );
        filmDto.setSpecialFeatures( film.getSpecialFeatures() );
        filmDto.setLastUpdate( film.getLastUpdate() );

        return filmDto;
    }

    @Override
    public Film toEntity(FilmDto filmDto) {
        if ( filmDto == null ) {
            return null;
        }

        Film film = new Film();

        film.setFilmId( filmDto.getFilmId() );
        film.setTitle( filmDto.getTitle() );
        film.setDescription( filmDto.getDescription() );
        if ( filmDto.getReleaseYear() != null ) {
            film.setReleaseYear( new Date( filmDto.getReleaseYear().getTime() ) );
        }
        film.setRentalDuration( filmDto.getRentalDuration() );
        film.setRentalRate( filmDto.getRentalRate() );
        film.setLength( filmDto.getLength() );
        film.setReplacementCost( filmDto.getReplacementCost() );
        film.setRating( filmDto.getRating() );
        film.setSpecialFeatures( filmDto.getSpecialFeatures() );
        film.setLastUpdate( filmDto.getLastUpdate() );

        return film;
    }
}
