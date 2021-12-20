package com.pl.kommuneudvalgexam.controller;


import com.pl.kommuneudvalgexam.entity.Candidate;
import com.pl.kommuneudvalgexam.errors.NotFoundException;
import com.pl.kommuneudvalgexam.repositories.CandidateRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/candidates")
public class KommunalvalgController {

    private CandidateRepository candidateRepository;

    public KommunalvalgController(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @GetMapping
    Iterable<Candidate> getAll() {
        return candidateRepository.findAll();
    }

    @GetMapping("/{id}")
    Candidate getOne(@PathVariable("id") int id) throws NotFoundException {
        return candidateRepository.findById(id).orElseThrow(()-> new NotFoundException("User not found"));
    }

    @PostMapping()
    Candidate addOne(@RequestBody Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    @PutMapping("/{id}")
    Candidate editOne(@RequestBody Candidate candidate, @PathVariable("id") int id) {
        Candidate c = candidateRepository.findById(id).get();
        c.setFirstName(candidate.getFirstName());
        c.setLastName(candidate.getLastName());
        c.setParty(candidate.getParty()); // nested party object, hvor vi har lavet en ManyToOne i Party Entitiy klassen. Vi har en reference som gør at vi kan trække den ud igen.
        return candidateRepository.save(c);
    }
    @DeleteMapping("/{id}")
    ResponseEntity<Object> deleteOne(@PathVariable("id") int id) {
        candidateRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
