package com.service.Impl;
import java.util.List;
import com.dao.AdminlogDao;
import com.bean.Adminlog;
import com.common.Assist;
import com.service.AdminlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminlogServiceImpl implements AdminlogService{
    @Autowired
    private AdminlogDao adminlogDao;
    @Override
    public long getAdminlogRowCount(Assist assist){
        return adminlogDao.getAdminlogRowCount(assist);
    }
    @Override
    public List<Adminlog> selectAdminlog(Assist assist){
        return adminlogDao.selectAdminlog(assist);
    }
    @Override
    public Adminlog selectAdminlogByObj(Adminlog obj){
        return adminlogDao.selectAdminlogByObj(obj);
    }
    @Override
    public Adminlog selectAdminlogById(Integer id){
        return adminlogDao.selectAdminlogById(id);
    }
    @Override
    public int insertAdminlog(Adminlog value){
        return adminlogDao.insertAdminlog(value);
    }
    @Override
    public int insertNonEmptyAdminlog(Adminlog value){
        return adminlogDao.insertNonEmptyAdminlog(value);
    }
    @Override
    public int insertAdminlogByBatch(List<Adminlog> value){
        return adminlogDao.insertAdminlogByBatch(value);
    }
    @Override
    public int deleteAdminlogById(Integer id){
        return adminlogDao.deleteAdminlogById(id);
    }
    @Override
    public int deleteAdminlog(Assist assist){
        return adminlogDao.deleteAdminlog(assist);
    }
    @Override
    public int updateAdminlogById(Adminlog enti){
        return adminlogDao.updateAdminlogById(enti);
    }
    @Override
    public int updateAdminlog(Adminlog value, Assist assist){
        return adminlogDao.updateAdminlog(value,assist);
    }
    @Override
    public int updateNonEmptyAdminlogById(Adminlog enti){
        return adminlogDao.updateNonEmptyAdminlogById(enti);
    }
    @Override
    public int updateNonEmptyAdminlog(Adminlog value, Assist assist){
        return adminlogDao.updateNonEmptyAdminlog(value,assist);
    }

    public AdminlogDao getAdminlogDao() {
        return this.adminlogDao;
    }

    public void setAdminlogDao(AdminlogDao adminlogDao) {
        this.adminlogDao = adminlogDao;
    }

}