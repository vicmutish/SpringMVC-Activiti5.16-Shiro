package zml.service;

import java.io.Serializable;
import java.util.List;

import zml.entity.ExpenseAccount;
import zml.pagination.Page;

public interface IExpenseService {

	public Serializable doAdd(ExpenseAccount bean) throws Exception;
	
	public void doUpdate(ExpenseAccount bean) throws Exception;
	
	public void doDelete(ExpenseAccount bean) throws Exception;
	
	public List<ExpenseAccount> toList(Integer userId) throws Exception;
	
	public ExpenseAccount findById(Integer id) throws Exception;
	
	public List<ExpenseAccount> findByStatus(Integer userId, String status, Page<ExpenseAccount> page) throws Exception;

}
