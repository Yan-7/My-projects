package com.dictionarypracticeREST.repositories;

import com.dictionarypracticeREST.enteties.Entry;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntryRepository extends JpaRepository<Entry,Integer> {



}
