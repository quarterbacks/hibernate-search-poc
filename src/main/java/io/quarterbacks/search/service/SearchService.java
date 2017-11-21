package io.quarterbacks.search.service;

import io.quarterbacks.search.domain.AuthorRepository;
import io.quarterbacks.search.domain.Book;
import io.quarterbacks.search.domain.BookRepository;
import org.apache.lucene.search.Query;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.FullTextQuery;
import org.hibernate.search.jpa.Search;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class SearchService {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Transactional
    public List<Book> find(String q) {

        EntityManager em = entityManagerFactory.createEntityManager();
        FullTextEntityManager fullTextEntityManager = Search.getFullTextEntityManager(em);

        QueryBuilder qb = fullTextEntityManager.getSearchFactory().buildQueryBuilder().forEntity(Book.class).get();
        Query luceneQuery = qb.keyword()
                .onFields("title",
                        "description",
                        "author.name")
                .matching(q)
                .createQuery();

        FullTextQuery query = fullTextEntityManager.createFullTextQuery(luceneQuery, Book.class);

        return query.getResultList();
    }
}
