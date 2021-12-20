package com.pl.kommuneudvalgexam.services;


import com.pl.kommuneudvalgexam.entity.Candidate;
import com.pl.kommuneudvalgexam.repositories.CandidateRepository;
import com.pl.kommuneudvalgexam.repositories.PartyRepository;
import com.pl.kommuneudvalgexam.repositories.VoteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CandidateService {
    CandidateRepository candidateRepository;
    PartyRepository partyRepository;
    VoteRepository voteRepository;

    public CandidateService(CandidateRepository candidateRepository, PartyRepository partyRepository, VoteRepository voteRepository) {
        this.candidateRepository = candidateRepository;
        this.partyRepository = partyRepository;
        this.voteRepository = voteRepository;
    }

    public List<Candidate> getAllCandidates() {
        List<Candidate> allCandidates = new ArrayList<>();
        candidateRepository.findAll().forEach(allCandidates::add);
        return allCandidates;
    }

    public Candidate getSpecificCandidate(int i){
        return candidateRepository.findById(i).get();
    }


}
