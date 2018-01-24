package com.CarManage.dao;

import com.CarManage.entitys.CarFix;

public interface CarFixMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarFix record);

    int insertSelective(CarFix record);

    CarFix selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarFix record);

    int updateByPrimaryKey(CarFix record);
}