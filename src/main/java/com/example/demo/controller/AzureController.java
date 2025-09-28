package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.git.AzureService;

@RestController
public class AzureController {
    private final AzureService azureService;

    public AzureController(AzureService azureService) {
        this.azureService = azureService;
    }

    @GetMapping("/azure")
    public String getAzureInfo() {
        azureService.printAzureInfo();
        return "Azure info printed";
    }
}
