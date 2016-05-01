package com.workout.webservices.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.workout.webservices.domain.ReportForm;

@Repository
@Transactional (propagation = Propagation.MANDATORY)
public class ReportFormDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(ReportForm reportForm) {
		sessionFactory.getCurrentSession().save(reportForm);
	}
	
	public ReportForm merge(ReportForm reportForm) {
		return (ReportForm) sessionFactory.getCurrentSession().merge(reportForm);
	}
	
	public ReportForm getReportFromById(long id) {
		return (ReportForm) sessionFactory.getCurrentSession().get(ReportForm.class, id);
	}
}
