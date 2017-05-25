SELECT City, CompanyName, ContactName, 'Customer' AS Relationship FROM northwind.Customers
UNION
SELECT City, CompanyName, ContactName, 'Supplier' AS Relationship FROM northwind.Suppliers
ORDER BY City

