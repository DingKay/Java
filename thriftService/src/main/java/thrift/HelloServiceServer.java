package thrift;

import com.dk.thrift.Hello;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

/**
 * @author DingKai
 * @version 1.0
 */
public class HelloServiceServer {
    /**
     * 启动Thrift服务
     * @param args
     */
    public static void main(String[] args) {
        try {
            System.out.println("Thrift服务端启动...");
            TProcessor tp = new Hello.Processor<Hello.Iface>(new HelloServiceImpl());

            //serversocket 端口号为9898  单线程模型
            TServerSocket serverTransport = new TServerSocket(9898);

            //
            TServer.Args tArgs = new TServer.Args(serverTransport);

            //
            tArgs.processor(tp);
            tArgs.protocolFactory(new TBinaryProtocol.Factory());

            //
            TServer server = new TSimpleServer(tArgs);

            //服务启动
            server.serve();

            //抛出异常 TTransportException TException
        }catch (TTransportException e){
            e.printStackTrace();
        }
    }
}
