package com.ticketbooking.app;

public class PaymentMethod {
	int paymentMethodId;
    String paymentMethodName;
	
	public PaymentMethod(int paymentMethodId, String paymentMethodName) {
		this.paymentMethodId = paymentMethodId;
		this.paymentMethodName = paymentMethodName;
	}

	public int getPaymentMethodId() {
		return paymentMethodId;
	}

	public void setPaymentMethodId(int paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	public String getPaymentMethodName() {
		return paymentMethodName;
	}

	public void setPaymentMethodName(String paymentMethodName) {
		this.paymentMethodName = paymentMethodName;
	}
	
	
}
