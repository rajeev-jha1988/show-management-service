package com.booking.showmanagementservice.repository.v1;

import com.booking.showmanagementservice.entity.Show;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends MongoRepository<Show,String> {

}
