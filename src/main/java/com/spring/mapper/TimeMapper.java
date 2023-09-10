package com.spring.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

    @Select("SELECT SYSDATE()")
    public String getTime();

    // mapper xml을 통해 가져올 것임. 경로 /src.main.resources.com.spring.mapper/TimeMapper.xml
    public String getTime2();
}
