package com.booking.showmanagementservice.controller;


import com.booking.showmanagementservice.dto.v1.ShowDto;
import com.booking.showmanagementservice.service.ShowService;
import io.swagger.annotations.Api;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/api")
@Api
public class ShowController {

    private final ShowService showService;


    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    @PostMapping( path = "/show" )
    public ResponseEntity<ShowDto> addShow(@RequestBody @Valid ShowDto showDto) {
        return ResponseEntity.ok( showService.save( showDto ) );
    }

}
