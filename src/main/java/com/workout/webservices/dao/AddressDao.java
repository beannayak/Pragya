package com.workout.webservices.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.workout.webservices.domain.Address;

@Repository
@Transactional (propagation = Propagation.MANDATORY)
public class AddressDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Address address) {
		sessionFactory.getCurrentSession().save(address);
	}
	
	public Address merge(Address address) {
		return (Address) sessionFactory.getCurrentSession().merge(address);
	}
	
	public Address getAddressById(long id) {
		return sessionFactory.getCurrentSession().get(Address.class, id);
	}
	
	public List<Address> getAddressByTag(String tag){
		List<Address> addressesContainingTag = new ArrayList<>();
		
		@SuppressWarnings("unchecked")
		List<Address> addresses = sessionFactory.getCurrentSession().createCriteria(Address.class).list();
		
		String loweredCaseTag = tag.toLowerCase();
		for (Address address : addresses) {
			if (address.getCity().toLowerCase().contains(loweredCaseTag) ||
					address.getLineOne().toLowerCase().contains(loweredCaseTag) ||
					address.getLineTwo().toLowerCase().contains(loweredCaseTag) ||
					address.getState().toLowerCase().contains(loweredCaseTag) ||
					address.getZip().toLowerCase().contains(loweredCaseTag)) {
				addressesContainingTag.add(address);
			}
		}
		return addressesContainingTag;
	}
}
