package com.dictionarypracticeREST.controller;


import com.dictionarypracticeREST.enteties.Entry;
import com.dictionarypracticeREST.services.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DictionaryController {

    @Autowired
    DictionaryService dictionaryService;

    @PostMapping("/add")
    public Entry addEntry(Entry entry) {
        try {
        return this.dictionaryService.addEntry(entry);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/get")
    public Entry getEntry(int entryId) {
        try {
            return dictionaryService.getEntryById(entryId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    @GetMapping("/get-all")
//    public List<Entry> getAll() {
//        return dictionaryService.getAllEntries();
//    }
}
