dao;

import .entity.AdminUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * Admin User Table(AdminUser)表数据库访问层
 *
 * @author makejava
 * @since 2025-01-09 00:42:13
 */
public interface AdminUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    AdminUser queryById(Integer userId);

    /**
     * 查询指定行数据
     *
     * @param adminUser 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<AdminUser> queryAllByLimit(AdminUser adminUser, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param adminUser 查询条件
     * @return 总行数
     */
    long count(AdminUser adminUser);

    /**
     * 新增数据
     *
     * @param adminUser 实例对象
     * @return 影响行数
     */
    int insert(AdminUser adminUser);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<AdminUser> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<AdminUser> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<AdminUser> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<AdminUser> entities);

    /**
     * 修改数据
     *
     * @param adminUser 实例对象
     * @return 影响行数
     */
    int update(AdminUser adminUser);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 影响行数
     */
    int deleteById(Integer userId);

}

