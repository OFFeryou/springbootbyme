package com.xch.springbootbyme.service.imp;

import com.xch.springbootbyme.dao.HelloDao;
import com.xch.springbootbyme.pojo.HelloPojo;
import com.xch.springbootbyme.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional()
public class HelloServiceImpl implements HelloService {
    @Autowired
    private HelloDao helloDao;

    @Override
    public List<HelloPojo> getAll() {
        List<HelloPojo> selectAll = helloDao.getSelectAll();
        return selectAll;
    }

}
