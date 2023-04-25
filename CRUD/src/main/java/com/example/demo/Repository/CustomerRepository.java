package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Model.CustomerDetails;

public interface CustomerRepository extends JpaRepository<CustomerDetails, Integer>{

	

}
