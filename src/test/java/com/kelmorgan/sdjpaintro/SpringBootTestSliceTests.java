package com.kelmorgan.sdjpaintro;

import com.kelmorgan.sdjpaintro.domain.Book;
import com.kelmorgan.sdjpaintro.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class SpringBootTestSliceTests {

    @Autowired
    BookRepository bookRepository;

    @Test
    void test1(){
        long countBefore = bookRepository.count();

        bookRepository.save(new Book("My new Book","123144","Self"));

        long countAfter = bookRepository.count();

        assertThat(countBefore).isLessThan(countAfter);
    }
}
