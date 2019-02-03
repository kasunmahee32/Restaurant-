package lk.ijse.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.ijse.test.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,String>{

}
