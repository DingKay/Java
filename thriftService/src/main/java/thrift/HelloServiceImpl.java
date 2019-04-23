package thrift;

import com.dk.thrift.Hello;
import org.apache.thrift.TException;

/**
 * @author dingkai
 * @create 2018-10-19 9:15
 */
public class HelloServiceImpl implements Hello.Iface{
    @Override
    public String helloString(String para) throws TException {
        return "result:"+para;
    }
}
