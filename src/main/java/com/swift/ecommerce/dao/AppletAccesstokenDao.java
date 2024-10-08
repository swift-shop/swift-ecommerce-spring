package com.swift.ecommerce.dao;

import com.swift.ecommerce.entity.AppletAccesstoken;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (AppletAccesstoken)表数据库访问层
 *
 * @author makejava
 * @since 2025-01-09 00:20:41
 */
public interface AppletAccesstokenDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AppletAccesstoken queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param appletAccesstoken 查询条件
     * @param pageable          分页对象
     * @return 对象列表
     */
    List<AppletAccesstoken> queryAllByLimit(AppletAccesstoken appletAccesstoken, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param appletAccesstoken 查询条件
     * @return 总行数
     */
    long count(AppletAccesstoken appletAccesstoken);

    /**
     * 新增数据
     *
     * @param appletAccesstoken 实例对象
     * @return 影响行数
     */
    int insert(AppletAccesstoken appletAccesstoken);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<AppletAccesstoken> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<AppletAccesstoken> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<AppletAccesstoken> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<AppletAccesstoken> entities);

    /**
     * 修改数据
     *
     * @param appletAccesstoken 实例对象
     * @return 影响行数
     */
    int update(AppletAccesstoken appletAccesstoken);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

