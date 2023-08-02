package com.jiang.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiang.mall.mapper.CategoryMapper;
import com.jiang.mall.service.CategoryService;
import com.jiang.mall.pojo.Category;
import org.springframework.stereotype.Service;

/**
* @author jiang
* @description 针对表【mall_category】的数据库操作Service实现
* @createDate 2023-07-29 15:21:33
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService {

}




