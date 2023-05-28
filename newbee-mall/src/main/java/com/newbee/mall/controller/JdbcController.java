package com.newbee.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName JdbcController
 * @Description TODO
 * @Author Administrator
 * @Date 2023/5/25 16:19
 **/
@RestController
public class JdbcController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //新增
    @GetMapping("/insert")
    public String insert(String type, String name) {
        if (StringUtils.isEmpty(type) || StringUtils.isEmpty(name)) {
            return "参数异常";
        }
        jdbcTemplate.execute("insert into jdbc_test(ds_type,ds_name) value (\"" + type + "\",\"" + name + "\")");
        return "新增" + name + ",成功";
    }

    //    删除
    @GetMapping("/delete")
    public String delete(int id) {
        if (id < 0) {
            return "参数异常";
        }
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from jdbc_test where ds_id = " + id);
        if (CollectionUtils.isEmpty(maps)) {
            return "删除的数据不存在";
        }
        jdbcTemplate.execute("delete from jdbc_test where ds_id=" + id);
        return "数据删除成功";
    }

    //    查询
    @GetMapping("/select")
    public List<Map<String, Object>> select() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from jdbc_test");
        return list;
    }

    //    修改
    @GetMapping("/update")
    public String update(int id, String type, String name) {
        if (id < 0 || StringUtils.isEmpty(type) || StringUtils.isEmpty(name)) {
            return "参数错误";
        }
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from jdbc_test where ds_id = " + id);
        if (CollectionUtils.isEmpty(maps)) {
            return "要修改的数据不存在";
        }
        jdbcTemplate.execute("update jdbc_test set ds_type = \"" + type + "\",ds_name = \"" + name + "\"where ds_id = " + id);
        return "数据修改完成";
    }
}
