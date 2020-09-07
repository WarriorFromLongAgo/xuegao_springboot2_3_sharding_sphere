package com.xuegao.sharding_sphere_jdbc.doo;

/**
 * <br/> @PackageName：com.xuegao.sharding_sphere_jdbc.model.doo
 * <br/> @ClassName：Order
 * <br/> @Description：
 * <br/> @author：花名 xuegao
 * <br/> @date：2020/9/7 16:41
 */
public class Order {

    /**
     * 订单编号
     */
    private Long id;
    /**
     * 用户编号
     */
    private Integer userId;

    public Long getId() {
        return id;
    }

    public Order setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public Order setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public String toString() {
        return "OrderDO{" +
                "id=" + id +
                ", userId=" + userId +
                '}';
    }

}