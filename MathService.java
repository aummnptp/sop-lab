package com.example.lab3;

import org.springframework.web.bind.annotation.*;

@RestController
public class MathService {
    @RequestMapping(value = "/add/{number1}/{number2}", method = RequestMethod.GET)
    public String add(@PathVariable("number1")Double number1, @PathVariable("number2") Double number2){
        return Double.toString(number1 + number2);
    }

    @RequestMapping(value = "/minus/{number1}/{number2}", method = RequestMethod.GET)
    public String minus(@PathVariable("number1")Double number1, @PathVariable("number2") Double number2){
        return Double.toString(number1 - number2);
    }

    @RequestMapping(value = "/multiply",method = RequestMethod.GET)
    public String multiply(@RequestParam("num1") Double num1,@RequestParam("num2")Double num2){
        return Double.toString(num1 * num2);
    }
}
