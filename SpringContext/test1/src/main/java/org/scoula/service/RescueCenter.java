package org.scoula.service;

import org.scoula.domain.Bambi;
import org.scoula.domain.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class RescueCenter {
    private final Dog dog;
    private List<Dog> dogs;
    private Map<String, Integer> priorityMap = new HashMap<>();

    @Autowired
    public RescueCenter(List<Dog> dogs, Dog dog) {
        this.dogs = dogs;
        this.dog = dog;
        priorityMap.put("해피", 1);
        priorityMap.put("밤비", 2);
        priorityMap.put("꼬미", 3);

    }

    @PostConstruct
    public void init() {
        dogs.sort();
    }



}


