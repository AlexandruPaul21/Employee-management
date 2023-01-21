package com.example.employeemanagement.service;

public interface AbstractService<T> {
    Iterable<T> listAll();
    T getById(Long id);
    T save(T t);
}
