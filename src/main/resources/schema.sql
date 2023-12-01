create table book(
    id int auto_increment,
    title varchar(255) NOT NULL,
    pages int NOT NULL,
    author varchar(255) NOT NULL
);

insert into book(title,pages,author) values('Springboot up and running',328,'Mark Heckler');