package com.roy.mapper;

import com.roy.bean.Book;

/**
 * description：
 * author：dingyawu
 * date：created in 22:00 2020-12-15
 * history: 
 */
public interface BookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}