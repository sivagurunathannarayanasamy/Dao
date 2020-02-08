package com.ibank.card.offers.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "[CLEInfo]")

public class CLEInfo {
	@Id
	@Column(name = "[promocode]")
	private String promocode;
	@Column(name = "[currentLimit]")
	private Long currentLimit;
	@Column(name = "[eligibleAmount]")
	private Long eligibleAmount;

	@Column(name = "[cardNumbe]")
	private String cardNumbe;

	@Column(name = "[expdate]")
	private String expdate;
	// setters and getters

	public Long getCurrentLimit() {
		return currentLimit;
	}

	public void setCurrentLimit(Long currentLimit) {
		this.currentLimit = currentLimit;
	}

	public Long getEligibleAmount() {
		return eligibleAmount;
	}

	public void setEligibleAmount(Long eligibleAmount) {
		this.eligibleAmount = eligibleAmount;
	}

	public String getPromocode() {
		return promocode;
	}

	public void setPromocode(String promocode) {
		this.promocode = promocode;
	}

	public String getCardNumbe() {
		return cardNumbe;
	}

	public void setCardNumbe(String cardNumbe) {
		this.cardNumbe = cardNumbe;
	}

	public String getExpdate() {
		return expdate;
	}

	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}

	@Override
	public String toString() {
		return "CLEInfo [currentLimit=" + currentLimit + ", eligibleAmount=" + eligibleAmount + ", promocode="
				+ promocode + ", cardNumbe=" + cardNumbe + ", expdate=" + expdate + "]";
	}

}
