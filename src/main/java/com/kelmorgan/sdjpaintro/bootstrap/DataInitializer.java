package com.kelmorgan.sdjpaintro.bootstrap;

import com.kelmorgan.sdjpaintro.domain.AuthorUuid;
import com.kelmorgan.sdjpaintro.domain.Book;
import com.kelmorgan.sdjpaintro.domain.BookUuid;
import com.kelmorgan.sdjpaintro.repositories.AuthorUuidRepository;
import com.kelmorgan.sdjpaintro.repositories.BookRepository;
import com.kelmorgan.sdjpaintro.repositories.BookUuidRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"local", "default"})
@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;
    private final AuthorUuidRepository authorUuidRepository;
    private final BookUuidRepository bookUuidRepository;

    @Override
    public void run(String... args) throws Exception {
        bookRepository.deleteAll();

        Book book1 = new Book("Domain Driven Design", "123", "RandomHouse",null);
        Book savedBook = bookRepository.save(book1);

        Book book2 = new Book("Test Driven Design", "12345", "RandomView",null);
        Book savedBook2 = bookRepository.save(book2);

        bookRepository.findAll().forEach(System.out::println);

        AuthorUuid authorUuid = new AuthorUuid();
        authorUuid.setFirstName("kufre");
        authorUuid.setLastName("Udoko");
        System.out.println("saved AuthorUUid: "+ authorUuidRepository.save(authorUuid));

        BookUuid bookUuid = new BookUuid();
        bookUuid.setTitle("Book uuid title");
        bookUuid.setIsbn("213132144");
        bookUuid.setPublisher("Kufre Publishers");
        System.out.println("saved bookUuid: "+ bookUuidRepository.save(bookUuid));
    }
}
