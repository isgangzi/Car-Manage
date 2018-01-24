package com.CarManage.dao;

import com.CarManage.entitys.CarInsurance;

public interface CarInsuranceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarInsurance record);

    int insertSelective(CarInsurance record);

    CarInsurance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarInsurance record);

    int updateByPrimaryKey(CarInsurance record);
}