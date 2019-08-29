package org.goods.service;

import org.common.dto.OrderDTO;
import org.common.response.ObjectResponse;
import org.goods.entity.TOrder;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  创建订单
 * </p>
 *
 * @author heshouyou
 * @since 2019-01-13
 */
public interface ITOrderService extends IService<TOrder> {

    /**
     * 创建订单
     */
    ObjectResponse<OrderDTO> createOrder(OrderDTO orderDTO);
}
