package com.stone.controller;

import com.alibaba.fastjson.JSONObject;
import com.stone.bean.ParkRecord;
import com.stone.conf.constant.error.ErrorEnum;
import com.stone.service.ParkingRecordService;
import com.stone.util.ReturnJSONUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/parkRecord")
public class ParkingRecordController {

    @Resource
    private ParkingRecordService parkingRecordService;

    /*
     * 添加停车记录信息
     *
     * */
    @PostMapping("/addRecord")
    public JSONObject addRecord(@RequestBody ParkRecord parkRecord) {
        int flag = parkingRecordService.addRecord(parkRecord);
        return flag > 0 ? ReturnJSONUtils.successJson() : ReturnJSONUtils.errorJson(ErrorEnum.E_400);
    }

    /*
     * 查询停车记录信息
     *
     * */
    @GetMapping("/getRecord")
    public JSONObject getRecord(@RequestParam int userId) {
        return ReturnJSONUtils.successJson(parkingRecordService.getRecord(userId));
    }
}
