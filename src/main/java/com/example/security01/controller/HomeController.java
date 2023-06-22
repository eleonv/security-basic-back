package com.example.security01.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequiredArgsConstructor
public class HomeController {

    @GetMapping(value = "/")
    public ResponseEntity<?> home(HttpServletRequest request) {


        return new ResponseEntity<String>("Proyecto final del curso: ", HttpStatus.OK);
    }
}