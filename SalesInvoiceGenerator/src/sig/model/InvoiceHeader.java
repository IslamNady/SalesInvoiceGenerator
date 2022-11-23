/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sig.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Islam
 */
public class InvoiceHeader {
    private int Invoicenum;
    private String customerName;
    private Date InvoiceDate;
    private ArrayList<InvoiceItem> invoiceItems;

    public InvoiceHeader(int Invoicenum, String customerName, Date InvoiceDate) {
        this.Invoicenum = Invoicenum;
        this.customerName = customerName;
        this.InvoiceDate = InvoiceDate;
    }

    public Date getInvoiceDate() {
        return InvoiceDate;
    }

    public void setInvoiceDate(Date InvoiceDate) {
        this.InvoiceDate = InvoiceDate;
    }

    public int getInvoicenum() {
        return Invoicenum;
    }

    public void setInvoicenum(int Invoicenum) {
        this.Invoicenum = Invoicenum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<InvoiceItem> getInvoiceItems() {
        if(invoiceItems == null){
            invoiceItems = new ArrayList();
        }
        return invoiceItems;
    }

    public void setInvoiceItems(ArrayList<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }

    @Override
    public String toString() {
        return "InvoiceHeader{" + "Invoicenum=" + Invoicenum + ", customerName=" + customerName + ", InvoiceDate=" + InvoiceDate + ", invoiceItems=" + invoiceItems + '}';
    } 
    
    public double getTotal()
    {
        double total = 0;
        for(InvoiceItem item : getInvoiceItems())
        {
            total = total + item.getTotal();
        }
        return total;
    }
}
