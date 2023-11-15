package com.learning.julie.booking.service;

import com.learning.julie.booking.model.Bucket;
import com.learning.julie.booking.model.Invoice;
import com.learning.julie.booking.model.Product;

public class InvoiceService {

	public String createInvoice(Bucket bucket) {
		Invoice invoice = buildInvoice(bucket);
		return buildInvoiceAsString(invoice);
	}

	public Invoice buildInvoice(Bucket bucket) {
	    //sum calcation here
		Invoice invoice = new Invoice();
		invoice.setSum(sum);
		return invoice;
	}

	public String buildInvoiceAsString(Invoice invoice) {
		return String.valueOf(invoice.getSum());
	}
}
