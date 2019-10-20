package com.stone.service;


import com.stone.bean.ParkRecord;

import java.util.List;

public interface ParkingRecordService {

    int addRecord(ParkRecord record);

    List<ParkRecord> getRecord(int userId);
}
