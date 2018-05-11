# ServiceInnovation
\
##在自己的文件夹下创建.java文件或.xml文件时，如果文件夹下有.ignore文件，先把.ignore文件先删除，再创建！！！如java文件下的Mine文件夹下的activity文件夹下有一个.ignore文件，则先把.ignore文件先删除，在创建activity文件。##\
\
一、java文件\
  1、按模块功能分类，共四个模块(四个文件夹)：Homepage,Forum,Project,Mine(Main文件夹存放MainActivity相关文件，不要在此编辑)；其中，每个文件夹下分activity,adapter,fragment,utils四个文件夹。\
  2、自己创建哪个功能模块的什么类型的.java文件就放在相应的文件夹下。（utils文件夹存放工具类）\
  3、如确有需要新建文件夹，也可新建（不建议）\
  4、.java文件命名无具体要求，不重名即可。最好前缀加上模块名。如重名：Back.java与Back.java重名，则命名为HomepageBack.java,ForumBack.java.\
  \
二、图片资源\
  1、drawable文件夹下只存放.xml文件。\
  2、drawable.xhdpi,drawable.xxhdpi文件下存放图片文件。\
  3、对于图标（UI提供，包含drawable.xhdpi,drawable.xxhdpi两种分辨率的图标），drawable.xhdpi,drawable.xxhdpi文件夹下都要存放。\
  4、drawable.xhdpi,drawable.xxhdpi两个文件夹下的同一个图标用相同的名字命名。\
  5、对于测试用图片，用一张图片，并存放在drawable.xxhdpi文件夹下即可。\
  6、命名：为防止重名，前缀统一加上模块名。如：homepage_employ.png,mine_pic.png.\
  \
三、layout文件\
  1、同java文件，在自己相应的文件夹下创建并编辑。\
  2、命名：同图片资源命名，前缀统一加上模块名。\
  3、控件命名：同图片资源命名，前缀统一加上模块名。如mine_message,mine_data.\
  \
  ###################################################################\
  SharedPreferences:\
  1、获取SharedPrefences对象api:public SharedPreferencesUtil(Context context)\
    例：sharedPreferencesUtil = new SharedPreferencesUtil(HomepageSearch.this);\
  2、存储对象：\
    /*\
    putObject 存储对象\
    @params object 要存储的对象\
    @params key 对象的键值\
     */\
    public boolean putObject(Object object, String key)\
    获取对象：public Object getObject(String key)\
  3、存储图片资源：\
  /*\
    putBitmap 存储图片\
    @params bitmap 要存储的图片对象\
    @params key 图片对象的key值\
    @return true保存成功，false失败\
     */\
    public boolean putBitmap(Bitmap bitmap, String key)\
    获取：public Bitmap getBitmap(String key)\
  其它详见SharedPreferences类\
  \
  如何查看保存的数据：\
    使用adb工具:\
      adb shell  打开终端（注意：此时要一直运行应用）\
      run-as <包名>(如com.example.skyworthclub.serviceinnovation是我的包名)\
      ls 查看当前目录下所有文件以及文件夹\
      cd shared_prefs 进入到此目录下\
      cat com.example.skyworthclub.serviceinnovation_preferences.xml 查看该文件内容,即你保存的数据\
      ps:adb工具很常用，建议配全局变量\
     \
  LimitQueue为队列类（有需要可使用）：\
  @params limit为队列的固定长度\
