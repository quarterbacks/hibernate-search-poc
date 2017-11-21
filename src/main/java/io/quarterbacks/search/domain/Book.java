package io.quarterbacks.search.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.search.annotations.*;
import org.hibernate.search.annotations.Index;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Entity
@Indexed
@Table(name = "BOOK")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_id_seq")
    @SequenceGenerator(name = "book_id_seq", sequenceName = "book_id_seq")
    private Long id;

    @Field(index = Index.YES, analyze = Analyze.YES, store = Store.YES)
    @NotNull
    private String title;

    @Field(index = Index.YES, analyze = Analyze.YES, store = Store.YES)
    @NotNull
    private String description;

    @IndexedEmbedded
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

}
