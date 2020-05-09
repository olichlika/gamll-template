# 说明
springboot模板文件

集合了`dubbo` `thymeleaf` `fastdfs`

这些配置保存在本地虚拟机

# dubbo
配置
```
# dubbo的配置
# dubbo中的服务名称
spring.dubbo.application=item-web
# dubbo的通讯协议名称
spring.dubbo.protocol.name=dubbo
# zookeeper注册中心的地址
spring.dubbo.registry.address=192.168.1.171:2181
# zookeeper的通讯协议的名称
spring.dubbo.registry.protocol=zookeeper
# dubbo的服务的扫描路径
spring.dubbo.base-package=com.kyseng.gmall
# 设置超时时间
spring.dubbo.consumer.timeout=600000
# 设置是否检查服务存在
spring.dubbo.consumer.check=false
```

# 使用
```
git clone git@github.com:olichlika/gamll-template.git xxx
```
`xxx`是本地的项目名称