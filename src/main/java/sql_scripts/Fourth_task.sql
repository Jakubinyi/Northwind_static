SELECT OrderID, SUM(UnitPrice * (1-Discount) * Quantity) AS OrderTotal 
FROM northwind.OrderDetails
GROUP BY OrderID
ORDER BY OrderID