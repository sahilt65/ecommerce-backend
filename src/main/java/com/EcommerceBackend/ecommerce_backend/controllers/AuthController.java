package com.EcommerceBackend.ecommerce_backend.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class AuthController {

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity<String> greet(){
        return new ResponseEntity<>( "Hey Sahil", HttpStatus.ACCEPTED);
    }
}
