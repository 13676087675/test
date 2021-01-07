package com.example.demo.mapper;

import com.example.demo.dto.TestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {

    void insertToTest(List<TestDTO> testDTOList);
}
