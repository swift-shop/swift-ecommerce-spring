package com.swift.ecommerce.service.impl;

import com.swift.ecommerce.entity.AppletAccesstoken;
import com.swift.ecommerce.dao.AppletAccesstokenDao;
import com.swift.ecommerce.service.AppletAccesstokenService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (AppletAccesstoken)表服务实现类
 *
 * @author makejava
 * @since 2025-01-09 00:21:58
 */
@Service("appletAccesstokenService")
public class AppletAccesstokenServiceImpl implements AppletAccesstokenService {
    @Resource
    private AppletAccesstokenDao appletAccesstokenDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AppletAccesstoken queryById(Integer id) {
        return this.appletAccesstokenDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param appletAccesstoken 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<AppletAccesstoken> queryByPage(AppletAccesstoken appletAccesstoken, PageRequest pageRequest) {
        long total = this.appletAccesstokenDao.count(appletAccesstoken);
        return new PageImpl<>(this.appletAccesstokenDao.queryAllByLimit(appletAccesstoken, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param appletAccesstoken 实例对象
     * @return 实例对象
     */
    @Override
    public AppletAccesstoken insert(AppletAccesstoken appletAccesstoken) {
        this.appletAccesstokenDao.insert(appletAccesstoken);
        return appletAccesstoken;
    }

    /**
     * 修改数据
     *
     * @param appletAccesstoken 实例对象
     * @return 实例对象
     */
    @Override
    public AppletAccesstoken update(AppletAccesstoken appletAccesstoken) {
        this.appletAccesstokenDao.update(appletAccesstoken);
        return this.queryById(appletAccesstoken.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.appletAccesstokenDao.deleteById(id) > 0;
    }
}
