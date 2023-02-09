package libraryspring.controllers;

import libraryspring.enteties.Library;
import libraryspring.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @PostMapping("/addLibrary")
    public Library addLibrary(Library library) {
        return libraryService.addLibrary(library);
    }

    @GetMapping("/getLibrary")
    public Library getLibrary(int libraryId) {
        return libraryService.getLibrary(libraryId);
    }

    @GetMapping("/getAllLibraries")
    public List<Library> libraryList() {
        return libraryService.findAllLibraries();
    }

//    public Book addBook
}
