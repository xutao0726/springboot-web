package com.jsw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jsw.entity.OrderCoupon;
import com.jsw.mapper.OrderCouponMapper;
import com.jsw.service.OrderCouponService;
@Service
public class OrderCouponServiceImpl implements OrderCouponService{
	@Autowired
	public OrderCouponMapper orderCouponMapper;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return orderCouponMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(OrderCoupon record) {
		return orderCouponMapper.insert(record);
	}

	@Override
	public int insertSelective(OrderCoupon record) {
		return orderCouponMapper.insertSelective(record);
	}

	@Override
	public OrderCoupon selectByPrimaryKey(Integer id) {
		return orderCouponMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(OrderCoupon record) {
		return orderCouponMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(OrderCoupon record) {
		return orderCouponMapper.updateByPrimaryKey(record);
	}

}
