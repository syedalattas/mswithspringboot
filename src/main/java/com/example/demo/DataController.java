package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
public class DataController {

    private final String hardcodedJson = """
      {
        "message": "This is a hardcoded JSON response",
        "data": {
          "value": 10
        }
      }
  """;

    @GetMapping
    public String getHardcodedData() {
        return hardcodedJson;
    }
}
