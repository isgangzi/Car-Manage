package com.CarManage.dao;

import com.CarManage.entitys.CarDriving;

public interface CarDrivingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarDriving record);

    int insertSelective(CarDriving record);

    CarDriving selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarDriving record);

    int updateByPrimaryKey(CarDriving record);
}