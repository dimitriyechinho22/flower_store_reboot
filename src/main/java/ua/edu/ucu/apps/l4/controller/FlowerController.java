package ua.edu.ucu.apps.l4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.l4.flower.Flower;
import ua.edu.ucu.apps.l4.flower.FlowerColor;
import ua.edu.ucu.apps.l4.flower.RomanshFlower;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/flower")
public class FlowerController {
    @GetMapping
    public List<Flower> flowerList(){
        return List.of(new RomanshFlower(FlowerColor.RED, 24, 30));
    }
}
