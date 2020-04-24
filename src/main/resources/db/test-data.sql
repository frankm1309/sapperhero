DELETE FROM hero;
INSERT INTO hero(ID, CITY, COUNTRY, EMAIL, FIRSTNAME, HOUSENUMBER, LASTNAME, PASSWORD, PHONENUMBER, POSTALCODE, STREET) VALUES
  (5, 'Utrecht', 'Holland', 'amail@mail.com', 'Sam', 104, 'Loe', '456pass', '0622345678', '1010BA', 'Wegstraat'),
  (6, 'Utrecht', 'Holland', 'bmail@mail.com', 'Sarah', 105, 'Coe', 'pass456', '0622345678', '1010BB', 'Autostraat'),
  (7, 'Utrecht', 'Holland', 'cmail@mail.com', 'Simon', 106, 'Noe', '654pass', '0622345678', '1010BC', 'Fietstraat'),
  (8, 'Utrecht', 'Holland', 'lmail@mail.com', 'Sally', 107, 'Poe', 'pass654', '0622345678', '1010BD', 'Loopstraat');

DELETE FROM job;
INSERT INTO job(JOB_TYPE, ID, COMPLETED, DESCRIPTION, JOBTIMEANDDATE, TYPE) VALUES
('Job', 1, 0x00, 'please mow my lawn', NULL, 'GARDENING'),
('Job', 2, 0x00, 'please drive me to the doctor', NULL, 'TRANSPORTATION'),
('Job', 3, 0x00, 'cut the hedge', NULL, 'GARDENING'),
('Job', 4, 0x00, 'I need beer and chips', NULL, 'GROCERIES');

DELETE FROM client;
INSERT INTO client(ID, CITY, COUNTRY, EMAIL, FIRSTNAME, HOUSENUMBER, LASTNAME, PASSWORD, PHONENUMBER, POSTALCODE, STREET, JOB_ID) VALUES
(1, 'Utrecht', 'Holland', 'mail@mail.com', 'John', 100, 'Doe', '123pass', '0612345678', '1010AA', 'Straatweg', 4),
(2, 'Utrecht', 'Holland', 'email@mail.com', 'Jill', 101, 'Woe', 'pass123', '0612345678', '1010AB', 'Autoweg', 3),
(3, 'Utrecht', 'Holland', 'gmail@mail.com', 'Jack', 102, 'Moe', '321pass', '0612345678', '1010AC', 'Fietsweg', 2),
(4, 'Utrecht', 'Holland', 'hmail@mail.com', 'Joe', 103, 'Hoe', 'pass321', '0612345678', '1010AD', 'Loopweg', 1);


DELETE FROM hero_job;
INSERT INTO hero_job(HERO_ID, JOBS_ID) VALUES
(5, 1),
(6, 3),
(8, 4),
(8, 2);
