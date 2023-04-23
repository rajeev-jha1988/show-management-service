package com.booking.showmanagementservice.service;

import com.booking.showmanagementservice.dto.v1.ShowDto;
import com.booking.showmanagementservice.entity.Show;

public interface ShowService  {

    ShowDto save(ShowDto show);

}
