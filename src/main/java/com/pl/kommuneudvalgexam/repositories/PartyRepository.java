package com.pl.kommuneudvalgexam.repositories;



import com.pl.kommuneudvalgexam.entity.Party;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

@Configuration
@EnableEncryptableProperties
public interface PartyRepository extends CrudRepository<Party,Integer> {
}
