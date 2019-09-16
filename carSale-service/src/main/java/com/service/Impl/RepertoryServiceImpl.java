package com.service.Impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dao.RepertoryDao;
import com.bean.Repertory;
import com.common.Assist;
import com.service.RepertoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RepertoryServiceImpl implements RepertoryService{
    @Autowired
    private RepertoryDao repertoryDao;
    @Override
    public long getRepertoryRowCount(Assist assist){
        return repertoryDao.getRepertoryRowCount(assist);
    }
    @Override
    public List<Repertory> selectRepertory(Assist assist){
        return repertoryDao.selectRepertory(assist);
    }
    @Override
    public Repertory selectRepertoryByObj(Repertory obj){
        return repertoryDao.selectRepertoryByObj(obj);
    }
    @Override
    public Repertory selectRepertoryById(Integer id){
        return repertoryDao.selectRepertoryById(id);
    }
    @Override
    public int insertRepertory(Repertory value){
        return repertoryDao.insertRepertory(value);
    }
    @Override
    public int insertNonEmptyRepertory(Repertory value){
        return repertoryDao.insertNonEmptyRepertory(value);
    }
    @Override
    public int insertRepertoryByBatch(List<Repertory> value){
        return repertoryDao.insertRepertoryByBatch(value);
    }
    @Override
    public int deleteRepertoryById(Integer id){
        return repertoryDao.deleteRepertoryById(id);
    }
    @Override
    public int deleteRepertory(Assist assist){
        return repertoryDao.deleteRepertory(assist);
    }
    @Override
    public int updateRepertoryById(Repertory enti){
        return repertoryDao.updateRepertoryById(enti);
    }
    @Override
    public int updateRepertory(Repertory value, Assist assist){
        return repertoryDao.updateRepertory(value,assist);
    }
    @Override
    public int updateNonEmptyRepertoryById(Repertory enti){
        return repertoryDao.updateNonEmptyRepertoryById(enti);
    }
    @Override
    public int updateNonEmptyRepertory(Repertory value, Assist assist){
        return repertoryDao.updateNonEmptyRepertory(value,assist);
    }

    @Override
    public List<Repertory> getRepositoryListByCompanyId(int companyId) {
        Assist assist=new Assist();
        Assist.WhereRequire w1=Assist.andEq("companyId",companyId);
        assist.setRequires(w1);
        return repertoryDao.selectRepertory(assist);
    }

    @Override
    public Map<String, List<Repertory>> selectRepertory(int companyId) {
        Assist assist=new Assist();
        Assist.WhereRequire w1=Assist.andEq("companyId",companyId);
        Assist.WhereRequire w2=Assist.andGt("repertoryNum",0);
        assist.setRequires(w1,w2);
        Map<String, List<Repertory>> map=new HashMap<>();
        List<Repertory> list=repertoryDao.selectRepertory(assist);
        map.put("repositoryCars",list);
        return  map;
    }

    public RepertoryDao getRepertoryDao() {
        return this.repertoryDao;
    }

    public void setRepertoryDao(RepertoryDao repertoryDao) {
        this.repertoryDao = repertoryDao;
    }

}