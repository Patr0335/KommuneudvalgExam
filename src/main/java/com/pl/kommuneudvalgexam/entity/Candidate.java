package com.pl.kommuneudvalgexam.entity;


import javax.persistence.*;

@Entity
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String firstName;
    String lastName;

    @ManyToOne
    @JoinColumn(name = "party_id", referencedColumnName = "id")
    private Party party;

    public Candidate(String firstName,String lastName, Party party) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.party = party;

    }

    public Candidate() {}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

}
