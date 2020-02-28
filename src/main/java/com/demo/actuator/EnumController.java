package com.demo.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/weekdays")
public class EnumController {

    @GetMapping(produces = {"application/vnd.actuator.v1+json"})
    public Map displayAllDays() throws UnknownHostException {
        List<String> days = new ArrayList<>();
        for(Weekdays item : Weekdays.values()){
            days.add(item.name());
        }
        Map<String, Object> map = new HashMap<>();
        map.put("weekDays", days);

        return map;
    }

    @GetMapping(produces = {"application/vnd.actuator.v2+json"})
    public Map displayAllDaysWithIpAddress() throws UnknownHostException {
        List<String> days = new ArrayList<>();
        for(Weekdays item : Weekdays.values()){
            days.add(item.name());
        }

        Map<String, Object> map = new HashMap<>();
        long start = System.currentTimeMillis();
        map.put("ipAddress", InetAddress.getLocalHost().getHostAddress());
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        map.put("weekDays", days);

        return map;
    }
}
