package com.ccsw.tutorial.prestamo;

import com.ccsw.tutorial.prestamo.model.Prestamo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


public interface PrestamoRepository extends CrudRepository<Prestamo, Long> {

    @Query("select p from Prestamo p where (:title is null or p.title = :title) " +
            "and (:client is null or p.client = :client)" +
            "and (:prestamo_date is null or p.prestamo_date = :prestamo_date)")
    List<Prestamo> find(@Param("title") String title, @Param("client") String client, @Param("prestamo_date") LocalDate pres_date);


}
