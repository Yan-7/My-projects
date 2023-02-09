package com.dictionarypracticeREST.repositories;

import com.dictionarypracticeREST.enteties.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ExampleRepository extends JpaRepository<Example,Integer> {


    List<Example> findByEntryId(int entryId);
}
