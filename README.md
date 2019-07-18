# Spring-Cloud-Demo
用于个人学习的Spring Cloud全家桶小demo，Spring-cloud主要基于2.x（Greenwich.SR1）版本开发

## 节点信息
1.eureka-server: http://localhost:10210  

2.gateway: http://localhost:10310  
3.zuul: http://localhost:10320  

4.hystrix-turbine: http://localhost:10410  
5.hystrix-dashboard: http://localhost:10420  

6.config-server: http://localhost:10510  

7.admin-server: http://localhost:10610  

8.producer: http://localhost:10711  
9.consumer: http://localhost:10712  

## 更新日志
2019/07/02  新增turbine项目，若监听项目配置了context-path，则turbine因无法找到上下文而监听不到  

2019/07/08  新增zuul路由后，可删除context-path配置，现在turbine可重新聚合监听服务接口情况  

2019/07/09  新增gateway，替代zuul

## 操作步骤
1.hystrix dashboard  

    打开http://localhost:10420/hystrix  
    输入框输入http://localhost:10712/actuator/hystrix.stream，查看consumer信息  
    或者输入http://localhost:10410/turbine.stream，查看所有服务的聚合信息
  
2.config-server

    curl -X POST http://localhost:10510/actuator/bus-refresh/，post执行以刷新最新配置  

3.admin-server

    打开http://localhost:10610，账号admin密码admin，以查看相关服务信息