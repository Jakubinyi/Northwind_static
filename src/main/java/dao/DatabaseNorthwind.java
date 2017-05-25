package dao;

import org.json.JSONArray;
import org.json.JSONObject;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by jakubinyi on 2017.05.23..
 */
public class DatabaseNorthwind implements NorthwindDao {

    Connection conn = ConnectionUtil.getConnection(ConnectionUtil.DatabaseName.NORTHWIND);

    @Override
    public JSONArray getOrdersMoreDetail() {
        JSONArray jsonArray = new JSONArray();

        try {
            /*PreparedStatement stmt = conn.prepareStatement("SELECT Orders.OrderID, OrderDetails.ProductID, Products.ProductName,  OrderDetails.UnitPrice, OrderDetails.Quantity, OrderDetails.Discount, \n" +
                "(OrderDetails.UnitPrice * (1-OrderDetails.Discount) * OrderDetails.Quantity) AS Total\n" +
                "FROM Orders\n" +
                "JOIN OrderDetails ON Orders.OrderID = OrderDetails.OrderID\n" +
                "JOIN Products ON OrderDetails.ProductID = Products.ProductID\n" +
                "ORDER BY OrderID");*/
            PreparedStatement stmt = conn.prepareStatement("call first ()");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("OrderID", resultSet.getInt("OrderID"));
                jsonObject.put("ProductID", resultSet.getInt("ProductID"));
                jsonObject.put("ProductName", resultSet.getString("ProductName"));
                jsonObject.put("UnitPrice", resultSet.getDouble("UnitPrice"));
                jsonObject.put("Quantity", resultSet.getInt("Quantity"));
                jsonObject.put("Discount", resultSet.getInt("Discount"));
                jsonObject.put("Total", resultSet.getDouble("Total"));

                jsonArray.put(jsonObject);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }

    @Override
    public JSONArray getCustomersAndSuppliers() {
        JSONArray jsonArray = new JSONArray();

        try {
            /*PreparedStatement stmt = conn.prepareStatement("SELECT City, CompanyName, ContactName, 'Customer' AS Relationship FROM northwind.Customers\n" +
                "UNION\n" +
                "SELECT City, CompanyName, ContactName, 'Supplier' AS Relationship FROM northwind.Suppliers\n" +
                "ORDER BY City");*/
            PreparedStatement stmt = conn.prepareStatement("call second ()");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("City", resultSet.getString("City"));
                jsonObject.put("CompanyName", resultSet.getString("CompanyName"));
                jsonObject.put("ContactName", resultSet.getString("ContactName"));
                jsonObject.put("Relationship", resultSet.getString("Relationship"));

                jsonArray.put(jsonObject);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }

    @Override
    public JSONArray getNecessaryDataForInvoice() {
        JSONArray jsonArray = new JSONArray();

        try {
            /*PreparedStatement stmt = conn.prepareStatement("SELECT o.ShipName, o.ShipAddress, o.ShipCity, o.ShipRegion, o.ShipPostalCode, o.ShipCountry, o.CustomerID, \n" +
                "c.CompanyName AS CustomerName, c.Address, c.City, c.Region, c.PostalCode, c.Country, \n" +
                "CONCAT(e.FirstName, ' ', e.LastName) AS Salesperson,\n" +
                "o.OrderID, o.OrderDate, o.RequiredDate, o.ShippedDate,\n" +
                "s.CompanyName AS ShipperName,\n" +
                "p.ProductID, p.ProductName, p.UnitPrice, \n" +
                "od.Quantity, od.Discount, (od.UnitPrice * (1-od.Discount) * od.Quantity) AS Total,\n" +
                "o.Freight\n" +
                "FROM northwind.Orders AS o\n" +
                "JOIN northwind.Customers AS c ON o.CustomerID = c.CustomerID\n" +
                "JOIN northwind.Employees AS e ON o.EmployeeID = e.EmployeeID\n" +
                "JOIN northwind.Shippers AS s ON o.ShipVia = s.ShipperID\n" +
                "JOIN northwind.OrderDetails AS od ON o.OrderID = od.OrderID\n" +
                "JOIN northwind.Products AS p ON od.ProductID = p.ProductID\n" +
                "ORDER BY CustomerID");*/
            PreparedStatement stmt = conn.prepareStatement("call third ()");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("ShipName", resultSet.getString("ShipName"));
                jsonObject.put("ShipAddress", resultSet.getString("ShipAddress"));
                jsonObject.put("ShipCity", resultSet.getString("ShipCity"));
                jsonObject.put("ShipRegion", resultSet.getString("ShipRegion"));
                jsonObject.put("ShipPostalCode", resultSet.getString("ShipPostalCode"));
                jsonObject.put("ShipCountry", resultSet.getString("ShipCountry"));
                jsonObject.put("CustomerID", resultSet.getString("CustomerID"));
                jsonObject.put("CustomerName", resultSet.getString("CustomerName"));
                jsonObject.put("Address", resultSet.getString("Address"));
                jsonObject.put("City", resultSet.getString("City"));
                jsonObject.put("Region", resultSet.getString("Region"));
                jsonObject.put("PostalCode", resultSet.getString("PostalCode"));
                jsonObject.put("Country", resultSet.getString("Country"));
                jsonObject.put("Salesperson", resultSet.getString("Salesperson"));
                jsonObject.put("OrderID", resultSet.getInt("OrderID"));
                jsonObject.put("OrderDate", resultSet.getDate("OrderDate"));
                jsonObject.put("RequiredDate", resultSet.getDate("RequiredDate"));
                jsonObject.put("ShippedDate", resultSet.getDate("ShippedDate"));
                jsonObject.put("ShipperName", resultSet.getString("ShipperName"));
                jsonObject.put("ProductID", resultSet.getInt("ProductID"));
                jsonObject.put("ProductName", resultSet.getString("ProductName"));
                jsonObject.put("UnitPrice", resultSet.getDouble("UnitPrice"));
                jsonObject.put("Quantity", resultSet.getInt("Quantity"));
                jsonObject.put("Discount", resultSet.getInt("Discount"));
                jsonObject.put("Total", resultSet.getDouble("Total"));
                jsonObject.put("Freight", resultSet.getDouble("Freight"));

                jsonArray.put(jsonObject);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }

    @Override
    public JSONArray totalAmountPaidForOrders() {
        JSONArray jsonArray = new JSONArray();

        try {
            /*PreparedStatement stmt = conn.prepareStatement("SELECT OrderID, SUM(UnitPrice * (1-Discount) * Quantity) AS OrderTotal \n" +
                "FROM northwind.OrderDetails\n" +
                "GROUP BY OrderID\n" +
                "ORDER BY OrderID");*/
            PreparedStatement stmt = conn.prepareStatement("call fourth()");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("OrderID", resultSet.getInt("OrderID"));
                jsonObject.put("OrderTotal", resultSet.getDouble("OrderTotal"));

                jsonArray.put(jsonObject);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }

    @Override
    public JSONArray totalAmountOfParticularProductForEachYear() {
        JSONArray jsonArray = new JSONArray();

        try {
            /*PreparedStatement stmt = conn.prepareStatement("SELECT YEAR(DATE(o.ShippedDate)) AS YearOfIncome, c.CategoryName, p.ProductName, \n" +
                "SUM(od.UnitPrice * (1-od.Discount) * od.Quantity) AS ProductSales\n" +
                "FROM northwind.Products AS p\n" +
                "JOIN northwind.OrderDetails AS od ON p.ProductID = od.ProductID\n" +
                "JOIN northwind.Orders AS o ON p.ProductID = od.ProductID\n" +
                "JOIN northwind.Categories AS c ON p.CategoryID = c.CategoryID\n" +
                "WHERE YEAR(DATE(o.ShippedDate)) IS NOT NULL\n" +
                "GROUP BY YEAR(DATE(o.ShippedDate)), c.CategoryName, p.ProductName\n" +
                "ORDER BY p.ProductName, YEAR(DATE(o.ShippedDate))");*/
            PreparedStatement stmt = conn.prepareStatement("call fifth ()");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("YearOfIncome", resultSet.getInt("YearOfIncome"));
                jsonObject.put("CategoryName", resultSet.getString("CategoryName"));
                jsonObject.put("ProductName", resultSet.getString("ProductName"));
                jsonObject.put("ProductSales", resultSet.getDouble("ProductSales"));

                jsonArray.put(jsonObject);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }
}
