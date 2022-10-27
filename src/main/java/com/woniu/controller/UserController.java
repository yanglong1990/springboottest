package com.woniu.controller;
import com.woniu.pojo.SysUser;
import com.woniu.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sysUser")
public class UserController {
    private static final Logger logger= LoggerFactory.getLogger(UserController.class);
    @Autowired
    private SysUserService sysUserService;
    @RequestMapping("list")
    @ResponseBody
    public List<SysUser> list(){
        logger.trace("trace");
        return sysUserService.selectByExample(null);
    }
}
