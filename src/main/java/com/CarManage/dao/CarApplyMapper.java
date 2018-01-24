package com.CarManage.dao;

import com.CarManage.entitys.CarApply;

public interface CarApplyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarApply record);

    int insertSelective(CarApply record);

    CarApply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarApply record);

    int updateByPrimaryKey(CarApply record);
}