package lk.ijse.test.service.impl;

import javax.transaction.Transactional;

import org.springframework.transaction.annotation.Propagation;

import lk.ijse.test.dto.CustomerDTO;
import lk.ijse.test.entity.Customer;
import lk.ijse.test.repository.CustomerRepository;
import lk.ijse.test.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{

	private CustomerRepository repository;

	@Override
	@org.springframework.transaction.annotation.Transactional(propagation = Propagation.NOT_SUPPORTED)
	public boolean saveCustomer(CustomerDTO dto) {
		 Customer customer=new Customer(
				 dto.getCid(),
				 dto.getCus_name(),
				 dto.getTel());
		 repository.save(customer);
		 {
	
		 }	 
	return true;	 
		// TODO Auto-generated method stub
		
	}

}
