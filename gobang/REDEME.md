##### 接口路由

 UserController下

​	1、/user/register.do：此接口是注册接口。

​	2、/user/login.do：是登录接口

​	3、/user/create.do：是创建房间的接口

​	4、/user/search.do：是查询房间的接口，查询成功返回房间名

​	5、/user/join.do：是加入房间的接口

​	6、/user/change.do：是改变准备与未准备的接口

​	7、/user/check.do：如果玩家准备完毕，则开始游戏的接口

 ChessController下

​	1、/chess/getPlace.do：得到对方的棋子的位置的接口

​	2、/chess/savePlace.do：保存棋子的位置接口

​	3、/chess/changePerson.do：双方轮流下棋的接口

##### 代码运行环境

​	mysql+jdk1.8