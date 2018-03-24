package com.javamg.dao.stok;

import com.javamg.dao.BaseDao;
import com.javamg.entity.stok.StokEntity;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class StokDao extends BaseDao<StokEntity,String> {

    public List<StokEntity> loadPaginationHere(int pageNumber, int pageSize){
        String q = "SELECT s FROM "+StokEntity.class.getName()+" s";
        return super.loadPagination(q, pageNumber, pageSize);
    }
}
