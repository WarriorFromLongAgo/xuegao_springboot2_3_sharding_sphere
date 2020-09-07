package com.xuegao.sharding_sphere_jdbc.mapper;

import com.xuegao.sharding_sphere_jdbc.doo.OrderConfig;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderConfigMapper {

    OrderConfig selectById(@Param("id") Integer id);

}
