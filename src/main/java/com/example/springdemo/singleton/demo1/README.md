Spring 的单例模式创建bean 在
AbstractBeanFactory 的 getBean方法里面
![img.png](img.png)
先取缓存。无缓存则加锁。然后使用单例工程创建实例放入缓存中并返回
Link:https://www.zhihu.com/question/502043167/answer/2245846786
https://www.jb51.net/article/233193.htm