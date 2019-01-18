package zml.service;

import java.io.Serializable;

import zml.entity.Salary;

public interface ISalaryService {

	public Serializable doAdd(Salary salary) throws Exception;
	
	public void doUpdate(Salary salary) throws Exception;
	
	public Salary findByUserId(String userId) throws Exception;
	
	public Salary findById(Integer id) throws Exception;
}
