package com.jxyy.eshop.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxyy.eshop.bean.model.Product;
import com.jxyy.eshop.service.mapper.ProductMapper;
import com.jxyy.eshop.service.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
