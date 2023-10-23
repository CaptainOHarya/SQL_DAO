select product_name
from ORDERS o
        inner join CUSTOMERS c on o.customer_id = c.id
where lcase(c.name) like lcase(:name);

