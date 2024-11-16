package kz.iitu.microwave.controller;

import kz.iitu.microwave.entity.HeatingProgram;
import kz.iitu.microwave.service.MicrowaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/microwave")
public class MicrowaveController {
    @Autowired
    private MicrowaveService microwaveService;

    @PostMapping("/start")
    public String startMicrowave(@RequestBody HeatingProgram program) {
        return microwaveService.start(program);
    }

    @GetMapping("/status")
    public String getStatus() {
        return microwaveService.getStatus();
    }

    @PostMapping("/stop")
    public String stopMicrowave() {
        return microwaveService.stop();
    }
}