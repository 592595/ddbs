package com.pan.service;

import com.pan.model.AdminBuyerMes;
import com.pan.model.AdminBuyerMes;

import java.util.List;

public interface AdminBuyerService {
    public List<AdminBuyerMes> findAllBuyers();
    public List<AdminBuyerMes> findBuyerByScore();
}