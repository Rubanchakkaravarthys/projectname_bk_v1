package com.example.demo.service;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Product;

public interface Productinterface {
Product findbyid(int id);

}
