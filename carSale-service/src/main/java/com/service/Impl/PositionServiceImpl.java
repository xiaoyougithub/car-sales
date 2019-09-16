package com.service.Impl;
import java.util.List;
import com.dao.PositionDao;
import com.bean.Position;
import com.common.Assist;
import com.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PositionServiceImpl implements PositionService{
    @Autowired
    private PositionDao positionDao;
    @Override
    public long getPositionRowCount(Assist assist){
        return positionDao.getPositionRowCount(assist);
    }
    @Override
    public List<Position> selectPosition(Assist assist){
        return positionDao.selectPosition(assist);
    }
    @Override
    public Position selectPositionByObj(Position obj){
        return positionDao.selectPositionByObj(obj);
    }
    @Override
    public Position selectPositionById(Integer id){
        return positionDao.selectPositionById(id);
    }
    @Override
    public int insertPosition(Position value){
        return positionDao.insertPosition(value);
    }
    @Override
    public int insertNonEmptyPosition(Position value){
        return positionDao.insertNonEmptyPosition(value);
    }
    @Override
    public int insertPositionByBatch(List<Position> value){
        return positionDao.insertPositionByBatch(value);
    }
    @Override
    public int deletePositionById(Integer id){
        return positionDao.deletePositionById(id);
    }
    @Override
    public int deletePosition(Assist assist){
        return positionDao.deletePosition(assist);
    }
    @Override
    public int updatePositionById(Position enti){
        return positionDao.updatePositionById(enti);
    }
    @Override
    public int updatePosition(Position value, Assist assist){
        return positionDao.updatePosition(value,assist);
    }
    @Override
    public int updateNonEmptyPositionById(Position enti){
        return positionDao.updateNonEmptyPositionById(enti);
    }
    @Override
    public int updateNonEmptyPosition(Position value, Assist assist){
        return positionDao.updateNonEmptyPosition(value,assist);
    }

    public PositionDao getPositionDao() {
        return this.positionDao;
    }

    public void setPositionDao(PositionDao positionDao) {
        this.positionDao = positionDao;
    }

}