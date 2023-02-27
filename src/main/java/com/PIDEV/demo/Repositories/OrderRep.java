package com.PIDEV.demo.Repositories;




import com.PIDEV.demo.Entities.Orderr;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRep extends CrudRepository<Orderr,Integer> {
}
