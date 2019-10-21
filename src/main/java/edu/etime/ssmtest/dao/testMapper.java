package edu.etime.ssmtest.dao;

import edu.etime.ssmtest.pojo.test;

public interface testMapper {
    int deleteByPrimaryKey(String testid);

    int insert(test record);

    int insertSelective(test record);

    test selectByPrimaryKey(String testid);

    int updateByPrimaryKeySelective(test record);

    int updateByPrimaryKey(test record);
}