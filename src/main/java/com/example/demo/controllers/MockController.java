package com.example.demo.controllers;


import com.example.demo.UtenteDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@CrossOrigin("*")
public class MockController {


    @GetMapping("/utenti")
    public ResponseEntity<List<UtenteDto>> getAllUtenti() {

        List<UtenteDto> utenti = new ArrayList<>();

        utenti.add(new UtenteDto(1L, "Spavald", "92"));
        utenti.add(new UtenteDto(2L, "Ciccio", "Gamer89"));
        utenti.add(new UtenteDto(3L, "Morro", "linux"));

        return ResponseEntity.ok(utenti);

    }

}
