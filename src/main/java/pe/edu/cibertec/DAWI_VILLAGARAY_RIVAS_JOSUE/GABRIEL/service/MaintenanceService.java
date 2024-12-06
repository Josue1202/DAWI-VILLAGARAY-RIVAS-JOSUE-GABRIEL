package pe.edu.cibertec.DAWI_VILLAGARAY_RIVAS_JOSUE.GABRIEL.service;

import pe.edu.cibertec.DAWI_VILLAGARAY_RIVAS_JOSUE.GABRIEL.dto.FilmCreateDto;
import pe.edu.cibertec.DAWI_VILLAGARAY_RIVAS_JOSUE.GABRIEL.dto.FilmDetailDto;
import pe.edu.cibertec.DAWI_VILLAGARAY_RIVAS_JOSUE.GABRIEL.dto.FilmDto;

import java.util.List;

public interface MaintenanceService {


    List<FilmDto> findAllFilms();

    FilmDetailDto findFilmById(int id);

    Boolean updateFilm(FilmDetailDto filmDetailDto);

    Boolean addFilm(FilmCreateDto filmCreateDto);

    Boolean deleteFilmById(int id);
}
