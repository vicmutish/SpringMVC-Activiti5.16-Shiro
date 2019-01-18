package zml.ProcessTask.ServiceTask;

import java.math.BigDecimal;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import zml.entity.Salary;
import zml.entity.SalaryAdjust;
import zml.service.ISalaryService;

/**
 * 回滚薪资调整
 * @author ZML
 *
 */

@Component
public class RollbackSalaryApply implements JavaDelegate {

	@Autowired
	private ISalaryService salaryService;
    
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		SalaryAdjust salaryAdjust = (SalaryAdjust) execution.getVariable("entity");
    	BigDecimal baseMoney = (BigDecimal) execution.getVariable("baseMoney");
		Salary salary = this.salaryService.findByUserId(salaryAdjust.getUserId().toString());
		salary.setBaseMoney(baseMoney);
		this.salaryService.doUpdate(salary);
	}


}
