package com.workout.webservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.workout.webservices.dao.AddressDao;
import com.workout.webservices.dao.ReportFormDao;
import com.workout.webservices.domain.Address;
import com.workout.webservices.domain.ReportForm;
import com.workout.webservices.domain.ReportFormTO;

@Service
@Transactional (propagation = Propagation.REQUIRES_NEW)
public class AddReportFormService {
	@Autowired
	private AddressDao addressDao;
	
	@Autowired
	private ReportFormDao reportFormDao;
	
	public void addReportForm(ReportFormTO reportFormTO) {
		Address address = mapAddressForm(reportFormTO);
		ReportForm reportForm = mapReportForm(reportFormTO, address);
		
		addressDao.save(address);
		reportFormDao.save(reportForm);
	}

	private Address mapAddressForm(ReportFormTO reportFormTO) {
		Address address = new Address();
		
		address.setCity(reportFormTO.getCity());
		address.setLineOne(reportFormTO.getLineOne());
		address.setLineTwo(reportFormTO.getLineTwo());
		address.setState(reportFormTO.getState());
		address.setZip(reportFormTO.getZip());
		
		return address;
	}

	private ReportForm mapReportForm(ReportFormTO reportFormTO, Address address) {
		ReportForm reportForm = new ReportForm();
		
		reportForm.setAddress(address);
		reportForm.setAltitude(reportFormTO.getAltitude());
		reportForm.setDescription(reportFormTO.getDescription());
		reportForm.setInstruction(reportFormTO.getInstruction());
		reportForm.setLatitude(reportFormTO.getLatitude());
		reportForm.setLongitude(reportFormTO.getLongitude());
		reportForm.setName(reportFormTO.getName());
		if (reportFormTO.getPicture() != null) {
			reportForm.setPictureLocation(reportFormTO.getPicture().getOriginalFilename());
		} else {
			reportForm.setPictureLocation("Blank");
		}
		
		return reportForm;
	}
	
}
