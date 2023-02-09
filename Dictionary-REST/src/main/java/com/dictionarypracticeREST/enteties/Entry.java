package com.dictionarypracticeREST.enteties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString(exclude = { "examples" })

@Entity
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String word;
    private String definition;

    @OneToMany(mappedBy = "entry", cascade = CascadeType.ALL)
    private List<Example> examples;

    public Entry(int id, String word, String definition, List<Example> examples) {
        super();
        this.id = id;
        this.word = word;
        this.definition = definition;
        this.examples = examples;
        if (examples != null) {
            for (Example example : this.examples) {
                example.setEntry(this); // bind the example to the entry
            }
        }
    }

    public void setExamples(List<Example> examples) {
        this.examples = examples;
        for (Example example : this.examples) {
            example.setEntry(this); // bind the example to the entry
        }
    }

    public void addExample(Example example) {
        if (this.examples == null) {
            this.examples = new ArrayList<>();
        }
        example.setEntry(this);
        this.examples.add(example); // bind the example to the entry
    }

}