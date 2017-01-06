
###使用 idea 创建 Maven 项目--引用jfinal

- 创建 Maven 的 web 模板项目
![](assets/1.png)
- 编写好相关信息：
![](assets/2.png)
- 选择要用到的 maven 版本，注意在 maven 中设置好阿里云镜像。
![](assets/3.png)
- 点击下一步直到创建好项目，如下图：
![](assets/4.png)
- 在 pom.xml 中引入 jfinal
![](assets/5.png)
- 从创建好的项目中可以看到还差一个 java 目录，这里我们可以手动创建并且设置为源文件。
![](assets/8.png)
- 添加好 jfinal 依赖后，编写好相关 jfinal 的代码。配置好项目输出路径和 tomcat 服务器。
![](assets/6.png)
![](assets/7.png)

>修改 maven 镜像源:
>![](assets/9.png)

