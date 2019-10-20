package com.stone.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.stone.bean.OrderRecord;
import com.stone.conf.constant.error.ErrorEnum;
import com.stone.service.OrderRecordService;
import com.stone.util.ReturnJSONUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.annotation.Resource;

@RestController
@RequestMapping("/orderRecord")
public class OrderRecordController {

    @Resource
    private OrderRecordService orderRecordService;
    /*
    * 预约
    * */
    @PostMapping("/addRecord")
    public JSONObject addUser(@RequestBody JSONObject requestJson) {
        OrderRecord orderRecord = JSON.parseObject(requestJson.getJSONObject("orderRecord").toJSONString(), OrderRecord.class);
        boolean isSave = requestJson.getBoolean("isSave");
        int flag = orderRecordService.addRecord(orderRecord, isSave);
        return flag > 0 ? ReturnJSONUtils.successJson() : ReturnJSONUtils.errorJson(ErrorEnum.E_400);
    }

    /*
    * 根据用户名查询预约记录
    * */
    @GetMapping("/getRrecord")
    public List<OrderRecord> getRrecord(@RequestParam String userName) {
        return orderRecordService.getRecord(userName);
    }
}
