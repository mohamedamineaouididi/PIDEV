package com.PIDEV.demo.Repositories;





import com.PIDEV.demo.Entities.Reaction;
import com.PIDEV.demo.Entities.RelyPoint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RelyPointRep extends CrudRepository<RelyPoint,Integer> {

    public List<RelyPoint> findAll();
    List<RelyPoint> findAllByAddress(String ad);

}
