package com.javamg.service.stok;

import com.javamg.dao.stok.StokDao;
import com.javamg.entity.stok.StokEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class StokService {
    @Autowired
    private StokDao stokDAO;

    public StokEntity getStokById(int stokId) {
        StokEntity obj = stokDAO.find(stokId);
        return obj;
    }

    public List<StokEntity> getAllArticles(){
        return stokDAO.findAll();
    }

    public boolean add(StokEntity stok){
//        if (articleDAO.articleExists(stok.getTitle(), article.getCategory())) {
//            return false;
//        } else {
            stokDAO.create(stok);
            return true;
//        }
    }
}
