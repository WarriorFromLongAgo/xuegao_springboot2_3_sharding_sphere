package com.xuegao.sharding_sphere_jdbc;

import com.xuegao.sharding_sphere_jdbc.doo.Order;
import com.xuegao.sharding_sphere_jdbc.mapper.OrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingSphereJdbcApplication.class)
public class OrderMapperTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void testSelectById() {
        Order order = orderMapper.selectById(1);
        System.out.println(order);
    }

    @Test
    public void testSelectListByUserId() {
        List<Order> orders = orderMapper.selectListByUserId(1);
        System.out.println(orders.size());
        System.out.println(orders.get(0));
    }

    @Test
    public void testSelectByUserId() {
        Order order = orderMapper.selectByUserId(0);
        System.out.println(order);
        order = orderMapper.selectByUserId(1);
        System.out.println(order);
    }

    @Test
    public void testInsert() {
        Order order = new Order();
        order.setUserId(0);
        orderMapper.insert(order);
        order.setUserId(2);
        orderMapper.insert(order);
        order.setUserId(4);
        orderMapper.insert(order);
        order.setUserId(6);
        orderMapper.insert(order);
        order.setUserId(1);
        orderMapper.insert(order);
        order.setUserId(3);
        orderMapper.insert(order);
        order.setUserId(5);
        orderMapper.insert(order);
        order.setUserId(7);
        orderMapper.insert(order);

    }

}
