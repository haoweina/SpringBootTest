package com.stone.service.Impl;

import com.stone.bean.ParkingLot;
import com.stone.mapper.ParkingLotMapper;
import com.stone.service.ParkingLotService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ParkingLotServiceImpl implements ParkingLotService {
    @Resource
    private ParkingLotMapper parkingLotMapper;

    @Override
    public List<ParkingLot> getAllList() {
        return parkingLotMapper.selectAll();
    }
}
