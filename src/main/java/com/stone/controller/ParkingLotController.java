package com.stone.controller;

import com.stone.bean.OrderRecord;
import com.stone.bean.ParkingLot;
import com.stone.service.OrderRecordService;
import com.stone.service.ParkingLotService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/parkingLot")
public class ParkingLotController {

    @Resource
    private ParkingLotService parkingLotService;
    /*
     * 根据用户名查询预约记录
     * */
    @GetMapping("/getAllList")
    public List<ParkingLot> getAllList() {
        return parkingLotService.getAllList();
    }
}