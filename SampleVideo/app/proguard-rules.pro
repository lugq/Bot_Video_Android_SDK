-ignorewarnings
-optimizationpasses 5
-dontusemixedcaseclassnames
-dontskipnonpubliclibraryclasses
-dontpreverify
-verbose
-optimizations !code/simplification/arithmetic,!field/*,!class/merging/*

-keep public class * extends android.app.Activity
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class * extends android.app.Application

-keep public class * extends android.support.v4.app.Fragment
-keep public class * extends android.app.Fragment

-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

-keep public class * extends android.view.View {
    public <init>(android.content.Context);
    public <init>(android.content.Context, android.util.AttributeSet);
    public <init>(android.content.Context, android.util.AttributeSet, int);
    public void set*(...);
}
-keepclasseswithmembers class * {
    public <init>(android.content.Context, android.util.AttributeSet);
}
-keepclasseswithmembers class * {
    public <init>(android.content.Context, android.util.AttributeSet, int);
}

-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

-keep class ai.botbrain.ttcloud.sdk.model.** { *; }

-keep class ai.botbrain.ttcloud.api.**{*;}
-keep class ai.botbrain.ttcloud.sdk.callback.**{*;}

-dontwarn okhttp3.**
#okhttputils
-dontwarn com.zhy.http.**
-keep class com.zhy.http.**{*;}
#okhttp
-dontwarn okhttp3.**
-keep class okhttp3.**{*;}
#okio
-dontwarn okio.**
-keep class okio.**{*;}

#eventBus
-keepattributes *Annotation*
-keepclassmembers class ** {
    @org.greenrobot.eventbus.Subscribe <methods>;
}
-keep enum org.greenrobot.eventbus.ThreadMode { *; }
-keepclassmembers class * extends org.greenrobot.eventbus.util.ThrowableFailureEvent {
    <init>(java.lang.Throwable);
}

-keep class com.youku.**{*;}
-keep class com.baidu.player.download.**{*;}
-keep class com.baseproject.**{*;}
-keep class com.decapi.**{*;}
-keep class com.kuteam.player.**{*;}
-keep class com.luajava.**{*;}
-keep public class com.youku.player.base.YoukuPlayerView
-keep interface  com.youku.player.base.YoukuPlayerView{
        public <fields>;
        public <methods>;
}
