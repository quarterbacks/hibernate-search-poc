-- authors
INSERT INTO AUTHOR (id, name, style) VALUES (1,'William Shakespeare','Drama');
ALTER SEQUENCE book_id_seq RESTART WITH 50;

-- books
INSERT INTO BOOK (id, title, description, author_id) VALUES (1,'MACBETH','Macbeth is a tragedy by William Shakespeare; it is thought to have been first performed in 1606. It dramatises the damaging physical and psychological effects of political ambition on those who seek power for its own sake.',1);
INSERT INTO BOOK (id, title, description, author_id) VALUES (50,'Romeo and Juliet','Romeo and Juliet is a tragedy written by William Shakespeare early in his career about two young star-crossed lovers whose deaths ultimately reconcile their feuding families.',1);
INSERT INTO BOOK (id, title, description, author_id) VALUES (100,'A Midsummer Nights Dream','A Midsummer Nights Dream is a comedy written by William Shakespeare in 1595/96. It portrays the events surrounding the marriage of Theseus, the Duke of Athens, to Hippolyta, the former queen of the Amazons.',1);
INSERT INTO BOOK (id, title, description, author_id) VALUES (150,'Othello','Othello is a tragedy by William Shakespeare, believed to have been written in 1603. It is based on the story Un Capitano Moro by Cinthio, a disciple of Boccaccio, first published in 1565',1);
ALTER SEQUENCE book_id_seq RESTART WITH 200;

