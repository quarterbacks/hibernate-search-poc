package io.quarterbacks.search;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import javax.persistence.EntityManager;

@Slf4j
public class BookCommandLineRunner implements CommandLineRunner {

    @Autowired
    EntityManager entityManager;

    @Override
    public void run(String... args) throws Exception {
        log.info("Indexing existing entities");
        FullTextEntityManager fullTextEntityManager = Search.getFullTextEntityManager(entityManager);
        fullTextEntityManager.createIndexer().startAndWait();
        log.info("indexation finished");
    }
}
