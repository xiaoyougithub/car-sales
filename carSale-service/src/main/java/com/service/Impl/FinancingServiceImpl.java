package com.service.Impl;
import java.util.List;
import com.dao.FinancingDao;
import com.bean.Financing;
import com.common.Assist;
import com.service.FinancingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FinancingServiceImpl implements FinancingService{
    @Autowired
    private FinancingDao financingDao;
    @Override
    public long getFinancingRowCount(Assist assist){
        return financingDao.getFinancingRowCount(assist);
    }
    @Override
    public List<Financing> selectFinancing(Assist assist){
        return financingDao.selectFinancing(assist);
    }
    @Override
    public Financing selectFinancingByObj(Financing obj){
        return financingDao.selectFinancingByObj(obj);
    }
    @Override
    public Financing selectFinancingById(Integer id){
        return financingDao.selectFinancingById(id);
    }
    @Override
    public int insertFinancing(Financing value){
        return financingDao.insertFinancing(value);
    }
    @Override
    public int insertNonEmptyFinancing(Financing value){
        return financingDao.insertNonEmptyFinancing(value);
    }
    @Override
    public int insertFinancingByBatch(List<Financing> value){
        return financingDao.insertFinancingByBatch(value);
    }
    @Override
    public int deleteFinancingById(Integer id){
        return financingDao.deleteFinancingById(id);
    }
    @Override
    public int deleteFinancing(Assist assist){
        return financingDao.deleteFinancing(assist);
    }
    @Override
    public int updateFinancingById(Financing enti){
        return financingDao.updateFinancingById(enti);
    }
    @Override
    public int updateFinancing(Financing value, Assist assist){
        return financingDao.updateFinancing(value,assist);
    }
    @Override
    public int updateNonEmptyFinancingById(Financing enti){
        return financingDao.updateNonEmptyFinancingById(enti);
    }
    @Override
    public int updateNonEmptyFinancing(Financing value, Assist assist){
        return financingDao.updateNonEmptyFinancing(value,assist);
    }

    public FinancingDao getFinancingDao() {
        return this.financingDao;
    }

    public void setFinancingDao(FinancingDao financingDao) {
        this.financingDao = financingDao;
    }

}