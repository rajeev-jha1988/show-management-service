package com.booking.showmanagementservice.repository.v1;

import com.booking.showmanagementservice.entity.Auditorium;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoriumRepository extends MongoRepository<Auditorium,String> {

    Auditorium findByAuditoriumId(Long id);

}
