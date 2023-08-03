package com.jiang.mall;

import com.jiang.mall.mapper.CategoryMapper;
import com.jiang.mall.pojo.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallApplicationTests {

    @Autowired
    CategoryMapper categoryMapper;
    @Test
    void contextLoads() {
        Category category = categoryMapper.selectById(100001);
        System.out.println("category = " + category);
    }

}
