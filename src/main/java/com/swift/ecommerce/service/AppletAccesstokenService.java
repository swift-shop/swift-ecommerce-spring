package com.swift.ecommerce.service;

import com.swift.ecommerce.entity.AppletAccesstoken;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (AppletAccesstoken)表服务接口
 *
 * @author makejava
 * @since 2025-01-09 00:21:58
 */
public interface AppletAccesstokenService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AppletAccesstoken queryById(Integer id);

    /**
     * 分页查询
     *
     * @param appletAccesstoken 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<AppletAccesstoken> queryByPage(AppletAccesstoken appletAccesstoken, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param appletAccesstoken 实例对象
     * @return 实例对象
     */
    AppletAccesstoken insert(AppletAccesstoken appletAccesstoken);

    /**
     * 修改数据
     *
     * @param appletAccesstoken 实例对象
     * @return 实例对象
     */
    AppletAccesstoken update(AppletAccesstoken appletAccesstoken);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
