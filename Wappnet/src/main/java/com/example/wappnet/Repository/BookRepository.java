package com.example.wappnet.Repository;
import com.example.wappnet.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

