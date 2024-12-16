package com.ticketbooking.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "txn_id")
	private int txnId;

	@Column(name = "txn_date")
	private String txnDate;

	@Column(name = "booking_number")
	private String bookingNumber;

	@Column(name = "txn_amt")
	private int txnAmount;

	@Column(name = "txn_status")
	private String txnStatus;

	@Column(name = "payment_method_id")
	private int paymentMethodId;

	@Column(name = "created_by")
	private String createdBy = "system";

	@Column(name = "create_date")
	private String createDate;

	@Column(name = "modified_by")
	private String modifiedBy = "system";

	@Column(name = "modified_date")
	private String modifiedDate;

	public Transaction() {
		super();
	}

	public Transaction(int txnId, String txnDate, String bookingNumber, int txnAmount, String txnStatus,
			int paymentMethodId, String createdBy, String createDate, String modifiedBy, String modifiedDate) {
		super();
		this.txnId = txnId;
		this.txnDate = txnDate;
		this.bookingNumber = bookingNumber;
		this.txnAmount = txnAmount;
		this.txnStatus = txnStatus;
		this.paymentMethodId = paymentMethodId;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
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

	public String getBookingNumber() {
		return bookingNumber;
	}

	public void setBookingNumber(String bookingNumber) {
		this.bookingNumber = bookingNumber;
	}

	public int getTxnAmount() {
		return txnAmount;
	}

	public void setTxnAmount(int txnAmount) {
		this.txnAmount = txnAmount;
	}

	public String getTxnStatus() {
		return txnStatus;
	}

	public void setTxnStatus(String txnStatus) {
		this.txnStatus = txnStatus;
	}

	public int getPaymentMethodId() {
		return paymentMethodId;
	}

	public void setPaymentMethodId(int paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
