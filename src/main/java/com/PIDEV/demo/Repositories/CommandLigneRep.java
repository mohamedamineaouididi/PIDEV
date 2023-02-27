package com.PIDEV.demo.Repositories;

import com.PIDEV.demo.Entities.CommandLigne;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandLigneRep extends CrudRepository<CommandLigne, Integer> {
}
