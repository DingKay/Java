package com.dk.thriftclient;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * @author dingkai
 * @create 2018-10-19 9:42
 */
public class HelloServiceCilent {
    /**
     * thrift 客户端
     */
    public static void main(String[] args) {
        System.out.println("客户端启动...");

        TTransport tp =null;

        try {
            tp = new TSocket("localhost",9898,30000); //url port timeout

            //协议要和服务端一致
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
