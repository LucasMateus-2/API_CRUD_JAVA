/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.crudkipper.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 *
 * @author lucas
 */
@RestController
@RequestMapping("/products")

public class ProductController 
{
    @SuppressWarnings("rawtypes")
    @GetMapping
    public ResponseEntity getAllProducts() 
    {
        return ResponseEntity.ok("deu ok");
    }
    
}
