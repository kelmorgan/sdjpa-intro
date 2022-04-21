package com.kelmorgan.sdjpaintro;

import com.kelmorgan.sdjpaintro.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class SdjpaIntroApplicationTests {

	@Autowired
	BookRepository repository;

	@Test
	void testBookRepository(){
		long count = repository.count();

		assertThat(count).isGreaterThan(0);
	}

	@Test
	void contextLoads() {
	}

}
