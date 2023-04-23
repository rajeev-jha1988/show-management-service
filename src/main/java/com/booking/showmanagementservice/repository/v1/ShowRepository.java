package com.example.showmanagementservice.repository.v1;

import com.example.showmanagementservice.entity.Show;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends MongoRepository<Show,String> {

}
