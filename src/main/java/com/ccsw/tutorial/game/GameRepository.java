package com.ccsw.tutorial.game;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;

import com.ccsw.tutorial.game.model.Game;


public interface GameRepository extends CrudRepository<Game, Long> {

    @Query("select g from Game g where (:title is null or g.title like '%'||:title||'%') and (:category is null or g.category.id = :category)")
    List<Game> find(@Param("title") String title, @Param("category") Long category);


}
