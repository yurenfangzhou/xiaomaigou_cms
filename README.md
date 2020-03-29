# 小麦购商城(XiaoMaiGou.COM)
小麦购商城(XiaoMaiGou.COM)是一个开源的电商导购网站，基于内容运营、活动运营、营销及体验运营的完整导购解决方案。采用前后端分离开发，集成淘宝、京东以及大淘客等接口，只需将[静态页面](xiaomaigou_cms_web/static)部署到Nginx、Apache或Tomcat下即可使用，甚至无需任何服务器，将该静态文件上传到[阿里云对象存储OSS](https://www.aliyun.com/product/oss) 或者其他云提供商的对象存储服务中即可拥有一个属于自己的电商导购网站。同时，也可以自己单独部署后台，自定义商品推广，一个真正属于自己的完整导购解决方案。

演示：http://cms.xiaomaigou.com

## 特点

- 0 开发

	无需开发，无需懂技术， 3分钟即可拥有自己的导购商城

- 独创高品质内容

	百人专业运营团队，定期策划各 色主题活动、创新热点栏目

- 0 成本运营商城
	
	精细化运营，10+特色栏目 ，海量营销玩法，提高购买转化率
- n+ 次产品迭代升级
	
	0技术支撑，产品适应市场变化 实时迭代上线新功能

## 特色栏目

- 9块9包邮

	超万款底价好物，吸引买家眼球

- 疯抢榜

	实时更新，提供更多购物参考

- 咚咚抢

	人工精选，每日限时抢



## 部署

### 前端

将项目xiaomaigou_cms_web/static/pc下所有的文件上传到Nginx、Apache或Tomcat相应项目下即可访问，同时，也可将其上传到[阿里云对象存储OSS](https://www.aliyun.com/product/oss) 或者其他云提供商的对象存储服务中。

### 后台（可选）

该项为非必须，将打包后的xiaomaigou_cms\xiaomaigou_cms_parent\xiaomaigou_cms_service\target\xiaomaigou_cms_service.jar上传到服务器中，执行命令：

```
nohup java -jar xiaomaigou_cms_service.jar com.xiaomaigou.cms.service.Application >> xiaomaigou_cms_service.log &
```

浏览器访问：http://localhost:9999/swagger-ui.html

## 开发

xiaomaigou_cms采用IntelliJ IDEA开发，至少需要以下环境的IDE：

- 支持Java

- 支持Maven

### 下载项目

```
git clone https://github.com/xiaomaiyun/xiaomaigou_cms.git
```

### 修改配置

修改xiaomaigou_cms_dao和xiaomaigou_cms_service模块中以.properties结尾的配置文件

### 启动

运行xiaomaigou_cms_service模块中com.xiaomaigou.cms.service.Application类

### 访问

浏览器访问：http://localhost:9999/swagger-ui.html

## Support

## Documentation

## Fork and Contribute

## About

小麦：xiaomaiyun@gmail.com





