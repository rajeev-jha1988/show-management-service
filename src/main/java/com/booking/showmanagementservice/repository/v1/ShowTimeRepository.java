package com.booking.showmanagementservice.repository.v1;

import com.booking.showmanagementservice.entity.ShowTime;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowTimeRepository extends MongoRepository<ShowTime,String > {

}
