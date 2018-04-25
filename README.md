# ms-tool-generator
##### 这个服务可以根据自己的服务随心所欲进行配置，按照数据库表结构生成controller、service、dao、mapper等模板化代码

### 使用教程
###### 1、如下图所示打开application.yml，这里用的是MySQL数据库，url、用户名、密码换成你自己的

![第一步](https://github.com/huozhiqiang/ms-tool-generator/blob/master/images/001.png)

###### 2、如下图打开generator.properties，1表示去除数据库中表的前缀，2表示数据库中字段的类型，3表示对应的java类中的字段类型

![第二步](https://github.com/huozhiqiang/ms-tool-generator/blob/master/images/002.png)

###### 3、如下图在resources/template包下可以配置controller层、service层、dao层等，每层的java、xml数量就是你在第一步中选择的数据库中的表的数量，依次对应（2）中${className}表示除去表中的前缀后，驼峰写法并首字母大写，（3）表示首字母小写。${tableName}表示表的名字

![第三步](https://github.com/huozhiqiang/ms-tool-generator/blob/master/images/003.png)

###### 4、增加或删除包（service层、biz层）时，需要在utils下的GeneratorUtils.java这个类中的getTemplates（）和getFileName（···）方法中的代码做对应的增加和删除

###### 5、配置完代码后，启动项目，访问 http://localhost:7777/index.html url地址，点击代码生成器，选择要生成的表后，点击生成代码，然后会生成一个压缩包，解压后打开就OK了

