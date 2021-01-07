package com.example.demo.util;

import com.example.demo.dto.TestDTO;
import com.example.demo.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class createData {

    @Autowired
    TestMapper testMapper;
    public void createData(){
        List<TestDTO> testDTOList=new ArrayList<>();

        for(int i=0;i<10000;i++){
            TestDTO testDTO=new TestDTO();
            testDTO.setName("ych"+i);
            testDTO.setAge(i);
            testDTO.setSex("man");
            testDTOList.add(testDTO);
        }
        testMapper.insertToTest(testDTOList);
    }
}
