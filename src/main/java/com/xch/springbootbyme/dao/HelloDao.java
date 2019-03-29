package com.xch.springbootbyme.dao;

import com.xch.springbootbyme.pojo.HelloPojo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HelloDao {
   List<HelloPojo>  getSelectAll();
}
