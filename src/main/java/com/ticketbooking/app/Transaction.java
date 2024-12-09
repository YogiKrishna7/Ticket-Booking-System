package com.ticketbooking.app;

public class Transaction {
	int txnId;
	String txnDate;
	int bookingNumber;
	double txnAmt;
	char txnStatus;
	int paymentMethodId;
	
	public Transaction(int txnId, String txnDate, int bookingNumber, double txnAmt, char txnStatus,
			int paymentMethodId) {
		this.txnId = txnId;
		this.txnDate = txnDate;
		this.bookingNumber = bookingNumber;
		this.txnAmt = txnAmt;
		this.txnStatus = txnStatus;
		this.paymentMethodId = paymentMethodId;
	}

	public int getTxnId() {
		return txnId;
	}

	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}

	public String getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(String txnDate) {
		this.txnDate = txnDate;
	}

	public int getBookingNumber() {
		return bookingNumber;
	}

	public void setBookingNumber(int bookingNumber) {
		this.bookingNumber = bookingNumber;
	}

	public double getTxnAmt() {
		return txnAmt;
	}

	public void setTxnAmt(double txnAmt) {
		this.txnAmt = txnAmt;
	}

	public char getTxnStatus() {
		return txnStatus;
	}

	public void setTxnStatus(char txnStatus) {
		this.txnStatus = txnStatus;
	}

	public int getPaymentMethodId() {
		return paymentMethodId;
	}

	public void setPaymentMethodId(int paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	
}
