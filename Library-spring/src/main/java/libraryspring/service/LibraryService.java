package libraryspring.service;

import libraryspring.enteties.Book;
import libraryspring.enteties.Library;
import libraryspring.repositories.BookRepository;
import libraryspring.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private LibraryRepository libraryRepository;


    //add library
    public Library addLibrary(Library library) {
        return libraryRepository.save(library);
    }


    //    addbook to library
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }
//    get library by id;
    public Library getLibrary(int libraryId) {
        return libraryRepository.findById(libraryId);
    }

    public List<Library> findAllLibraries() {
        return libraryRepository.findAll();
    }


//    get book by id;
//    show all books;
//    show all books in lbrary;
//    update book by id;
//    delete book by id;



}
