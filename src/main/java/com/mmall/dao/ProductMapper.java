package com.mmall.dao;

import com.mmall.pojo.Product;
import com.mmall.vo.ProductNumVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> selectList();

    List<Product> selectByNameAndProductId(@Param("productName") String productName, @Param("productId") Integer productId);

    List<Product> selectByNameAndCategoryIds(@Param("productName") String productName,@Param("categoryIdList") List<Integer> categoryIdList);

    List<Product> selectByCategoryId(@Param("categoryId") int categoryId);

    List<Product> selectByCategoryIdZb(@Param("categoryId") int categoryId);

    List<Product> selectByKeyword(String keyword);

    List<ProductNumVo> selectAllProduct(Integer category);
}