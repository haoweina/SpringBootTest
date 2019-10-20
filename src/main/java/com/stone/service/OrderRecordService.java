package com.stone.service;

import com.stone.bean.OrderRecord;

import java.util.List;

public interface OrderRecordService {

    int addRecord(OrderRecord orderRecord, boolean isSave);

    List<OrderRecord> getRecord(String userName);

}
