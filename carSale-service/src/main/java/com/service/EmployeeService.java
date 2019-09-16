package com.service;

import com.bean.Employee;
import com.common.Assist;

import java.util.List;

public interface EmployeeService{
	/**
	 * 获得Employee数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getEmployeeRowCount(Assist assist);
	/**
	 * 获得Employee数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Employee> selectEmployee(Assist assist);
	/**
	 * 获得一个Employee对象,以参数Employee对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Employee selectEmployeeByObj(Employee obj);
	/**
	 * 通过Employee的id获得Employee对象
	 * @param id
	 * @return
	 */
    Employee selectEmployeeById(Integer id);
	/**
	 * 插入Employee到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEmployee(Employee value);
	/**
	 * 插入Employee中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyEmployee(Employee value);
	/**
	 * 批量插入Employee到数据库
	 * @param value
	 * @return
	 */
    int insertEmployeeByBatch(List<Employee> value);
	/**
	 * 通过Employee的id删除Employee
	 * @param id
	 * @return
	 */
    int deleteEmployeeById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除Employee
	 * @param assist
	 * @return
	 */
    int deleteEmployee(Assist assist);
	/**
	 * 通过Employee的id更新Employee中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateEmployeeById(Employee enti);
 	/**
	 * 通过辅助工具Assist的条件更新Employee中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateEmployee(Employee value, Assist assist);
	/**
	 * 通过Employee的id更新Employee中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyEmployeeById(Employee enti);
 	/**
	 * 通过辅助工具Assist的条件更新Employee中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyEmployee(Employee value, Assist assist);

    Long isEmpExist(int companyId, int positionId, String empName);

    int isPhoneExist(int companyId, String empPhone);

	List<Employee> getSalemenList(int companyId, int positionId);
}