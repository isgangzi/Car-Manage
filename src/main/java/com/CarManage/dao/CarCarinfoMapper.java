package com.CarManage.dao;

import com.CarManage.entitys.CarCarinfo;

public interface CarCarinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarCarinfo record);

    int insertSelective(CarCarinfo record);

    CarCarinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarCarinfo record);

    int updateByPrimaryKeyWithBLOBs(CarCarinfo record);

    int updateByPrimaryKey(CarCarinfo record);
}