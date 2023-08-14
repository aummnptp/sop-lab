package com.example.lab3;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class GeneratePasswordService {
    Random random = new Random();

@RequestMapping(value = "/{name}.generate",method = RequestMethod.GET)
    public String generate(@PathVariable("name")String name){


    // Generate a random 9-digit number
    long password = 100_000_000L + random.nextInt(900_000_000);
    return "Hi," + name +"\n" +"Your new password is "+ password;
    }

}
