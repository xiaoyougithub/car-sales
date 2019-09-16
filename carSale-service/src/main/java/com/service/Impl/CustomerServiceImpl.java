package com.service.Impl;
import java.util.List;
import com.dao.CustomerDao;
import com.bean.Customer;
import com.common.Assist;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerDao customerDao;
    @Override
    public long getCustomerRowCount(Assist assist){
        return customerDao.getCustomerRowCount(assist);
    }
    @Override
    public List<Customer> selectCustomer(Assist assist){
        return customerDao.selectCustomer(assist);
    }
    @Override
    public Customer selectCustomerByObj(Customer obj){
        return customerDao.selectCustomerByObj(obj);
    }
    @Override
    public Customer selectCustomerById(Integer id){
        return customerDao.selectCustomerById(id);
    }
    @Override
    public int insertCustomer(Customer value){
        return customerDao.insertCustomer(value);
    }
    @Override
    public int insertNonEmptyCustomer(Customer value){
        return customerDao.insertNonEmptyCustomer(value);
    }
    @Override
    public int insertCustomerByBatch(List<Customer> value){
        return customerDao.insertCustomerByBatch(value);
    }
    @Override
    public int deleteCustomerById(Integer id){
        return customerDao.deleteCustomerById(id);
    }
    @Override
    public int deleteCustomer(Assist assist){
        return customerDao.deleteCustomer(assist);
    }
    @Override
    public int updateCustomerById(Customer enti){
        return customerDao.updateCustomerById(enti);
    }
    @Override
    public int updateCustomer(Customer value, Assist assist){
        return customerDao.updateCustomer(value,assist);
    }
    @Override
    public int updateNonEmptyCustomerById(Customer enti){
        return customerDao.updateNonEmptyCustomerById(enti);
    }
    @Override
    public int updateNonEmptyCustomer(Customer value, Assist assist){
        return customerDao.updateNonEmptyCustomer(value,assist);
    }

    @Override
    public List<Customer> selectCustomerByCompanyId(int companyId) {
        Assist assist=new Assist();
        Assist.WhereRequire w1=Assist.andEq("companyId",companyId);
        assist.setRequires(w1);
        return customerDao.selectCustomer(assist);
    }

    public CustomerDao getCustomerDao() {
        return this.customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

}