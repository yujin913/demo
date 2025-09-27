package com.example.demo.git;

public class AzureService {
    private final String azureUrl;
    private final String azureToken;

    public AzureService(String azureUrl, String azureToken) {
        this.azureUrl = azureUrl;
        this.azureToken = azureToken;
    }

    public void printAzureInfo() {
        System.out.println("Azure URL: " + azureUrl);
        System.out.println("Azure Token: " + azureToken);
    }
}
