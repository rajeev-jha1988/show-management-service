package com.booking.showmanagementservice.entity;

import com.booking.showmanagementservice.constant.CollectionConstant;
import java.io.Serializable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;

import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document( collection = CollectionConstant.auditorium )
@Data
@FieldDefaults( level = AccessLevel.PRIVATE )
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Auditorium implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    private String id;
    private Long auditoriumId;
    private String auditoriumName;
    private Long theatreId;

}