package com.jsw.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.jsw.entity.OrderCoupon;
@Mapper
public interface OrderCouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderCoupon record);

    int insertSelective(OrderCoupon record);

    OrderCoupon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderCoupon record);

    int updateByPrimaryKey(OrderCoupon record);
}