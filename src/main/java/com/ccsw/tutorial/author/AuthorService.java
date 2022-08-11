package com.ccsw.tutorial.author;

import org.springframework.data.domain.Page;

import com.ccsw.tutorial.author.model.Author;
import com.ccsw.tutorial.author.model.AuthorDto;
import com.ccsw.tutorial.author.model.AuthorSearchDto;

import java.util.List;

/**
 * @author ccsw
 */
public interface AuthorService {

    /**
     * Recupera un {@link com.ccsw.tutorial.author.model.Author} a través de su ID
     * @param id
     * @return
     */
    Author get(Long id);

    /**
     * Método para recuperar un listado paginado de {@link com.ccsw.tutorial.author.model.Author}
     * @param dto
     * @return
     */
    Page<Author> findPage(AuthorSearchDto dto);

    /**
     * Método para crear o actualizar un {@link com.ccsw.tutorial.author.model.Author}
     * @param id
     * @param data
     */
    void save(Long id, AuthorDto data);

    /**
     * Método para crear o actualizar un {@link com.ccsw.tutorial.author.model.Author}
     * @param id
     */
    void delete(Long id);

    /**
     * Recupera un listado de autores
     * @return
     */
    List<Author> findAll();

}
