package com.CarManage.dao;

import com.CarManage.entitys.CarDriverinfo;

public interface CarDriverinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarDriverinfo record);

    int insertSelective(CarDriverinfo record);

    CarDriverinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarDriverinfo record);

    int updateByPrimaryKey(CarDriverinfo record);
}