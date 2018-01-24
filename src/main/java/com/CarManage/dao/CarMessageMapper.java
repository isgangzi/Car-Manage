package com.CarManage.dao;

import java.util.List;

import com.CarManage.entitys.CarMessage;

public interface CarMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarMessage record);

    int insertSelective(CarMessage record);

    CarMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarMessage record);

    int updateByPrimaryKey(CarMessage record);
    
    List<CarMessage> findAll();
    
    int countItem();
}