package com.javamg.controller;

import com.javamg.dao.stok.StokDao;
import com.javamg.entity.stok.StokEntity;
import com.javamg.service.stok.StokService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author MustafaGungor
 * @since 10.06.2017
 * @version 1.0.0
 *
 */
@RestController
@RequestMapping("department")
@CrossOrigin(origins = "http://localhost:3000")
public class DepartmentController {

    @Autowired
    private StokService stokService;

    @RequestMapping(value = "read", method = RequestMethod.GET)
    public List getAllDepartment() {
        List list = new ArrayList();
        StokEntity entity = new StokEntity();
        entity.setDescription("denemeDescription");
        entity.setStokAddress("deneme Mahallesi");
        entity.setStokCount(7);
        entity.setStokName("Deneme Stok");
        stokService.add(entity);
        list.add("sTRİNG 1");
        list.add("sTRİNG 2");
        list.add("sTRİNG 3");
        return stokService.getAllArticles();
    }

//    @RequestMapping(value = "post", method = RequestMethod.POST)
//    public void createDepartment(Department department) {
//        departmentService.createDepartment(department);
//    }
//
//    @RequestMapping(value = "update/{id}", method = RequestMethod.PUT)
//    public void updateDepartment(@PathVariable("id") Integer id) {
//        departmentService.updateDepartment(id);
//    }
//
//    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
//    public void deleteDepartment(@PathVariable("id") Integer id) {
//        departmentService.deleteDepartment(id);
//    }
}
