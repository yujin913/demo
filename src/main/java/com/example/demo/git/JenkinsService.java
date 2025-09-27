package com.example.demo.git;

public class JenkinsService {
    private final String jenkinsUrl;
    private final String jenkinsToken;

    public JenkinsService(String jenkinsUrl, String jenkinsToken) {
        this.jenkinsUrl = jenkinsUrl;
        this.jenkinsToken = jenkinsToken;
    }

    public void printJenkinsInfo() {
        System.out.println("Jenkins URL: " + jenkinsUrl);
        System.out.println("Jenkins Token: " + jenkinsToken);
    }
}
