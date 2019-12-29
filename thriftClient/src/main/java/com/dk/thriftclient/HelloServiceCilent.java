package com.dk.thriftclient;

import com.dk.thrift.Hello;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * @author DingKai
 * @version 1.0
 */
public class HelloServiceCilent {
    /**
     * thrift 客户端
     */
    public static void main(String[] args) {
        System.out.println("客户端启动...");

        TTransport tp =null;

        try {
            // url port timeout
            tp = new TSocket("localhost",9898,30000);

            // 协议要和服务端一致
            TProtocol protocol = new TBinaryProtocol(tp);
            Hello.Client client = new Hello.Client(protocol);
            tp.open();
            String result = client.helloString("hello,world");
            System.out.println(result);

        }catch (TTransportException e){
            e.printStackTrace();
        }catch (TException e){
            e.printStackTrace();
        }finally {
            if(null!=tp){
                tp.close();
            }
        }
    }
}
