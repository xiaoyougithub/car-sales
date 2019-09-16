package com.service.Impl;

import java.util.List;

import com.dao.EmployeeDao;
import com.bean.Employee;
import com.common.Assist;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public long getEmployeeRowCount(Assist assist) {
        return employeeDao.getEmployeeRowCount(assist);
    }

    @Override
    public List<Employee> selectEmployee(Assist assist) {
        return employeeDao.selectEmployee(assist);
    }

    @Override
    public Employee selectEmployeeByObj(Employee obj) {
        return employeeDao.selectEmployeeByObj(obj);
    }

    @Override
    public Employee selectEmployeeById(Integer id) {
        return employeeDao.selectEmployeeById(id);
    }

    @Override
    public int insertEmployee(Employee value) {
        return employeeDao.insertEmployee(value);
    }

    @Override
    public int insertNonEmptyEmployee(Employee value) {
        return employeeDao.insertNonEmptyEmployee(value);
    }

    @Override
    public int insertEmployeeByBatch(List<Employee> value) {
        return employeeDao.insertEmployeeByBatch(value);
    }

    @Override
    public int deleteEmployeeById(Integer id) {
        return employeeDao.deleteEmployeeById(id);
    }

    @Override
    public int deleteEmployee(Assist assist) {
        return employeeDao.deleteEmployee(assist);
    }

    @Override
    public int updateEmployeeById(Employee enti) {
        return employeeDao.updateEmployeeById(enti);
    }

    @Override
    public int updateEmployee(Employee value, Assist assist) {
        return employeeDao.updateEmployee(value, assist);
    }

    @Override
    public int updateNonEmptyEmployeeById(Employee enti) {
        return employeeDao.updateNonEmptyEmployeeById(enti);
    }

    @Override
    public int updateNonEmptyEmployee(Employee value, Assist assist) {
        return employeeDao.updateNonEmptyEmployee(value, assist);
    }

    @Override
    public Long isEmpExist(int companyId, int positionId, String empName) {
        Assist assist = new Assist();


        Assist.WhereRequire w1 = Assist.andEq("companyId", companyId);
        Assist.WhereRequire w2 = Assist.andEq("positionId", positionId);
        Assist.WhereRequire w3 = Assist.andEq("empName", empName);

        assist.setRequires(w1, w2, w3);

        return employeeDao.getEmployeeRowCount(assist);
    }

    @Override
    public int isPhoneExist(int companyId, String empPhone) {
        Assist assist = new Assist();
        Assist.WhereRequire<?> w1 = Assist.andEq("companyId", companyId);
        Assist.WhereRequire<?> w2 = Assist.andEq("empPhone", empPhone);
        assist.setRequires(w1, w2);
        return (int) employeeDao.getEmployeeRowCount(assist);
    }

    @Override
    public List<Employee> getSalemenList(int companyId, int positionId) {
        Assist assist = new Assist();
        Assist.WhereRequire w1 = Assist.andEq("companyId", companyId);
        Assist.WhereRequire w2 = Assist.andEq("positionId", positionId);
        assist.setRequires(w1, w2);
        return employeeDao.selectEmployee(assist);
    }

    public EmployeeDao getEmployeeDao() {
        return this.employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

}