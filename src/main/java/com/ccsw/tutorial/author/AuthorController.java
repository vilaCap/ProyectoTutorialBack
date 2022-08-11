package com.ccsw.tutorial.author;

import com.ccsw.tutorial.author.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ccsw.tutorial.author.model.AuthorDto;
import com.ccsw.tutorial.author.model.AuthorSearchDto;
import com.ccsw.tutorial.config.mapper.BeanMapper;

import java.util.List;

/**
 * @author ccsw
 */
@RequestMapping(value = "/author")
@RestController
@CrossOrigin(origins = "*")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @Autowired
    BeanMapper beanMapper;

    /**
     * Método para recuperar un listado paginado de {@link com.ccsw.tutorial.author.model.Author}
     * @param dto
     * @return
     */
    @RequestMapping(path = "", method = RequestMethod.POST)
    public Page<AuthorDto> findPage(@RequestBody AuthorSearchDto dto) {

        return this.beanMapper.mapPage(this.authorService.findPage(dto), AuthorDto.class);
    }

    /**
     * Método para crear o actualizar un {@link com.ccsw.tutorial.author.model.Author}
     * @param id
     * @param data datos de la entidad
     */
    @RequestMapping(path = { "", "/{id}" }, method = RequestMethod.PUT)
    public void save(@PathVariable(name = "id", required = false) Long id, @RequestBody AuthorDto data) {

        this.authorService.save(id, data);
    }

    /**
     * Método para crear o actualizar un {@link com.ccsw.tutorial.author.model.Author}
     * @param id PK de la entidad
     */
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {

        this.authorService.delete(id);
    }

    /**
     * Recupera un listado de autores
     * @return
     */
    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<AuthorDto> findAll() {

        List<Author> authors = this.authorService.findAll();

        return this.beanMapper.mapList(authors, AuthorDto.class);
    }
}
