package com.pl.kommuneudvalgexam;


import com.pl.kommuneudvalgexam.entity.Candidate;
import com.pl.kommuneudvalgexam.entity.Party;
import com.pl.kommuneudvalgexam.repositories.CandidateRepository;
import org.apache.commons.collections4.IterableUtils;
import org.junit.jupiter.api.BeforeEach; //junittests
import org.junit.jupiter.api.Test; //junittests
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;

// Mocking framework til at lave unittests

class UserControllerTest {

    @Mock
    CandidateRepository candidateRepository;

    private List<Candidate> userList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        userList = new ArrayList<>();
        Candidate candidate1 = new Candidate("Patrick", "Lindahl", new Party(1));
        Candidate candidate2 = new Candidate("Patrick", "Børnum", new Party(2));
        userList.add(candidate1);
        userList.add(candidate2);

        Mockito.when(candidateRepository.findById(1)).thenReturn(java.util.Optional.of(candidate1));

        Mockito.when(candidateRepository.save(candidate1)).thenReturn(candidate1);

        Mockito.when(candidateRepository.findAll()).thenReturn(userList);

    }

    @Test
    void getAllCandidatesTest() {
        Iterable<Candidate> list = candidateRepository.findAll();
        assertEquals(2, IterableUtils.toList(list).size());
        Mockito.verify(candidateRepository, times(1)).findAll();
    }

    @Test
    void createNewCandidateTest(){
        Candidate candidatetest = new Candidate("Patrick", "Lindahl", new Party(1));

        candidateRepository.save(candidatetest);

        Mockito.verify(candidateRepository, times(1)).save(Mockito.any(Candidate.class));
    }

    @Test
    void updateCandidateTest() {
        Candidate candidateToUpdate = candidateRepository.findById(1).get();
        candidateToUpdate.setFirstName("Phillip");
        candidateToUpdate.setLastName("Børnum");

        candidateRepository.save(candidateToUpdate); // gemmer ændringer vi har lavet.

        assertEquals("Phillip", candidateRepository.findById(1).get().getFirstName());
        assertEquals("Børnum", candidateRepository.findById(1).get().getLastName());
        Mockito.verify(candidateRepository, times(1)).save(Mockito.any(Candidate.class));
    }

    @Test
    void deleteCandidate(){

        candidateRepository.deleteById(1);

        Mockito.verify(candidateRepository, times(1)).deleteById(1);
    }
}
