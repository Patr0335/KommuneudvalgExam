package com.pl.kommuneudvalgexam.controller;

import com.pl.kommuneudvalgexam.entity.Party;
import com.pl.kommuneudvalgexam.entity.Votes;
import com.pl.kommuneudvalgexam.repositories.VoteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/votes")
public class VoteController {

    private VoteRepository voteRepository;

    public VoteController(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    @GetMapping
    Iterable<Votes> getAll() {
        return voteRepository.findAll();
    }
}

