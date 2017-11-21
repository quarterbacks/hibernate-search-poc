package io.quarterbacks.search.rest;

import io.quarterbacks.search.domain.Author;
import io.quarterbacks.search.domain.AuthorRepository;
import io.quarterbacks.search.domain.Book;
import io.quarterbacks.search.domain.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    AuthorRepository authorRepository;

    @GetMapping
    ResponseEntity<List<Book>> all() {
        return ResponseEntity.ok(bookRepository.findAll());
    }

    @PostMapping
    @Transactional
    ResponseEntity<Book> create(@RequestParam String title, @RequestParam String authorName) {
        Author author = authorRepository.findByName(authorName);
        if (author == null) {
            Author newAuthor = new Author();
            newAuthor.setName(authorName);
            newAuthor.setStyle("Tragedy");
            author = authorRepository.save(newAuthor);
        }
        Book book = new Book();
        book.setTitle(title);
        book.setDescription("please provide description");
        book.setAuthor(author);
        book = bookRepository.save(book);
        return ResponseEntity.ok(book);
    }
}
