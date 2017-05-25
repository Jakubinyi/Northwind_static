SELECT Orders.OrderID, OrderDetails.ProductID, Products.ProductName,  OrderDetails.UnitPrice, OrderDetails.Quantity, OrderDetails.Discount, 
(OrderDetails.UnitPrice * (1-OrderDetails.Discount) * OrderDetails.Quantity) AS Total
FROM Orders
JOIN OrderDetails ON Orders.OrderID = OrderDetails.OrderID
JOIN Products ON OrderDetails.ProductID = Products.ProductID
ORDER BY OrderID

