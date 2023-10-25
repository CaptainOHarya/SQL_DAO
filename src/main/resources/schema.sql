create schema if not exists netology;
create table if not exists netology.CUSTOMERS
(
    id int primary key AUTO_INCREMENT,
    name varchar(255) not null,
    surname varchar(255) not null,
    age int check ( age > 0 and age < 555 ),
    phone_number varchar(25) not null

);
 # drop table netology.CUSTOMERS;


create table if not exists netology.ORDERS
(
    id int primary key AUTO_INCREMENT,
    date date,
    customer_id int,
    product_name varchar(255) not null,
    amount int check ( amount > 0 ) not null,
    foreign key (customer_id) references CUSTOMERS (id)

);
# drop table netology.ORDERS;

