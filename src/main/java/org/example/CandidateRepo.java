package org.example;

import java.util.List;

// TODO: Implement it where you store the newly added candidates in the memory
public interface CandidateRepo {

    void add(Candidate candidate);

    List<Candidate> findByName(String name);
}
