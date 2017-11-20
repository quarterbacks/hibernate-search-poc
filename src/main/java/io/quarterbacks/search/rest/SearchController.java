package io.quarterbacks.search.rest;

import io.quarterbacks.search.domain.Book;
import io.quarterbacks.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
class SearchController {

    @Autowired
    SearchService searchService;

    @GetMapping
    public ResponseEntity<List<Book>> search(@RequestParam("q") String q) {
        return ResponseEntity.ok(searchService.find(q));
    }
}
