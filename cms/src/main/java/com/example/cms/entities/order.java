package com.example.cms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class order {
	@Id
	public String order_no;
	public String date;
	public String brick_type;
	public long quantity;
	public String buyer_name;
	public String buyer_address;
	public String buyer_contact;
	public String status;
	
	public order(String order_no, String date, String brick_type, long quantity, String buyer_name,
			String buyer_address, String buyer_contact, String status) {
		super();
		this.order_no = order_no;
		this.date = date;
		this.brick_type = brick_type;
		this.quantity = quantity;
		this.buyer_name = buyer_name;
		this.buyer_address = buyer_address;
		this.buyer_contact = buyer_contact;
		this.status = status;
	}

	public order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBrick_type() {
		return brick_type;
	}

	public void setBrick_type(String brick_type) {
		this.brick_type = brick_type;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public String getBuyer_name() {
		return buyer_name;
	}

	public void setBuyer_name(String buyer_name) {
		this.buyer_name = buyer_name;
	}

	public String getBuyer_address() {
		return buyer_address;
	}

	public void setBuyer_address(String buyer_address) {
		this.buyer_address = buyer_address;
	}

	public String getBuyer_contact() {
		return buyer_contact;
	}

	public void setBuyer_contact(String buyer_contact) {
		this.buyer_contact = buyer_contact;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "order [order_no=" + order_no + ", date=" + date + ", brick_type=" + brick_type + ", quantity="
				+ quantity + ", buyer_name=" + buyer_name + ", buyer_address=" + buyer_address + ", buyer_contact="
				+ buyer_contact + ", status=" + status + "]";
	}
	
}
