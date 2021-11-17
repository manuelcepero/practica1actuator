/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actuator.practica1actuator;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Manuel
 */
@Component
@RestControllerEndpoint(id="customEndpoint")
public class CustomEndpoint {
    
    @GetMapping("/random")
    public ResponseEntity<String> customEndPoint(){
        return new ResponseEntity<>("Something from my controller", HttpStatus.OK);
    }
    
}
