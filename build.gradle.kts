// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {repositories {
    maven(url ="https://maven.aliyun.com/repository/google")
    maven(url ="https://maven.aliyun.com/repository/gradle-plugin")
    maven(url ="https://maven.aliyun.com/repository/jcenter")
    google()
    jcenter()}
    dependencies {
        classpath ("com.android.tools.build:gradle:7.1.2")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files}
    }}
plugins {
    id("com.android.application") version "8.1.2" apply false
}