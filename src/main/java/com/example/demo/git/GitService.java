package com.example.demo.git;

public class GitService {
    private final String gitUrl;
    private final String gitBranch;
    private final String gitToken;

    public GitService(String gitUrl, String gitBranch, String gitToken) {
        this.gitUrl = gitUrl;
        this.gitBranch = gitBranch;
        this.gitToken = gitToken;
    }

    public void printGitInfo() {
        System.out.println("Git URL: " + gitUrl);
        System.out.println("Git Branch: " + gitBranch);
        System.out.println("Git Token: " + gitToken);
    }
}
