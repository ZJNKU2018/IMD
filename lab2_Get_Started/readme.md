# LAB2 GET STARTED  

## 安装Android Studio
在官网上安装并下载Android Studio即可。安装前电脑系统需要安装了JDK（版本1.8以上）。  
官网地址：https://developer.android.google.cn/studio/  
可参考教程：https://blog.csdn.net/dhhyx/article/details/108277116

## 新建HelloWorld
打开Android Studio,选择新建一个空项目即可。

## 运行HelloWorld
可选择虚拟手机或连接手机运行。  
### 虚拟手机  
Tools ->AVD manager，按照步骤新建一个虚拟手机并运行即可。建立中需要下载一些文件按照提示安装即可。
最后一步需要安装Inter HAXM扩展，只需要 Tools ->SDK manager->Android SDK->SDK Tools,然后勾选Inter x86 Emulator Accelerator(HAXM installer) ,然后点击OK即可。
### 连接手机  
首先得在手机端设置;设置->关于手机->软件信息->点击版本号5次就会出现“开发者模式”，返回上一层，使用USB连接线连接手机和电脑，在开发者模式中点击USB调试即可。
如果连接成功，那么在电脑端运行程序，手机上会自动安装并启动相应的APP。
## 说明
lab2实验的课件我没下下来，所以暂时提交这些。如果不全会根据要求进行更新。
