package com.demo.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/weekdays")
public class EnumController {

    @GetMapping()
    public Map displayAllDays(){
        int i = 1;
        Map<Integer, Enum<Weekdays>> map = new HashMap<>();
        for(Weekdays item : Weekdays.values()){
            map.put(i++, item);
        }
        return map;
    }
}
