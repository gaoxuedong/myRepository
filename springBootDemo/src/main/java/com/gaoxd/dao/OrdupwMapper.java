package com.gaoxd.dao;

import com.gaoxd.pojo.Ordupw;
import com.gaoxd.pojo.OrdupwExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OrdupwMapper {
    int countByExample(OrdupwExample example);

    int deleteByExample(OrdupwExample example);

    int insert(Ordupw record);

    int insertSelective(Ordupw record);

    List<Ordupw> selectByExample(OrdupwExample example);

    int updateByExampleSelective(@Param("record") Ordupw record, @Param("example") OrdupwExample example);

    int updateByExample(@Param("record") Ordupw record, @Param("example") OrdupwExample example);
}