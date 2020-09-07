package com.xuegao.sharding_sphere_jdbc;

import com.xuegao.sharding_sphere_jdbc.doo.OrderConfig;
import com.xuegao.sharding_sphere_jdbc.mapper.OrderConfigMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingSphereJdbcApplication.class)
public class OrderConfigMapperTest {

    @Autowired
    private OrderConfigMapper orderConfigMapper;

    @Test
    public void testSelectById() {
        OrderConfig orderConfig = orderConfigMapper.selectById(1);
        System.out.println(orderConfig);
    }

}
