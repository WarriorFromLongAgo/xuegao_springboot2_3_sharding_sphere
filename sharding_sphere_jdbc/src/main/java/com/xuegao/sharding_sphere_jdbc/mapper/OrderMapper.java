package com.xuegao.sharding_sphere_jdbc.mapper;

import com.xuegao.sharding_sphere_jdbc.doo.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {

    Order selectById(@Param("id") Integer id);

    List<Order> selectListByUserId(@Param("userId") Integer userId);

    Order selectByUserId(@Param("userId") Integer userId);

    void insert(Order order);

}
