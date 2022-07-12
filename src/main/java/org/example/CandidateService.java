package org.example;

public class CandidateService {

    private final CandidateRepo repo;

    public CandidateService(CandidateRepo repo) {
        this.repo = repo;
    }

    public void addCandidate(String name) {
        // TODO: Do some validation here, before store it
    }

    public void findByName(String name) {
        // TODO: call the repo here
    }
}
