##2020-12-10
组件化项目架构搭建
    business_module 业务组件
    function_module 功能组件
    1.新建 config.gradle, 在项目project .gradle中配置config.gradle
    2.新建 module.gradle, 在businessModule .gradle中配置module.gradle
    3.配置project .gradle
        kotlin
        java
        核心： repositories, dependency(kotliin,gradle)???
    4.添加仓库 ？？？
         maven { url 'https://maven.aliyun.com/repository/google' }
         maven { url 'https://maven.aliyun.com/repository/public' }
         maven { url 'https://www.jitpack.io' }
         maven { url "http://lib.gcssloop.com/repository/gcssloop-central/" }
         mavenCentral()
         google()
         jcenter()
    6. 配置 module .gradle
        apply plugin:
        plugins{}
        project kotlin
            F_baseModule library
            F_commonModule application\library
            B_loginModule application\library
            B_mainModule application\library
            A_app application
        sourceSets 
            app: manifest.xml
            module: own/manifest.xml
    7. dependency 管理
    
    
        testImplement
        implement
        ...
    8. application
        init
        data
    9. tools
        sharedprefence
        多次点击
        toast
        date
        http
        socket
        ...