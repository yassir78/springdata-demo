package io.chaosmaker.jpa.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        //insertAuthorWithBooks();
        //insertNewBook();
        //fetchBooksOfAuthorByIdAndDeleteFirstBook();
    }

    public void fetchBooksOfAuthorById() {
    }

    public void insertNewBook() {
    }

    @Transactional
    public void fetchBooksOfAuthorByIdAndDeleteFirstBook() {
    }

    public void fetchPageBooksOfAuthorById() {
    }

    @Transactional
    public void fetchBooksOfAuthorByIdAndAddNewBook() {
    }

}
