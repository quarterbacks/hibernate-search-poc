INSERT INTO BOOK(id, title, description) VALUES (1,'MACBETH','Macbeth is a tragedy by William Shakespeare; it is thought to have been first performed in 1606. It dramatises the damaging physical and psychological effects of political ambition on those who seek power for its own sake.');
INSERT INTO BOOK(id, title, description) VALUES (2,'Romeo and Juliet','Romeo and Juliet is a tragedy written by William Shakespeare early in his career about two young star-crossed lovers whose deaths ultimately reconcile their feuding families.');
INSERT INTO BOOK(id, title, description) VALUES (3,'A Midsummer Night''s Dream','A Midsummer Night''s Dream is a comedy written by William Shakespeare in 1595/96. It portrays the events surrounding the marriage of Theseus, the Duke of Athens, to Hippolyta, the former queen of the Amazons.');
INSERT INTO BOOK(id, title, description) VALUES (4,'Othello','Othello is a tragedy by William Shakespeare, believed to have been written in 1603. It is based on the story Un Capitano Moro by Cinthio, a disciple of Boccaccio, first published in 1565');
ALTER SEQUENCE book_id_seq RESTART WITH 500;

INSERT INTO AUTHOR(id, name, style) VALUES (1,'William Shakespeare','Drama');
ALTER SEQUENCE book_id_seq RESTART WITH 200;