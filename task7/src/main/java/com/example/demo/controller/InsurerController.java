package com.example.demo.controller;

import com.example.demo.service.InsurerCheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class InsurerController {
    private final InsurerCheckService insurerCheckService;

    @GetMapping(path = "/checkInsurer")
    public void getCountryDictionary() {
        insurerCheckService.checkInsurer();
    }
}
