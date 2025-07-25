package com.example.github_repos_viewer.model;

import java.util.List;

public class RepositoryInfo {
    private String repositoryName;
    private String ownerLogin;
    private List<BranchInfo> branches;

    public RepositoryInfo(String repositoryName, String ownerLogin, List<BranchInfo> branches) {
        this.repositoryName = repositoryName;
        this.ownerLogin = ownerLogin;
        this.branches = branches;
    }
    
    public String getRepositoryName() {
        return repositoryName;
    }

    public String getOwnerLogin() {
        return ownerLogin;
    }

    public List<BranchInfo> getBranches() {
        return branches;
    }
}