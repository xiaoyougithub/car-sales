package com.service.Impl;
import java.util.List;
import com.dao.CarseriesDao;
import com.bean.Carseries;
import com.common.Assist;
import com.service.CarseriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CarseriesServiceImpl implements CarseriesService{
    @Autowired
    private CarseriesDao carseriesDao;
    @Override
    public long getCarseriesRowCount(Assist assist){
        return carseriesDao.getCarseriesRowCount(assist);
    }
    @Override
    public List<Carseries> selectCarseries(Assist assist){
        return carseriesDao.selectCarseries(assist);
    }
    @Override
    public Carseries selectCarseriesByObj(Carseries obj){
        return carseriesDao.selectCarseriesByObj(obj);
    }
    @Override
    public Carseries selectCarseriesById(Integer id){
        return carseriesDao.selectCarseriesById(id);
    }
    @Override
    public int insertCarseries(Carseries value){
        return carseriesDao.insertCarseries(value);
    }
    @Override
    public int insertNonEmptyCarseries(Carseries value){
        return carseriesDao.insertNonEmptyCarseries(value);
    }
    @Override
    public int insertCarseriesByBatch(List<Carseries> value){
        return carseriesDao.insertCarseriesByBatch(value);
    }
    @Override
    public int deleteCarseriesById(Integer id){
        return carseriesDao.deleteCarseriesById(id);
    }
    @Override
    public int deleteCarseries(Assist assist){
        return carseriesDao.deleteCarseries(assist);
    }
    @Override
    public int updateCarseriesById(Carseries enti){
        return carseriesDao.updateCarseriesById(enti);
    }
    @Override
    public int updateCarseries(Carseries value, Assist assist){
        return carseriesDao.updateCarseries(value,assist);
    }
    @Override
    public int updateNonEmptyCarseriesById(Carseries enti){
        return carseriesDao.updateNonEmptyCarseriesById(enti);
    }
    @Override
    public int updateNonEmptyCarseries(Carseries value, Assist assist){
        return carseriesDao.updateNonEmptyCarseries(value,assist);
    }

    public CarseriesDao getCarseriesDao() {
        return this.carseriesDao;
    }

    public void setCarseriesDao(CarseriesDao carseriesDao) {
        this.carseriesDao = carseriesDao;
    }

}