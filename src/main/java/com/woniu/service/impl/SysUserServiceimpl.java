package com.woniu.service.impl;

import com.woniu.dao.SysUserDao;
import com.woniu.pojo.SysUser;
import com.woniu.pojo.SysUserExample;
import com.woniu.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SysUserServiceimpl implements SysUserService {
    @Autowired
    private SysUserDao sysUserDao;
    @Override
    public long countByExample(SysUserExample example) {
        return this.sysUserDao.countByExample(example);
    }

    @Override
    public int deleteByExample(SysUserExample example) {
        return this.sysUserDao.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long userid) {
        return this.sysUserDao.deleteByPrimaryKey(userid);
    }

    @Override
    public int insert(SysUser record) {
        return this.sysUserDao.insert(record);
    }

    @Override
    public int insertSelective(SysUser record) {
        return this.sysUserDao.insertSelective(record);
    }

    @Override
    public List<SysUser> selectByExample(SysUserExample example) {
        return this.sysUserDao.selectByExample(example);
    }

    @Override
    public SysUser selectByPrimaryKey(Long userid) {
        return this.sysUserDao.selectByPrimaryKey(userid);
    }

    @Override
    public int updateByExampleSelective(SysUser record, SysUserExample example) {
        return this.sysUserDao.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(SysUser record, SysUserExample example) {
        return this.sysUserDao.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return this.sysUserDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysUser record) {
        return this.sysUserDao.updateByPrimaryKey(record);
    }
}
