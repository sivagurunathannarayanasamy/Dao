package com.ibank.card.offers.dao;

import com.ibank.card.offers.dao.beans.CLEDaoResponseBean;

public interface CLEDao {
	public CLEDaoResponseBean verifyPromocode(String promocode);
}
