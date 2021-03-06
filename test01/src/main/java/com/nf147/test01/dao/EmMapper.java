package com.nf147.test01.dao;

import com.nf147.test01.entity.Emp;

import java.util.List;

public interface EmMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String eId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em
     *
     * @mbg.generated
     */
    int insert(Emp record);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em
     *
     * @mbg.generated
     */
    Emp selectByPrimaryKey(String eId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em
     *
     * @mbg.generated
     */
    List<Emp> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Emp record);

    int add(List<Emp> list);
}