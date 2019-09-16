package com.service.Impl;
import java.util.List;
import com.dao.SaleDao;
import com.bean.Sale;
import com.common.Assist;
import com.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SaleServiceImpl implements SaleService{
    @Autowired
    private SaleDao saleDao;
    @Override
    public long getSaleRowCount(Assist assist){
        return saleDao.getSaleRowCount(assist);
    }
    @Override
    public List<Sale> selectSale(Assist assist){
        return saleDao.selectSale(assist);
    }
    @Override
    public Sale selectSaleByObj(Sale obj){
        return saleDao.selectSaleByObj(obj);
    }
    @Override
    public Sale selectSaleById(Integer id){
        return saleDao.selectSaleById(id);
    }
    @Override
    public int insertSale(Sale value){
        return saleDao.insertSale(value);
    }
    @Override
    public int insertNonEmptySale(Sale value){
        return saleDao.insertNonEmptySale(value);
    }
    @Override
    public int insertSaleByBatch(List<Sale> value){
        return saleDao.insertSaleByBatch(value);
    }
    @Override
    public int deleteSaleById(Integer id){
        return saleDao.deleteSaleById(id);
    }
    @Override
    public int deleteSale(Assist assist){
        return saleDao.deleteSale(assist);
    }
    @Override
    public int updateSaleById(Sale enti){
        return saleDao.updateSaleById(enti);
    }
    @Override
    public int updateSale(Sale value, Assist assist){
        return saleDao.updateSale(value,assist);
    }
    @Override
    public int updateNonEmptySaleById(Sale enti){
        return saleDao.updateNonEmptySaleById(enti);
    }
    @Override
    public int updateNonEmptySale(Sale value, Assist assist){
        return saleDao.updateNonEmptySale(value,assist);
    }

    public SaleDao getSaleDao() {
        return this.saleDao;
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

}