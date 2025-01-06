package com.EcommerceBackend.ecommerce_backend.controllers;


import com.EcommerceBackend.ecommerce_backend.security.JWTUtil;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/api")
public class AuthController {

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity<String> greet(){
        return new ResponseEntity<>( "Hey Sahil", HttpStatus.ACCEPTED);
    }
}
