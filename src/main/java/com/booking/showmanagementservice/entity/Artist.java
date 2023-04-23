package com.booking.showmanagementservice.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Artist implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
}
