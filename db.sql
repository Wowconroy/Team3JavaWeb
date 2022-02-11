USE test;

DROP TABLE IF EXISTS library;
CREATE TABLE library
(
    book_id      BIGINT NOT NULL,
    title        VARCHAR(255),
    description  VARCHAR(255),
    release_year INTEGER,
    rate         DOUBLE PRECISION,
    CONSTRAINT pk_books PRIMARY KEY (book_id)
);

INSERT INTO library (title,description,release_year, rate)
VALUES
  ('To Kill a Mockingbird', 'Detective and Mystery', 1960, 3),
  ('Pride and Prejudice', 'It is a truth universally acknowledged that when most people think of Jane Austen they think of this charming and humorous story of love, difficult families and the tricky task of finding a handsome husband with a good fortune.'
  , 1813, 3),
  ('The Great Gatsby', 'Jay Gatsby, the enigmatic millionaire who throws decadent parties but doesn’t attend them, is one of the great characters of American literature.'
  , 1925, 7),
  ('One Hundred Years of Solitude', ' Gabriel García Márquez’s multi-generational spanning magnum opus was a landmark in Spanish literature.',
   1967, 5),
  ('In Cold Blood', 'The ‘true crime’ TV show / podcast you’re obsessed with probably owes a debt to this masterpiece of reportage by Truman Capote. Chilling and brilliant.',
   1965, 1),
  ('Wide Sargasso Sea ', 'Jean Rhys wrote this feminist and anti-colonial prequel to Charlotte Bronte’s novel Jane Eyre which chronicles the events of Mr Rochester’s disastrous marriage to Antoinette Conway or Bertha as we come to know her.',
   1966, 6),
  ('Brave New World', 'One of the greatest and most prescient dystopian novels ever written, this should be on everyone’s must-read list.',
   1932, 4),
  (' I Capture The Castle', 'Cassandra Mortmain’s upbringing in a crumbling castle with her eccentric family may not be everyone’s experience, but we can guarantee her coming-of-age story with all its enchanting and disenchanting moments will resonate for many.',
   1948, 5)