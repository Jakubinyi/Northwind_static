SELECT YEAR(DATE(o.ShippedDate)) AS YearOfIncome, c.CategoryName, p.ProductName, 
SUM(od.UnitPrice * (1-od.Discount) * od.Quantity) AS ProductSales
FROM northwind.Products AS p
JOIN northwind.OrderDetails AS od ON p.ProductID = od.ProductID
JOIN northwind.Orders AS o ON p.ProductID = od.ProductID
JOIN northwind.Categories AS c ON p.CategoryID = c.CategoryID
WHERE YEAR(DATE(o.ShippedDate)) IS NOT NULL
GROUP BY YEAR(DATE(o.ShippedDate)), c.CategoryName, p.ProductName
ORDER BY p.ProductName, YEAR(DATE(o.ShippedDate))