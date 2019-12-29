package thrift;

import com.dk.thrift.Hello;
import org.apache.thrift.TException;

/**
 * @author DingKai
 * @version 1.0
 */
public class HelloServiceImpl implements Hello.Iface{
    @Override
    public String helloString(String para) throws TException {
        return "result:"+para;
    }
}
