package org.lan;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lan.mapper.DeptMapper;
import org.lan.mapper.EmpMapper;
import org.lan.mapper.SupermarketMapper;
import org.lan.pojo.Dept;
import org.lan.pojo.Emp;
import org.lan.pojo.Supermarket;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {

    @Resource
    SupermarketMapper supermarketMapper;

    @Resource
    EmpMapper empMapper;

    @Resource
    DeptMapper deptMapper;

    @Test
    public void testSupermarket(){
        List<Supermarket> supermarkets = supermarketMapper.selectList(null);
        List<Emp> emps = empMapper.selectList(null);
        List<Dept> depts = deptMapper.selectList(null);
        for (Supermarket supermarket : supermarkets) {
            System.out.println(supermarket);
        }
        for (Emp emp : emps) {
            System.out.println(emp);
        }
        for (Dept dept : depts) {
            System.out.println(dept);
        }
    }

    @Test
    public void testALLEQ() {
        QueryWrapper<Dept> deptQueryWrapper = new QueryWrapper<>();
        Map<String,Object> param = new HashMap<>();
        param.put("address","QWE");
        param.put("contact_number","123456789");
        deptQueryWrapper.allEq(param);

        final List<Dept> depts = deptMapper.selectList(deptQueryWrapper);
        depts.forEach(dept -> System.out.println(dept));
    }
}
