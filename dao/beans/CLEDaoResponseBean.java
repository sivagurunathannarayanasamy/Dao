package com.ibank.card.offers.dao.beans;

public class CLEDaoResponseBean {

	private Long currentLimit;
	private Long eligibleAmount;
	private String promocode;
	private String cardNumbe;
	private String expdate;

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
		return "CLEDaoResponseBean [currentLimit=" + currentLimit + ", eligibleAmount=" + eligibleAmount
				+ ", promocode=" + promocode + ", cardNumbe=" + cardNumbe + ", expdate=" + expdate + "]";
	}
	
	

}
