package com.example.showmanagementservice.repository.v1;

import com.example.showmanagementservice.entity.ShowTime;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowTimeRepository extends MongoRepository<ShowTime,String > {

}
