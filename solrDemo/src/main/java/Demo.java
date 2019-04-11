import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.core.query.result.ScoredPage;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author DingKai
 * @Classname Demo
 * @Description TODO
 * @create 2019/4/11
 */
public class Demo {

    public static void main(String[] args) {
        //addData();
        //selectById();
        //delById();
        //addDataOneHundred();
        //findPage();
        delAllData();
    }

    public static void addData(){
        SolrTemplate solrTemplate = getSolrTemplate();
        //添加数据
        TbItem item = new TbItem();
        item.setId(1L);
        item.setBrand("华为");
        item.setCategory("手机");
        item.setGoodsId(1L);
        item.setSeller("华为专卖店");
        item.setTitle("华为mate9");
        item.setPrice(new BigDecimal(2000));

        //调用方法实现添加
        solrTemplate.saveBean(item);
        //提交
        solrTemplate.commit();
    }

    private static SolrTemplate getSolrTemplate() {
        //读取配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-solr.xml");
        //获取对象SolrTemplate
        return (SolrTemplate) context.getBean("solrTemplate");
    }

    public static void selectById(){
        SolrTemplate solrTemplate = getSolrTemplate();
        TbItem tbItem = solrTemplate.getById(1, TbItem.class);
        System.out.println(tbItem.getTitle());
    }

    public static void delById(){
        SolrTemplate solrTemplate = getSolrTemplate();
        solrTemplate.deleteById("1");
        solrTemplate.commit();
    }
    public static void addDataOneHundred(){
        SolrTemplate solrTemplate = getSolrTemplate();
        TbItem tbItem = new TbItem();
        for (int i = 0; i < 100; i++) {
            tbItem.setId((long)i);
            tbItem.setBrand("华为");
            tbItem.setCategory("手机");
            tbItem.setGoodsId(1L);
            tbItem.setSeller("华为专卖店1");
            tbItem.setTitle("华为mate1");
            tbItem.setPrice(new BigDecimal(3000));

            //调用方法实现添加
            solrTemplate.saveBean(tbItem);
        }
        solrTemplate.commit();
    }

    public static void findPage(){
        SolrTemplate solrTemplate = getSolrTemplate();
        //设置分页条件,开始位置:每页显示记录
        Query query = new SimpleQuery("*:*");
        //开始页数
        query.setOffset(0);
        //每页记录数
        query.setRows(20);
        //调用分页方法实现分页查询
        ScoredPage<TbItem> page = solrTemplate.queryForPage(query, TbItem.class);

        //获取分页之后的数据
        long totalElements = page.getTotalElements();
        System.out.println(totalElements);

        List<TbItem> content = page.getContent();
        for (TbItem tbItem : content) {
            System.out.println(tbItem.getTitle() + "::" + tbItem.getCategory());
        }

    }

    public static void delAllData(){
        Query query = new SimpleQuery("*:*");
        SolrTemplate solrTemplate = getSolrTemplate();
        solrTemplate.delete(query);
        solrTemplate.commit();
    }
}
