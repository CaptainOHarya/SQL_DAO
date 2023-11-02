insert into netology.customers(name, surname, age, phone_number)
values ('Marina', 'Tundra', 35, '+79047779890'),
       ('Erika', 'Kulula', 27, '+479002345566'),
       ('Anatoly', 'Casperchak', 67, '+79601245693'),
       ('Alexey', 'Maltcev', 45, '+79104807623'),
       ('Vitaly', 'Kurolesov', 37, '+129056789467'),
       ('Alexey', 'Lyoko', 36, '++349056548923'),
       ('Alien Kesha', '-', 178, '~Y~h232323424'),
       ('Alexey', 'Modo', 43, '~M~h2332d55'),
       ('Ekaterina', 'Peace', 47, '+79083458245'),
       ('Alexey', 'Gani', 23, '+78901237567');

insert into netology.orders(date, customer_id, product_name, amount)
values (CURDATE(), 1, 'Armenian Cognac', 1200),
       (CURDATE(), 2, 'Soviet Champagne', 800),
       (CURDATE(), 3, 'Red caviar', 3200),
       (CURDATE(), 4, 'Goats milk', 350),
       (CURDATE(), 5, 'Krasnogorsk cheese', 1000),
       (CURDATE(), 6, 'Bread with bran', 1200),
       (CURDATE(), 7, 'Blueberries', 800),
       (CURDATE(), 8, 'Aniseed vodka', 3200),
       (CURDATE(), 9, 'Raspberries', 1350),
       (CURDATE(), 10, 'Braunschweig Sausage', 2000),
       (CURDATE(), 4, 'Armenian Cognac', 1200),
       (CURDATE(), 4, 'Soviet Champagne', 800),
       (CURDATE(), 6, 'Black caviar', 3200),
       (CURDATE(), 8, 'Motor beer', 350),
       (CURDATE(), 10, 'Cordon Blue cheese', 3500);
