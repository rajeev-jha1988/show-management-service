package com.example.showmanagementservice.entity;

import com.example.showmanagementservice.constant.CollectionConstant;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document( collection = CollectionConstant.show )
@Data
@FieldDefaults( level = AccessLevel.PRIVATE )
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Show implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  private String id;

  private String title;
  private String genre;
  private Instant releaseDate;
  private String language;
  private int duration;
  private List<ShowTime> showTimes;

  private Long auditoriumId;
}