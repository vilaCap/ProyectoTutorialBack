package com.ccsw.tutorial.prestamo;

import com.ccsw.tutorial.prestamo.model.Prestamo;
import com.ccsw.tutorial.prestamo.model.PrestamoDto;

import java.time.LocalDate;
import java.util.List;

/**
 * @author ccsw
 */
public interface PrestamoService {

    Prestamo get(Long id);
    /**
     * Recupera los juegos filtrando opcionalmente por título y/o categoría
     * @param title
     * @param client
     * @param prestamo_date
     * @return
     */
    List<Prestamo> find(String title, String client, LocalDate prestamo_date);

    /**
     * Guarda o modifica un juego, dependiendo de si el id está o no informado
     * @param id
     * @param dto
     */
    void save(Long id, PrestamoDto dto);

    void delete(Long id);

}
