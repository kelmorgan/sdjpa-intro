package com.kelmorgan.sdjpaintro.repositories;

import com.kelmorgan.sdjpaintro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
