package dao;

import org.json.JSONArray;

/**
 * Created by jakubinyi on 2017.05.23..
 */
public interface NorthwindDao {

    JSONArray getOrdersMoreDetail();

    JSONArray getCustomersAndSuppliers();

    JSONArray getNecessaryDataForInvoice();

    JSONArray totalAmountPaidForOrders();

    JSONArray totalAmountOfParticularProductForEachYear();
}
