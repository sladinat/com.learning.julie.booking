package com.learning.julie.booking.main;

import com.learning.julie.booking.model.Bucket;
import com.learning.julie.booking.model.Cola;
import com.learning.julie.booking.model.Fanta;
import com.learning.julie.booking.model.Mars;
import com.learning.julie.booking.model.Snickers;
import com.learning.julie.booking.model.Unit;
import com.learning.julie.booking.service.InvoiceService;

public class EntryPoint {
	public static void main(String[] args) {
		Bucket bucket = new Bucket();
		bucket.add(new Cola(1.0, "Coca-Cola", Unit.LITER));
		bucket.add(new Cola(1.0, "Coca-Cola", Unit.LITER));
		bucket.add(new Fanta(0.98, "Fanta", Unit.LITER));
		bucket.add(new Snickers(1.0, "Snickers ", Unit.GRAM));
		bucket.add(new Mars(1.0, "Mars", Unit.GRAM));

		InvoiceService invoiceService = new InvoiceService();
		String invoice = invoiceService.createInvoice(bucket);
		System.out.println(invoice);

	}
}
