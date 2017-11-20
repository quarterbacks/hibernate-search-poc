package io.quarterbacks.search.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.search.annotations.*;
import org.hibernate.search.annotations.Index;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Indexed
@Entity
@Table(name = "AUTHOR")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_id_seq")
    @SequenceGenerator(name = "author_id_seq", sequenceName = "author_id_seq")
    private Long id;

    @NotNull
    @Field(index = Index.YES, analyze = Analyze.YES, store = Store.YES)
    private String name;

    @NotNull
    @Field(index = Index.YES, analyze = Analyze.YES, store = Store.YES)
    private String style;
}
