function getFirstQuery() {
    var queryDiv = $("#query");
    queryDiv.empty();

    $.ajax({
        url: '/first',
        method: 'GET',
        dataType: 'json',
        success: function (data) {
            var array = data;

            var table = "<Table><tr>" +
                "<th>OrderID</th>" +
                "<th>ProductID</th>" +
                "<th>Product Name</th>" +
                "<th>UnitPrice</th>" +
                "<th>Quantity</th>" +
                "<th>Discount</th>" +
                "<th>Total</th>" +
                "</tr>";

            for (var i in array) {
                table += "<tr>" +
                    "<td>" + array[i].OrderID + "</td>" +
                    "<td>" + array[i].ProductID + "</td>" +
                    "<td>" + array[i].ProductName + "</td>" +
                    "<td>" + array[i].UnitPrice + "</td>" +
                    "<td>" + array[i].Quantity + "</td>" +
                    "<td>" + array[i].Discount + "</td>" +
                    "<td>" + array[i].Total + "</td>" +
                    "</tr>";
            }
            queryDiv.append(table);
        }
    });
}

function getSecondQuery() {
    var queryDiv = $("#query");
    queryDiv.empty();

    $.ajax({
        url: '/second',
        method: 'GET',
        dataType: 'json',
        success: function (data) {
            var array = data;

            var table = "<Table><tr>" +
                "<th>City</th>" +
                "<th>CompanyName</th>" +
                "<th>ContactName</th>" +
                "<th>Relationship</th>" +
                "</tr>";

            for (var i in array) {
                table += "<tr>" +
                    "<td>" + array[i].City + "</td>" +
                    "<td>" + array[i].CompanyName + "</td>" +
                    "<td>" + array[i].ContactName + "</td>" +
                    "<td>" + array[i].Relationship + "</td>" +
                    "</tr>";
            }
            queryDiv.append(table);
        }
    });
}

function getThirdQuery() {
    var queryDiv = $("#query");
    queryDiv.empty();

    $.ajax({
        url: '/third',
        method: 'GET',
        dataType: 'json',
        success: function (data) {
            var array = data;

            var table = "<Table><tr>" +
                "<th>ShipName</th>" +
                "<th>ShipAddress</th>" +
                "<th>ShipCity</th>" +
                "<th>ShipRegion</th>" +
                "<th>ShipPostalCode</th>" +
                "<th>ShipCountry</th>" +
                "<th>CustomerID</th>" +
                "<th>CompanyName</th>" +
                "<th>CustomerName</th>" +
                "<th>Address</th>" +
                "<th>City</th>" +
                "<th>Region</th>" +
                "<th>PostalCode</th>" +
                "<th>Country</th>" +
                "<th>Salesperson</th>" +
                "<th>OrderID</th>" +
                "<th>OrderDate</th>" +
                "<th>RequiredDate</th>" +
                "<th>ShippedDate</th>" +
                "<th>CompanyName</th>" +
                "<th>ShipperName</th>" +
                "<th>ProductID</th>" +
                "<th>ProductName</th>" +
                "<th>UnitPrice</th>" +
                "<th>Quantity</th>" +
                "<th>Discount</th>" +
                "<th>Total</th>" +
                "<th>Freight</th>" +
                "</tr>";

            for (var i in array) {
                table += "<tr>" +
                    "<td>" + array[i].ShipName + "</td>" +
                    "<td>" + array[i].ShipAddress + "</td>" +
                    "<td>" + array[i].ShipCity + "</td>" +
                    "<td>" + array[i].ShipRegion + "</td>" +
                    "<td>" + array[i].ShipPostalCode + "</td>" +
                    "<td>" + array[i].ShipCountry + "</td>" +
                    "<td>" + array[i].CustomerID + "</td>" +
                    "<td>" + array[i].CompanyName + "</td>" +
                    "<td>" + array[i].CustomerName + "</td>" +
                    "<td>" + array[i].Address + "</td>" +
                    "<td>" + array[i].City + "</td>" +
                    "<td>" + array[i].Region + "</td>" +
                    "<td>" + array[i].PostalCode + "</td>" +
                    "<td>" + array[i].Country + "</td>" +
                    "<td>" + array[i].Salesperson + "</td>" +
                    "<td>" + array[i].OrderID + "</td>" +
                    "<td>" + array[i].OrderDate + "</td>" +
                    "<td>" + array[i].RequiredDate + "</td>" +
                    "<td>" + array[i].ShippedDate + "</td>" +
                    "<td>" + array[i].CompanyName + "</td>" +
                    "<td>" + array[i].ShipperName + "</td>" +
                    "<td>" + array[i].ProductID + "</td>" +
                    "<td>" + array[i].ProductName + "</td>" +
                    "<td>" + array[i].UnitPrice + "</td>" +
                    "<td>" + array[i].Quantity + "</td>" +
                    "<td>" + array[i].Discount + "</td>" +
                    "<td>" + array[i].Total + "</td>" +
                    "<td>" + array[i].Freight + "</td>" +
                    "</tr>";
            }
            queryDiv.append(table);
        }
    });
}

function getFourthQuery() {
    var queryDiv = $("#query");
    queryDiv.empty();

    $.ajax({
        url: '/fourth',
        method: 'GET',
        dataType: 'json',
        success: function (data) {
            var array = data;

            var table = "<Table><tr>" +
                "<th>OrderID</th>" +
                "<th>OrderTotal</th>" +
                "</tr>";

            for (var i in array) {
                table += "<tr>" +
                    "<td>" + array[i].OrderID + "</td>" +
                    "<td>" + array[i].OrderTotal + "</td>" +
                    "</tr>";
            }
            queryDiv.append(table);
        }
    });
}

function getFifthQuery() {
    var queryDiv = $("#query");
    queryDiv.empty();

    $.ajax({
        url: '/fifth',
        method: 'GET',
        dataType: 'json',
        success: function (data) {
            var array = data;

            var table = "<Table><tr>" +
                "<th>YearOfIncome</th>" +
                "<th>CategoryName</th>" +
                "<th>ProductName</th>" +
                "<th>ProductSales</th>" +
                "</tr>";

            for (var i in array) {
                table += "<tr>" +
                    "<td>" + array[i].YearOfIncome + "</td>" +
                    "<td>" + array[i].CategoryName + "</td>" +
                    "<td>" + array[i].ProductName + "</td>" +
                    "<td>" + array[i].ProductSales + "</td>" +
                    "</tr>";
            }
            queryDiv.append(table);
        }
    });
}
