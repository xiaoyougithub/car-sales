package com.service.Impl;
import java.util.List;
import com.dao.CompanyDao;
import com.bean.Company;
import com.common.Assist;
import com.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService{
    @Autowired
    private CompanyDao companyDao;
    @Override
    public long getCompanyRowCount(Assist assist){
        return companyDao.getCompanyRowCount(assist);
    }
    @Override
    public List<Company> selectCompany(Assist assist){
        return companyDao.selectCompany(assist);
    }
    @Override
    public Company selectCompanyByObj(Company obj){
        return companyDao.selectCompanyByObj(obj);
    }
    @Override
    public Company selectCompanyById(Integer id){
        return companyDao.selectCompanyById(id);
    }
    @Override
    public int insertCompany(Company value){
        return companyDao.insertCompany(value);
    }
    @Override
    public int insertNonEmptyCompany(Company value){
        return companyDao.insertNonEmptyCompany(value);
    }
    @Override
    public int insertCompanyByBatch(List<Company> value){
        return companyDao.insertCompanyByBatch(value);
    }
    @Override
    public int deleteCompanyById(Integer id){
        return companyDao.deleteCompanyById(id);
    }
    @Override
    public int deleteCompany(Assist assist){
        return companyDao.deleteCompany(assist);
    }
    @Override
    public int updateCompanyById(Company enti){
        return companyDao.updateCompanyById(enti);
    }
    @Override
    public int updateCompany(Company value, Assist assist){
        return companyDao.updateCompany(value,assist);
    }
    @Override
    public int updateNonEmptyCompanyById(Company enti){
        return companyDao.updateNonEmptyCompanyById(enti);
    }
    @Override
    public int updateNonEmptyCompany(Company value, Assist assist){
        return companyDao.updateNonEmptyCompany(value,assist);
    }

    @Override
    public Company selectCompanyByName(String companyName) {
        return companyDao.selectCompanyByName(companyName);
    }

    @Override
    public int isCompanyNameExist(String companyName) {
        Assist assist=new Assist();
        Assist.WhereRequire w1=Assist.andEq("companyName",companyName);
        assist.setRequires(w1);
        long rowCount = companyDao.getCompanyRowCount(assist);
        return (int)rowCount==0?0:(int)rowCount;
    }

    public CompanyDao getCompanyDao() {
        return this.companyDao;
    }

    public void setCompanyDao(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }



}