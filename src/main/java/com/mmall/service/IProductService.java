package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;
import com.mmall.vo.ProductDetailVo;
import com.mmall.vo.ProductListTestVo;
import com.mmall.vo.ProductSugVo;

import java.util.List;

public interface IProductService {

    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse<String> setSaleStatus(Integer productId,Integer status);

    //ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);

    ServerResponse<PageInfo> getProductList(Integer role,int pageNum, int pageSize);

    //ServerResponse<PageInfo> searchProduct(String productName,Integer productId,int pageNum,int pageSize);

    ServerResponse<ProductDetailVo> getProductDetail(Integer role,Integer productId);

    ServerResponse<PageInfo> getProductByKeywordCategory(Integer role,String keyword,Integer categoryId,int pageNum,int pageSize,String orderBy);

    ServerResponse<PageInfo> getProductListTest(Integer role,int pageNum,int pageSize,int categoryId);

    ServerResponse<List<ProductSugVo>> getProductSugList(int categoryId);

    ServerResponse<List<ProductSugVo>> getProductLoveList();

    ServerResponse addCollect(Integer userId,Integer productId);

    ServerResponse delectCollect(Integer userId,Integer productId);

    ServerResponse<PageInfo> getCollect(Integer role,Integer userId,int pageNum,int pageSize);

    ServerResponse queryCollect(Integer userId,Integer product);

    ServerResponse getProductListByKeyword(Integer role,int pageNum,int pageSize,String keyword);

}
