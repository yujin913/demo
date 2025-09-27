package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.git.GitService;

@RestController
public class GitController {
    private final GitService gitService;

    public GitController(GitService gitService) {
        this.gitService = gitService;
    }

    @GetMapping("/git")
    public String getGitInfo() {
        gitService.printGitInfo();
        return "Git info printed";
    }
}
