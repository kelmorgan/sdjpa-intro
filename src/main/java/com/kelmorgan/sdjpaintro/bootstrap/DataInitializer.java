package com.kelmorgan.sdjpaintro.bootstrap;

import com.kelmorgan.sdjpaintro.domain.Book;
import com.kelmorgan.sdjpaintro.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;
    @Override
    public void run(String... args) throws Exception {
        Book book1 = new Book("Domain Driven Design","123","RandomHouse");

        System.out.println("Id: "+ book1.getId());
        Book savedBook = bookRepository.save(book1);

        System.out.println("savedBookId: "+ savedBook.getId());
        Book book2 = new Book("Test Driven Design","12345","RandomView");

        Book savedBook2 = bookRepository.save(book2);

        Book book3 = new Book("Model Driven Design","1234565","RandomTop");
        Book savedBook3 = bookRepository.save(book3);

        bookRepository.findAll().forEach(System.out::println);
    }
}
