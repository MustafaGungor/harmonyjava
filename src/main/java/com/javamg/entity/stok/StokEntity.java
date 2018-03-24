package com.javamg.entity.stok;

import com.javamg.entity.BaseEntity;

import javax.persistence.Entity;

@Entity
public class StokEntity extends BaseEntity {
    private String stokName;
    private Integer stokCount;
    private String description;
    private String stokAddress;

    public String getStokName() {
        return stokName;
    }

    public void setStokName(String stokName) {
        this.stokName = stokName;
    }

    public Integer getStokCount() {
        return stokCount;
    }

    public void setStokCount(Integer stokCount) {
        this.stokCount = stokCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStokAddress() {
        return stokAddress;
    }

    public void setStokAddress(String stokAddress) {
        this.stokAddress = stokAddress;
    }
}
