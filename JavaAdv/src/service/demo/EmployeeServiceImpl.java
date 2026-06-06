package service.demo;

import dao.demo.EmployeeDao;
import dao.demo.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao edao;
	
	public EmployeeServiceImpl()
	{
		edao=new EmployeeDaoImpl();
	}
	
	
	
}
