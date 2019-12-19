package com.stone.service.Impl;

import com.stone.bean.OrderRecord;
import com.stone.mapper.OrderRecordMapper;
import com.stone.service.OrderRecordService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderRecordServiceImpl implements OrderRecordService{
    @Resource
    private OrderRecordMapper orderRecordMapper;

    @Override
    public int addRecord(OrderRecord orderRecord, boolean isSave) {
        int flag = 0;
        if (isSave) {
            orderRecord.setStatus("1");
            flag = orderRecordMapper.insertUseGeneratedKeys(orderRecord);
        } else {
            orderRecord.setStatus("0");
            flag = orderRecordMapper.updateByPrimaryKeySelective(orderRecord);
        }
        return flag;
    }

    @Override
    public List<OrderRecord> getRecord(String userName) {
        Example example = new Example(OrderRecord.class);
        example.createCriteria().andEqualTo("userName", userName);
        return orderRecordMapper.selectByExample(example);
    }
}
