package com.xuegao.sharding_sphere_jdbc.doo;

/**
 * <br/> @PackageName：com.xuegao.sharding_sphere_jdbc.model.doo
 * <br/> @ClassName：OrderConfig
 * <br/> @Description：
 * <br/> @author：花名 xuegao
 * <br/> @date：2020/9/7 16:42
 */
public class OrderConfig {

    /**
     * 编号
     */
    private Integer id;
    /**
     * 支付超时时间
     *
     * 单位：分钟
     */
    private Integer payTimeout;

    public Integer getId() {
        return id;
    }

    public OrderConfig setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getPayTimeout() {
        return payTimeout;
    }

    public OrderConfig setPayTimeout(Integer payTimeout) {
        this.payTimeout = payTimeout;
        return this;
    }
}