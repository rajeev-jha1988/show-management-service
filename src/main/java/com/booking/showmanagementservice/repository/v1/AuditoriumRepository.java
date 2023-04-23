package com.example.showmanagementservice.repository.v1;

import com.example.showmanagementservice.entity.Auditorium;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoriumRepository extends MongoRepository<Auditorium,String> {

}
