package com.service.Impl;
import java.util.List;
import com.dao.CarorderDao;
import com.bean.Carorder;
import com.common.Assist;
import com.service.CarorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CarorderServiceImpl implements CarorderService{
    @Autowired
    private CarorderDao carorderDao;
    @Override
    public long getCarorderRowCount(Assist assist){
        return carorderDao.getCarorderRowCount(assist);
    }
    @Override
    public List<Carorder> selectCarorder(Assist assist){
        return carorderDao.selectCarorder(assist);
    }
    @Override
    public Carorder selectCarorderByObj(Carorder obj){
        return carorderDao.selectCarorderByObj(obj);
    }
    @Override
    public Carorder selectCarorderById(Integer id){
        return carorderDao.selectCarorderById(id);
    }
    @Override
    public int insertCarorder(Carorder value){
        return carorderDao.insertCarorder(value);
    }
    @Override
    public int insertNonEmptyCarorder(Carorder value){
        return carorderDao.insertNonEmptyCarorder(value);
    }
    @Override
    public int insertCarorderByBatch(List<Carorder> value){
        return carorderDao.insertCarorderByBatch(value);
    }
    @Override
    public int deleteCarorderById(Integer id){
        return carorderDao.deleteCarorderById(id);
    }
    @Override
    public int deleteCarorder(Assist assist){
        return carorderDao.deleteCarorder(assist);
    }
    @Override
    public int updateCarorderById(Carorder enti){
        return carorderDao.updateCarorderById(enti);
    }
    @Override
    public int updateCarorder(Carorder value, Assist assist){
        return carorderDao.updateCarorder(value,assist);
    }
    @Override
    public int updateNonEmptyCarorderById(Carorder enti){
        return carorderDao.updateNonEmptyCarorderById(enti);
    }
    @Override
    public int updateNonEmptyCarorder(Carorder value, Assist assist){
        return carorderDao.updateNonEmptyCarorder(value,assist);
    }

    public CarorderDao getCarorderDao() {
        return this.carorderDao;
    }

    public void setCarorderDao(CarorderDao carorderDao) {
        this.carorderDao = carorderDao;
    }

}