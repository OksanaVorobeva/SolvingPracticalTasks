package com.exampl.arrayCollection;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Task111 {
    //Вычисление отсутствия/присутствия элемента в отображение Map

    public static void main(String[] args) throws UnknownHostException {
        //Пример 1 (computeIfPresent())
        Map<String,String> map = new HashMap<>();
        map.put("postgres","127.0.0.1");
        map.put("mysql","192.168.0.50");
        BiFunction<String,String,String> jbaUrl
                = (k,v) ->"jdbc:"+k+"://"+v+"/customers_db";
        String mysqlUrl = map.computeIfPresent("mysql",jbaUrl);
        System.out.println(mysqlUrl);
        String voldDbUrl=map.computeIfPresent("volddb",jbaUrl);
        System.out.println(voldDbUrl);

        //Пример 2 (computeIfAbsent())
        Map<String,String> map2=new HashMap<>();
        map2.put("postgres","jdbc:postgresql://127.0.0.1/customers_db");
        map2.put("mysql","jdbc:mysql://1192.168.0.50/customers_db");
        String address= InetAddress.getLocalHost().getHostAddress();
        Function<String, String> jdbcUrl =k->k+"://"+address+"/customers_db";
        String mongodbUrl=map2.computeIfAbsent("mongodb",jdbcUrl);
        System.out.println(mongodbUrl);

        //Пример3 (compute())
        Map<String,String> map3 = new HashMap<>();
        map.put("postgres","127.0.0.1");
        map.put("mysql","192.168.0.50");
        String address2 =  InetAddress.getLocalHost().getHostAddress();
        BiFunction<String,String,String> jdbcUrl2=(k,v)
        -> "jdbc:"+k+"://"+((v==null)?address2:v)
                +"/customers_db";
        String mysqlJdbcUrl =map3.compute("debry",jdbcUrl2);
        System.out.println(mysqlJdbcUrl);

        //Пример 4 (merge())
        Map<String,String> map4 = new HashMap<>();
        map.put("postgres","9.6.1 ");
        map.put("mysql","5.1 5.2 5.6 ");
        BiFunction<String,String,String> jdbcUrl4=(vold,vnew)->vold.concat(vnew);
        String mySqlVersion =map4.merge("mysql","8.0 ",jdbcUrl4);
        System.out.println(mySqlVersion);

        //Пример 5 (putIfAbsent())
        Map<Integer,String> map5 =new HashMap<>();
        map5.put(1,"postgresql");
        map5.put(2,"mysql");
        map5.put(3,null);
        String v1= map5.putIfAbsent(1,"derby");
        System.out.println(v1);
        String v2 = map5.putIfAbsent(3,"derby");
        System.out.println(v2);
        String v3=map5.putIfAbsent(4,"cassandra");
        System.out.println(v3);
        System.out.println(map5.values());
    }
}
