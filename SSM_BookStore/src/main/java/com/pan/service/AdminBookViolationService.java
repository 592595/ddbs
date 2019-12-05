package com.pan.service;

import com.pan.model.AdminBookViolation;

import java.util.List;

public interface AdminBookViolationService {
    public List<AdminBookViolation> findAllBook();

    public int insertBooks(AdminBookViolation adminBookViolation);
}
