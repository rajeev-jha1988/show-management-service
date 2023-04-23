package com.booking.showmanagementservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EventType {

    SHOW_TIME_CREATED("show-time.added.success","show-time.added.success"),
    SHOW_CREATED("show.created.success","show.created.success");

    private final String event;
    private final String routingKey;
}
