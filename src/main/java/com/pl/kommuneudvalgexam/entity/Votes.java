package com.pl.kommuneudvalgexam.entity;


import javax.persistence.*;
import java.text.DecimalFormat;

@Entity
@Table(name="votingresults")
public class Votes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String party;
    String votes;

    public Votes(String party,String votes) {
        this.party = party;
        this.votes = votes;
    }

    public Votes(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getVotes() {
        return votes;
    }

    public void setVotes(String votes) {
        this.votes = votes;
    }
}
