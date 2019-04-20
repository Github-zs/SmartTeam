package com.zs.SmartTeam.service.serviceImpl;

import com.zs.SmartTeam.mapper.test.TestModelMapper;
import com.zs.SmartTeam.model.TestModel;
import com.zs.SmartTeam.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestModelMapper testModelMapper;

    @Override
    public List<TestModel> selectAll() {
        return testModelMapper.selectAll();
    }
}
