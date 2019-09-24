package com.lhf.spi.service;

import sun.misc.Service;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author Pirate
 * @desc 主测试类
 * @since v1.0.0
 **/
public class MainTest {

    public static void main(String[] args) {
        Iterator<SpiService> providers = Service.providers(SpiService.class);
        ServiceLoader<SpiService> load = ServiceLoader.load(SpiService.class);

        while(providers.hasNext()){
            SpiService next = providers.next();
            next.execute();
        }


        Iterator<SpiService> iterator = load.iterator();
        while (iterator.hasNext()){
            SpiService next = iterator.next();
            next.execute();
        }


    }
}
