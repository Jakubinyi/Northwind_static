SELECT o.ShipName, o.ShipAddress, o.ShipCity, o.ShipRegion, o.ShipPostalCode, o.ShipCountry, o.CustomerID, 
c.CompanyName AS CustomerName, c.Address, c.City, c.Region, c.PostalCode, c.Country, 
CONCAT(e.FirstName, ' ', e.LastName) AS Salesperson,
o.OrderID, o.OrderDate, o.RequiredDate, o.ShippedDate,
s.CompanyName AS ShipperName,
p.ProductID, p.ProductName, p.UnitPrice, 
od.Quantity, od.Discount, (od.UnitPrice * (1-od.Discount) * od.Quantity) AS Total,
o.Freight
FROM northwind.Orders AS o
JOIN northwind.Customers AS c ON o.CustomerID = c.CustomerID
JOIN northwind.Employees AS e ON o.EmployeeID = e.EmployeeID
JOIN northwind.Shippers AS s ON o.ShipVia = s.ShipperID
JOIN northwind.OrderDetails AS od ON o.OrderID = od.OrderID
JOIN northwind.Products AS p ON od.ProductID = p.ProductID
ORDER BY CustomerID