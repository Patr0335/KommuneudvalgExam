package com.pl.kommuneudvalgexam.controller;


import com.pl.kommuneudvalgexam.entity.Candidate;
import com.pl.kommuneudvalgexam.entity.Party;
import com.pl.kommuneudvalgexam.errors.NotFoundException;
import com.pl.kommuneudvalgexam.repositories.CandidateRepository;
import com.pl.kommuneudvalgexam.repositories.PartyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
// lavet partyController på bagrund af dropdown (Party-select) da den skulle vise alle options.
@RestController
@RequestMapping("api/parties")
public class PartyController {

    private PartyRepository partyRepository;

    public PartyController(PartyRepository partyRepository) {
        this.partyRepository = partyRepository;
    }

    @GetMapping
    Iterable<Party> getAll() {
        return partyRepository.findAll();
    }

    @GetMapping("/{id}")
    Party getOne(@PathVariable("id") int id) throws NotFoundException {
        return partyRepository.findById(id).orElseThrow(()-> new NotFoundException("User not found"));
    }
}
