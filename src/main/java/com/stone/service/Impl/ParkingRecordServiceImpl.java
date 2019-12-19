package com.stone.service.Impl;

import com.stone.bean.ParkRecord;
import com.stone.mapper.ParkingRecordMapper;
import com.stone.service.ParkingRecordService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ParkingRecordServiceImpl implements ParkingRecordService {
    @Resource
    private ParkingRecordMapper parkingRecordMapper;

    @Override
    public int addRecord(ParkRecord record) {
        return parkingRecordMapper.insertUseGeneratedKeys(record);
    }

    @Override
    public List<ParkRecord> getRecord(int userId) {
        Example example = new Example(ParkRecord.class);
        example.createCriteria().andEqualTo("userId", userId);
        return parkingRecordMapper.selectByExample(example);
    }
}
