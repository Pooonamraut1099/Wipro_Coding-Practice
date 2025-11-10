SELECT 
    id,
    product_name,
    category,
    price,
    quantity,
    offers,
    description
FROM 
    product
WHERE 
    category IN ('furniture', 'laptop', 'mobile')
    AND price < 50000;
