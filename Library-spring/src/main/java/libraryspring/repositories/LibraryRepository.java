package libraryspring.repositories;

import libraryspring.enteties.Library;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibraryRepository extends JpaRepository<Library,String> {

    @Override
    List<Library> findAll();


    Library findById(int libraryId);
}
