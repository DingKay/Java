import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Set;

/**
 * @author DingKai
 * @Classname TestSet
 * @Description TODO
 * @create 2019/4/11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-redis.xml")
public class TestSet {
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 存入值
     */
    @Test
    public void setValue() {
        redisTemplate.boundSetOps("nameset").add("丁1");
        redisTemplate.boundSetOps("nameset").add("丁2");
        redisTemplate.boundSetOps("nameset").add("丁3");
    }

    /**
     * 提取值
     */
    @Test
    public void getValue() {
        Set members = redisTemplate.boundSetOps("nameset").members();
        System.out.println(members);
    }

    /**
     * 删除集合中的某一个值
     */
    @Test
    public void deleteValue() {
        redisTemplate.boundSetOps("nameset").remove("丁1");
    }

    /**
     * 删除整个集合
     */
    @Test
    public void deleteAllValue() {
        redisTemplate.delete("nameset");
    }

}
