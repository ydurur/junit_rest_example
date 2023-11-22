package com.example.junitexample;


import com.example.junitexample.service.AreaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    AreaService areaService;
    public MainController(AreaService areaService) {
        this.areaService=areaService;
    }

    @GetMapping("/hello")
    public @ResponseBody String hello(){
        return this.areaService.getAreaResult();
    }

}
