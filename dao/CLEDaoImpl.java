package com.ibank.card.offers.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.ibank.card.offers.dao.beans.CLEDaoResponseBean;
import com.ibank.card.offers.dao.entity.CLEInfo;
import com.ibank.card.offers.dao.utility.HibernateUtil;

@Repository
public class CLEDaoImpl implements CLEDao {

	public CLEDaoResponseBean verifyPromocode(String promocode) {

		System.out.println("enterd into dao layer");
		// here we are calling databse and we are getting response from database
		Session session = HibernateUtil.getSessionFactory().openSession();
		String sql = "from CLEInfo c where c.promocode=:promocode";
		Query query = session.createQuery(sql);
		query.setParameter("promocode", promocode);
		List<CLEInfo> cleInfoList = query.list();
		//
		CLEInfo cleInfo = cleInfoList.get(0);
		System.out.println("cleinfo from database   :" + cleInfo);
		/* CLEInfo cleInfo=session.get("ibank401"); */
		// like what is current limmit, what is eligbel...
		CLEDaoResponseBean cleDaoResponseBean = null;

		cleDaoResponseBean = new CLEDaoResponseBean();
		cleDaoResponseBean.setCardNumbe(cleInfo.getCardNumbe());
		cleDaoResponseBean.setCurrentLimit(cleInfo.getCurrentLimit());
		cleDaoResponseBean.setEligibleAmount(cleInfo.getEligibleAmount());
		cleDaoResponseBean.setExpdate(cleInfo.getExpdate());
		cleDaoResponseBean.setPromocode(cleInfo.getPromocode());

		System.out.println("exiting  from dao layer");
		return cleDaoResponseBean;
	}

	public static void main(String[] args) {
		CLEDaoImpl cleDaoImpl = new CLEDaoImpl();
		cleDaoImpl.verifyPromocode("ibank402");

	}
}
