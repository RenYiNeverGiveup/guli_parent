package com.atguigu.eduservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("service-order")
public interface OrdersClient {


    /**
     * 根据课程id和用户id查询订单表中订单状态
     *
     * @param courseId 课程ID
     * @param memberId 会员ID
     * @return 是否支付 true：已支付  false：未支付
     */
    @GetMapping("/eduorder/order/isBuyCourse/{courseId}/{memberId}")
    boolean isBuyCourse(@PathVariable("courseId") String courseId, @PathVariable("memberId") String memberId);
}
