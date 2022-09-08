package com.example.restproducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restproducer.bean.Car;

@RestController
@RequestMapping("api/car")
public class CarDetails {

    @GetMapping("")
    public Car getDetails() {
        Car car = new Car("Swift", "ZDI", "Suzuki");
        return car;
    }

}
