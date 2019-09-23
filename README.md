# spi-test
对Java SPI机制的联系

## SPI 全称：Service Provider Interface 是一种服务发现机制。
## 原理：通过对ClassPath路径下的META-INF/services文件夹查找文件，自动加载文件里所定义的类


# SPI小栗子：
1. 创建一个SPI接口   interface com.lhf.spi.service.SpiService  
2. 创建实现类    class com.lhf.spi.service.impl.ASpiServiceImpl    和    class   com.lhf.spi.service.impl.BSpiServiceImpl
3. 在resource下创建META-INF/services文件夹，在文件夹里面创建文件（接口全路径）com.lhf.spi.service.SpiService
4. 文件内容为实现类的全路径com.lhf.spi.service.impl.ASpiServiceImpl    com.lhf.spi.service.impl.BSpiServiceImpl
   >通过两种方式加载
   >Iterator<SpiService> providers = Service.providers(SpiService.class);
   >ServiceLoader<SpiService> load = ServiceLoader.load(SpiService.class);

