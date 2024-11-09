package com.example.demo_heap_dump.controller;

import com.example.demo_heap_dump.model.MemoryModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemoryController {

    private final List<MemoryModel> memoryHog = new ArrayList<>();

    @GetMapping("/oom")
    public String triggerOom() {
        try {
            while (true) {
                memoryHog.add(new MemoryModel(new byte[1024 * 1024]));
            }
        } catch (OutOfMemoryError e) {
            return "OutOfMemoryError triggered!";
        }
    }
}
