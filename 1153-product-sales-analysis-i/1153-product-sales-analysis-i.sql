# Write your MySQL query statement below
select product.product_name, sales.year, sales.price from sales inner join product on Sales.product_id = Product.product_id