create database ticket_booking;

-- drop database ticket_booking;

use ticket_booking;

create table users (
    user_id int auto_increment primary key,
    name varchar(100) NOT NULL,
    phno BIGINT, 
    email varchar(200),
    address text,
    user_name varchar(100) UNIQUE NOT NULL,
    password varchar(100) NOT NULL, 
    created_by varchar(100) default 'system',
    create_date timestamp default current_timestamp, 
    modified_by varchar(100) default 'system',
    modified_date timestamp default current_timestamp on update current_timestamp
);

create table screens (
    screen_id int auto_increment primary key,
    screen_name varchar(100) NOT NULL,
    location varchar(200),
    city varchar(100),
    state varchar(100),
    country varchar(100),
    seating_capacity int,
    created_by varchar(100) default 'system',
    create_date timestamp default current_timestamp, 
    modified_by varchar(100) default 'system',
    modified_date timestamp default current_timestamp on update current_timestamp
);

create table movies (
    movie_id int auto_increment primary key,
    movie_title varchar(200) NOT NULL,
    duration int,
    rating varchar(20),
    release_date date,
    audio_language varchar(100),
    created_by varchar(100) default 'system',
    create_date timestamp default current_timestamp, 
    modified_by varchar(100) default 'system',
    modified_date timestamp default current_timestamp on update current_timestamp
);


create table showtimes (
    schedule_id int auto_increment primary key,
    screen_id int,
    movie_id int,
    show_time time,
    is_active char(1),
    current_movie_id int,
    created_by varchar(100) default 'system',
    create_date timestamp default current_timestamp, 
    modified_by varchar(100) default 'system',

    modified_date timestamp default current_timestamp on update current_timestamp,
    foreign key (screen_id) references screens(screen_id),
    foreign key (movie_id) references movies(movie_id)
);


create table seats (
    seat_id int auto_increment primary key,
    screen_id int,
    seat_number varchar(5),
    seat_price int,
    created_by varchar(100) default 'system',
    create_date timestamp default current_timestamp, 
    modified_by varchar(100) default 'system',
    modified_date timestamp default current_timestamp on update current_timestamp,
    foreign key (screen_id) references screens(screen_id)
);


create table bookings (
    booking_id int auto_increment primary key,
    booking_number int, 
    user_id int,
    movie_id int,
    schedule_id int, 
    screen_id int,
    seat_id int,
    total_price int,
    booking_status varchar(50),
    created_by varchar(100) default 'system',
    create_date timestamp default current_timestamp, 
    modified_by varchar(100) default 'system',
    modified_date timestamp default current_timestamp on update current_timestamp,
    
    foreign key (user_id) references users(user_id),
    foreign key (movie_id) references movies(movie_id),
    foreign key (schedule_id) references showtimes(schedule_id),
    foreign key (screen_id) references screens(screen_id),
    foreign key (seat_id) references seats(seat_id)
);

create table payment_methods (
    payment_method_id int auto_increment primary key,
    payment_method_name varchar(100)
);


create table transactions (
    txn_id int auto_increment primary key,
    txn_date timestamp default current_timestamp,
    booking_number int,
    txn_amt int,
    txn_status varchar(50),
    payment_method_id int,
    
    created_by varchar(100) default 'system',
    create_date timestamp default current_timestamp, 
    modified_by varchar(100) default 'system',
    modified_date timestamp default current_timestamp on update current_timestamp,
    foreign key (payment_method_id) references payment_methods(payment_method_id)
);

select *
from users;

select *
from screens;

select *
from movies;

select *
from showtimes;

select *
from seats;

insert into movies values
(1,'Avengers: Endgame',181,'PG-13','2019-04-26','English','Admin','2018-01-01','Admin','2019-04-25'),
(2,'The Lion King',118,'PG','2019-07-19','English','Admin','2017-06-01','Admin','2019-07-18'),
(3,'Joker',122,'R','2019-10-04','English','Admin','2018-03-01','Admin','2019-10-03'),
(4,'Spider-Man: Far From Home',129,'PG-13','2019-07-02','English','Admin','2018-04-01','Admin','2019-07-01'),
(5,'Toy Story 4',104,'PG','2019-06-21','English','Admin','2017-09-01','Admin','2019-06-20'),
(6,'The Hunger Games: The Ballad of Songbirds & Snakes',157,'PG-13','2024-11-17','English','Admin','2024-11-01','Admin','2024-11-17'),
(7,'Killers of the Flower Moon',206,'R','2024-10-20','English','Admin','2024-09-15','Admin','2024-10-19'),
(8,'The Marvels',105,'PG-13','2024-11-10','English','Admin','2024-10-01','Admin','2024-11-09'),
(9,'Dangal',161,'U/A','2016-12-23','Hindi','Admin','2016-10-01','Admin','2016-12-23'),
(10,'Lagaan',224,'U/A','2001-06-15','Hindi','Admin','2001-05-01','Admin','2001-06-15'),
(11,'RRR',187,'UA','2022-03-25','Telugu','Admin','2022-03-01','Admin','2022-03-25'),
(12,'Pushpa: The Rise',179,'U/A','2021-12-17','Telugu','Admin','2021-11-01','Admin','2021-12-17'),
(13,'Baahubali: The Conclusion',167,'U/A','2017-04-28','Telugu','Admin','2017-04-01','Admin','2017-04-28'),
(14,'KGF: Chapter 2',168,'U/A','2022-04-14','Kannada','Admin','2022-03-01','Admin','2022-04-14'),
(15,'Jawan',150,'U/A','2023-09-07','Hindi','Admin','2023-08-01','Admin','2023-09-07'),
(16,'Brahmastra: Part One – Shiva',168,'U/A','2022-09-09','Hindi','Admin','2022-08-01','Admin','2022-09-09'),
(17,'Spider-Man: No Way Home',148,'PG-13','2021-12-17','English','Admin','2021-10-01','Admin','2021-12-17'),
(18,'The Kashmir Files',170,'U/A','2022-03-11','Hindi','Admin','2022-02-01','Admin','2022-03-11'),
(19,'Laal Singh Chaddha',159,'U/A','2022-08-11','Hindi','Admin','2022-07-01','Admin','2022-08-11'),
(20,'Sooryavanshi',145,'U/A','2021-11-05','Hindi','Admin','2021-10-01','Admin','2021-11-05'),
(21,'Mr. Bean''s Holiday',90,'PG','2007-03-30','English','Admin','2007-01-01','Admin','2007-03-30'),
(22,'Johnny English',88,'PG','2003-04-06','English','Admin','2003-01-01','Admin','2003-04-06'),
(23,'Johnny English Reborn',101,'PG','2011-10-28','English','Admin','2011-08-01','Admin','2011-10-28'),
(24,'Avengers: Infinity War',149,'PG-13','2018-04-27','English','Admin','2017-08-01','Admin','2018-04-25'),
(25,'Iron Man',126,'PG-13','2008-05-02','English','Admin','2007-01-01','Admin','2008-05-02'),
(26,'Kung Fu Panda',92,'PG','2008-06-06','English','Admin','2008-04-01','Admin','2008-06-06'),
(27,'Kung Fu Panda 2',90,'PG','2011-05-26','English','Admin','2011-05-01','Admin','2011-05-26'),
(28,'Kung Fu Panda 3',95,'PG','2016-01-29','English','Admin','2015-12-01','Admin','2016-01-29'),
(29,'Cars',117,'G','2006-06-09','English','Admin','2006-05-01','Admin','2006-06-09'),
(30,'Cars 2',106,'G','2011-06-24','English','Admin','2011-05-01','Admin','2011-06-24'),
(31,'Cars 3',102,'G','2017-06-16','English','Admin','2017-05-01','Admin','2017-06-16'),
(32,'Zootopia',108,'PG','2016-03-17','English','Admin','2015-12-01','Admin','2016-03-17'),
(33,'Up',96,'G','2009-05-29','English','Admin','2009-01-01','Admin','2009-05-29'),
(34,'WALL-E',98,'G','2008-06-27','English','Admin','2008-05-01','Admin','2008-06-27'),
(35,'Finding Nemo',100,'G','2003-05-30','English','Admin','2003-03-01','Admin','2003-05-30'),
(36,'Arya',144,'U/A','2004-03-14','Telugu','Admin','2004-02-01','Admin','2004-03-14'),
(37,'Monsters',92,'G','2001-11-02','English','Admin','2001-09-01','Admin','2001-11-02'),
(38,'The Incredibles',115,'PG','2004-11-05','English','Admin','2004-10-01','Admin','2004-11-05'),
(39,'Shrek',90,'PG','2001-04-22','English','Admin','2001-03-01','Admin','2001-04-22'),
(40,'Shrek 2',93,'PG','2004-05-19','English','Admin','2004-04-01','Admin','2004-05-19'),
(41,'Shrek 3',93,'PG','2007-05-18','English','Admin','2007-04-01','Admin','2007-05-18'),
(42,'The Croods',98,'PG','2013-03-22','English','Admin','2013-01-01','Admin','2013-03-22'),
(43,'The Croods: A New Age',95,'PG','2020-11-25','English','Admin','2020-10-01','Admin','2020-11-25'),
(44,'Despicable Me',95,'PG','2010-07-09','English','Admin','2010-06-01','Admin','2010-07-09'),
(45,'Despicable Me 2',98,'PG','2013-07-03','English','Admin','2013-06-01','Admin','2013-07-03'),
(46,'Despicable Me 3',96,'PG','2017-06-30','English','Admin','2017-05-01','Admin','2017-06-30'),
(47,'Minions',91,'PG','2015-07-10','English','Admin','2015-06-01','Admin','2015-07-10'),
(48,'Kung Fu Panda: Secrets of the Furious Five',45,'PG','2008-11-25','English','Admin','2008-11-01','Admin','2008-11-25'),
(49,'Kung Fu Panda: Legends of Awesomeness',22,'TV-Y','2011-11-07','English','Admin','2011-10-01','Admin','2011-11-07'),
(50,'Monsters University',104,'G','2013-06-21','English','Admin','2013-05-01','Admin','2013-06-21'),
(51,'Puspha the rule',180,'U/A','2024-12-05','Telugu','Admin','2014-10-20','Admin','2015-07-22'),
(52,'Mr.Bachan',135,'U/A','2024-08-15','Telugu','Admin','2014-10-21','Admin','2016-07-22'),
(53,'Acharya',169,'UA','2022-04-29','Telugu','Admin','2014-10-22','Admin','2016-07-23'),
(54,'Agent',140,'U/A','2023-04-28','Telugu','Admin','2014-10-23','Admin','2016-07-24'),
(55,'Bhola Shankar',155,'U/A','2023-08-11','Telugu','Admin','2014-10-24','Admin','2016-07-25'),
(56,'Stree 2',137,'U/A','2024-08-15','Telugu','Admin','2014-10-25','Admin','2016-07-26'),
(57,'Double Ismart',175,'U/A','2024-08-15','Telugu','Admin','2014-10-26','Admin','2016-07-27'),
(58,'Bramothasavam',169,'U/A','2016-06-23','Telugu','Admin','2014-10-27','Admin','2016-07-28'),
(59,'Skanda',133,'U/A','2023-10-23','Telugu','Admin','2014-10-28','Admin','2016-07-29'),
(60,'Animal',210,'R','2023-12-01','Telugu','Admin','2014-10-29','Admin','2016-07-30');


INSERT INTO screens (screen_id, screen_name, location, city, state, country, seating_capacity, created_by, create_date, modified_by, modified_date) VALUES
(1, 'Screen 1', 'CMR Central', 'Visakhapatnam', 'Andhra Pradesh', 'India', 15, 'Admin', '2024-01-01', 'Admin', '2024-11-21'),
(2, 'Screen 2', 'Mukta A2 Cinemas', 'Visakhapatnam', 'Andhra Pradesh', 'India', 12, 'Admin', '2024-01-01', 'Admin', '2024-11-21'),
(3, 'Screen 3', 'INOX - Varun Beach', 'Visakhapatnam', 'Andhra Pradesh', 'India', 20, 'Admin', '2024-01-01', 'Admin', '2024-11-21'),
(4, 'Screen 4', 'PVR - MVP', 'Visakhapatnam', 'Andhra Pradesh', 'India', 18, 'Admin', '2024-01-01', 'Admin', '2024-11-21'),
(5, 'Screen 5', 'Cinepolis - Jagadamba', 'Visakhapatnam', 'Andhra Pradesh', 'India', 22, 'Admin', '2024-01-01', 'Admin', '2024-11-21'),
(6, 'Screen 6', 'GVK One Mall', 'Visakhapatnam', 'Andhra Pradesh', 'India', 10, 'Admin', '2024-01-01', 'Admin', '2024-11-21'),
(7, 'Screen 7', 'Big Cinemas - Simhachalam', 'Visakhapatnam', 'Andhra Pradesh', 'India', 12, 'Admin', '2024-01-01', 'Admin', '2024-11-21'),
(8, 'Screen 8', 'IMAX - Vizag', 'Visakhapatnam', 'Andhra Pradesh', 'India', 25, 'Admin', '2024-01-01', 'Admin', '2024-11-21'),
(9, 'Screen 9', 'MMR Cinemas', 'Visakhapatnam', 'Andhra Pradesh', 'India', 20, 'Admin', '2024-01-01', 'Admin', '2024-11-21'),
(10, 'Screen 10', 'Ambica Cinema', 'Visakhapatnam', 'Andhra Pradesh', 'India', 15, 'Admin', '2024-01-01', 'Admin', '2024-11-21'),
(11, 'Screen 11', 'Star Cinemas', 'Visakhapatnam', 'Andhra Pradesh', 'India', 18, 'Admin', '2024-01-01', 'Admin', '2024-11-21'),
(12, 'Screen 12', 'Platinum Cinemas', 'Visakhapatnam', 'Andhra Pradesh', 'India', 12, 'Admin', '2024-01-01', 'Admin', '2024-11-21'),
(13, 'Screen 13', 'Silver Screen', 'Visakhapatnam', 'Andhra Pradesh', 'India', 10, 'Admin', '2024-01-01', 'Admin', '2024-11-21'),
(14, 'Screen 14', 'Rama Cinema', 'Visakhapatnam', 'Andhra Pradesh', 'India', 8, 'Admin', '2024-01-01', 'Admin', '2024-11-21'),
(15, 'Screen 15', 'Sun Cinemas', 'Visakhapatnam', 'Andhra Pradesh', 'India', 15, 'Admin', '2024-01-01', 'Admin', '2024-11-21');


INSERT INTO showtimes (screen_id, show_time, is_active, current_movie_id) VALUES
(1, '10:00:00', 1, 1),  -- Avengers: Endgame
(1, '13:30:00', 1, 5),  -- Toy Story 4
(1, '17:00:00', 1, 11), -- RRR
(1, '20:30:00', 1, 15); -- Jawan


INSERT INTO showtimes (screen_id, show_time, is_active, current_movie_id) VALUES
(2, '10:30:00', 1, 2),  -- The Lion King
(2, '14:00:00', 1, 8),  -- The Marvels
(2, '17:30:00', 1, 14), -- KGF: Chapter 2
(2, '21:00:00', 1, 18); -- The Kashmir Files


INSERT INTO showtimes (screen_id, show_time, is_active, current_movie_id) VALUES
(3, '11:00:00', 1, 3),  -- Joker
(3, '14:30:00', 1, 9),  -- Dangal 
(3, '18:00:00', 1, 17), -- Spider-Man: No Way Home
(3, '21:30:00', 1, 21); -- Mr. Bean's Holiday


INSERT INTO showtimes (screen_id, show_time, is_active, current_movie_id) VALUES
(4, '10:00:00', 1, 4),  -- Spider-Man: Far From Home
(4, '13:00:00', 1, 10), -- Lagaan
(4, '16:30:00', 1, 18), -- The Kashmir Files
(4, '20:00:00', 1, 22); -- Johnny English


INSERT INTO showtimes (screen_id, show_time, is_active, current_movie_id) VALUES
(5, '11:30:00', 1, 6),  -- The Hunger Games
(5, '15:00:00', 1, 12), -- Pushpa: The Rise
(5, '18:30:00', 1, 20), -- Sooryavanshi
(5, '22:00:00', 1, 24); -- Avengers: Infinity War



INSERT INTO showtimes (screen_id, show_time, is_active, current_movie_id) VALUES
(6, '10:15:00', 1, 7),  -- Killers of the Flower Moon
(6, '14:00:00', 1, 13), -- Baahubali: The Conclusion
(6, '17:45:00', 1, 19), -- Laal Singh Chaddha
(6, '21:30:00', 1, 25); -- Iron Man


INSERT INTO showtimes (screen_id, show_time, is_active, current_movie_id) VALUES
(7, '10:45:00', 1, 8),  -- The Marvels
(7, '14:15:00', 1, 16), -- Brahmastra: Part One - Shiva
(7, '18:00:00', 1, 23), -- Johnny English Reborn
(7, '21:45:00', 1, 29); -- Cars

INSERT INTO showtimes (screen_id, show_time, is_active, current_movie_id) VALUES
(8, '10:00:00', 1, 11), -- RRR
(8, '13:30:00', 1, 17), -- Spider-Man: No Way Home
(8, '17:00:00', 1, 26), -- Kung Fu Panda
(8, '20:30:00', 1, 33); -- Up


INSERT INTO showtimes (screen_id, show_time, is_active, current_movie_id) VALUES
(9, '10:30:00', 1, 14), -- KGF: Chapter 2
(9, '14:00:00', 1, 21), -- Mr. Bean's Holiday
(9, '17:30:00', 1, 27), -- Kung Fu Panda 2
(9, '21:00:00', 1, 34); -- WALL-E


INSERT INTO showtimes (screen_id, show_time, is_active, current_movie_id) VALUES
(10, '11:15:00', 1, 15), -- Jawan
(10, '14:45:00', 1, 22), -- Johnny English
(10, '18:15:00', 1, 28), -- Kung Fu Panda 3
(10, '21:45:00', 1, 35); -- Finding Nemo

INSERT INTO showtimes (screen_id, show_time, is_active, current_movie_id) VALUES
(11, '10:00:00', 1, 18), -- The Kashmir Files
(11, '13:30:00', 1, 24), -- Avengers: Infinity War
(11, '17:00:00', 1, 30), -- Cars 2
(11, '20:30:00', 1, 36); -- Arya

INSERT INTO showtimes (screen_id, show_time, is_active, current_movie_id) VALUES
(12, '10:45:00', 1, 19), -- Laal Singh Chaddha
(12, '14:15:00', 1, 25), -- Iron Man
(12, '17:45:00', 1, 31), -- Cars 3
(12, '21:15:00', 1, 37); -- Monsters

INSERT INTO showtimes (screen_id, show_time, is_active, current_movie_id) VALUES
(13, '11:00:00', 1, 20), -- Sooryavanshi
(13, '14:30:00', 1, 29), -- Cars
(13, '18:00:00', 1, 32), -- Zootopia
(13, '21:30:00', 1, 38); -- The Incredibles

INSERT INTO showtimes (screen_id, show_time, is_active, current_movie_id) VALUES
(14, '10:15:00', 1, 23), -- Johnny English Reborn
(14, '13:45:00', 1, 30), -- Cars 2
(14, '17:15:00', 1, 35), -- Finding Nemo
(14, '20:45:00', 1, 39); -- Shrek

INSERT INTO showtimes (screen_id, show_time, is_active, current_movie_id) VALUES
(15, '10:00:00', 1, 26), -- Kung Fu Panda
(15, '13:00:00', 1, 31), -- Cars 3
(15, '16:30:00', 1, 37), -- Monsters
(15, '20:00:00', 1, 40); -- Shrek 2

INSERT INTO seats (screen_id, seat_number, seat_price) VALUES
(1, 'A1', 200),
(1, 'A2', 200),
(1, 'A3', 200),
(1, 'A4', 200),
(1, 'A5', 200),
(1, 'A6', 200),
(1, 'A7', 200),
(1, 'A8', 200),
(1, 'A9', 200),
(1, 'A10', 200),
(1, 'B1', 150),
(1, 'B2', 170),
(1, 'B3', 150),
(1, 'B4', 170),
(1, 'B5', 150),
(2, 'A1', 200),
(2, 'A2', 200),
(2, 'A3', 200),
(2, 'A4', 200),
(2, 'A5', 200),
(2, 'A6', 200),
(2, 'A7', 200),
(2, 'A8', 200),
(2, 'A9', 200),
(2, 'A10', 200),
(2, 'B1', 150),
(2, 'B2', 170),
(3, 'A1', 200),
(3, 'A2', 200),
(3, 'A3', 200),
(3, 'A4', 200),
(3, 'A5', 200),
(3, 'A6', 200),
(3, 'A7', 200),
(3, 'A8', 200),
(3, 'A9', 200),
(3, 'A10', 200),
(3, 'B1', 150),
(3, 'B2', 170),
(3, 'B3', 150),
(3, 'B4', 170),
(3, 'B5', 150),
(3, 'B6', 170),
(3, 'B7', 150),
(3, 'B8', 170),
(3, 'B9', 150),
(3, 'B10', 170),
(4, 'A1', 200),
(4, 'A2', 200),
(4, 'A3', 200),
(4, 'A4', 200),
(4, 'A5', 200),
(4, 'A6', 200),
(4, 'A7', 200),
(4, 'A8', 200),
(4, 'A9', 200),
(4, 'A10', 200),
(4, 'B1', 150),
(4, 'B2', 170),
(4, 'B3', 150),
(4, 'B4', 170),
(4, 'B5', 150),
(4, 'B6', 170),
(4, 'B7', 150),
(4, 'B8', 170),
(5, 'A1', 200),
(5, 'A2', 200),
(5, 'A3', 200),
(5, 'A4', 200),
(5, 'A5', 200),
(5, 'A6', 200),
(5, 'A7', 200),
(5, 'A8', 200),
(5, 'A9', 200),
(5, 'A10', 200),
(5, 'B1', 150),
(5, 'B2', 170),
(5, 'B3', 150),
(5, 'B4', 170),
(5, 'B5', 150),
(5, 'B6', 170),
(5, 'B7', 150),
(5, 'B8', 170),
(5, 'B9', 150),
(5, 'B10', 170),
(5, 'C1', 150),
(5, 'C2', 170),
(6, 'A1', 200),
(6, 'A2', 200),
(6, 'A3', 200),
(6, 'A4', 200),
(6, 'A5', 200),
(6, 'A6', 200),
(6, 'A7', 200),
(6, 'A8', 200),
(6, 'A9', 200),
(6, 'A10', 200),
(7, 'A1', 200),
(7, 'A2', 200),
(7, 'A3', 200),
(7, 'A4', 200),
(7, 'A5', 200),
(7, 'A6', 200),
(7, 'A7', 200),
(7, 'A8', 200),
(7, 'A9', 200),
(7, 'A10', 200),
(7, 'B1', 150),
(7, 'B2', 170),
(8, 'A1', 200),
(8, 'A2', 200),
(8, 'A3', 200),
(8, 'A4', 200),
(8, 'A5', 200),
(8, 'A6', 200),
(8, 'A7', 200),
(8, 'A8', 200),
(8, 'A9', 200),
(8, 'A10', 200),
(8, 'B1', 150),
(8, 'B2', 170),
(8, 'B3', 150),
(8, 'B4', 170),
(8, 'B5', 150),
(8, 'B6', 170),
(8, 'B7', 150),
(8, 'B8', 170),
(8, 'B9', 150),
(8, 'B10', 170),
(8, 'C1', 150),
(8, 'C2', 170),
(8, 'C3', 150),
(8, 'C4', 170),
(8, 'C5', 150),
(9, 'A1', 200),
(9, 'A2', 200),
(9, 'A3', 200),
(9, 'A4', 200),
(9, 'A5', 200),
(9, 'A6', 200),
(9, 'A7', 200),
(9, 'A8', 200),
(9, 'A9', 200),
(9, 'A10', 200),
(9, 'B1', 150),
(9, 'B2', 170),
(9, 'B3', 150),
(9, 'B4', 170),
(9, 'B5', 150),
(9, 'B6', 170),
(9, 'B7', 150),
(9, 'B8', 170),
(9, 'B9', 150),
(9, 'B10', 170),
(10, 'A1', 200),
(10, 'A2', 200),
(10, 'A3', 200),
(10, 'A4', 200),
(10, 'A5', 200),
(10, 'A6', 200),
(10, 'A7', 200),
(10, 'A8', 200),
(10, 'A9', 200),
(10, 'A10', 200),
(10, 'B1', 150),
(10, 'B2', 170),
(10, 'B3', 150),
(10, 'B4', 170),
(10, 'B5', 150),
(11, 'A1', 200),
(11, 'A2', 200),
(11, 'A3', 200),
(11, 'A4', 200),
(11, 'A5', 200),
(11, 'A6', 200),
(11, 'A7', 200),
(11, 'A8', 200),
(11, 'A9', 200),
(11, 'A10', 200),
(11, 'B1', 150),
(11, 'B2', 170),
(11, 'B3', 150),
(11, 'B4', 170),
(11, 'B5', 150),
(11, 'B6', 170),
(11, 'B7', 150),
(11, 'B8', 170),
(12, 'A1', 200),
(12, 'A2', 200),
(12, 'A3', 200),
(12, 'A4', 200),
(12, 'A5', 200),
(12, 'A6', 200),
(12, 'A7', 200),
(12, 'A8', 200),
(12, 'A9', 200),
(12, 'A10', 200),
(12, 'B1', 150),
(12, 'B2', 170),
(13, 'A1', 200),
(13, 'A2', 200),
(13, 'A3', 200),
(13, 'A4', 200),
(13, 'A5', 200),
(13, 'A6', 200),
(13, 'A7', 200),
(13, 'A8', 200),
(13, 'A9', 200),
(13, 'A10', 200),
(14, 'A1', 200),
(14, 'A2', 200),
(14, 'A3', 200),
(14, 'A4', 200),
(14, 'A5', 200),
(14, 'A6', 200),
(14, 'A7', 200),
(14, 'A8', 200),
(15, 'A1', 200),
(15, 'A2', 200),
(15, 'A3', 200),
(15, 'A4', 200),
(15, 'A5', 200),
(15, 'A6', 200),
(15, 'A7', 200),
(15, 'A8', 200),
(15, 'A9', 200),
(15, 'A10', 200),
(15, 'B1', 150),
(15, 'B2', 170),
(15, 'B3', 150),
(15, 'B4', 170),
(15, 'B5', 150);