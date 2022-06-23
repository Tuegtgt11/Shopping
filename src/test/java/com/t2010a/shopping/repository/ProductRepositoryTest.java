package com.t2010a.shopping.repository;

import com.t2010a.shopping.ShoppingApplication;
import com.t2010a.shopping.entity.Product;
import com.t2010a.shopping.entity.enums.ProductSimpleStatus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ShoppingApplication.class})
class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testSaveProduct(){
        Product product = Product.builder()
                .id(UUID.randomUUID().toString())
                .name("Tong Lao")
                .slug("1")
                .description("Lorems...")
                .detail("Lorems....")
                .price(new BigDecimal(200))
                .thumbnails("abc.jpg")
                .status(ProductSimpleStatus.ACTIVE)
                .build();
    }
}