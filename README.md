# This project is a class that i learned on Jike Course.
I typed code while watching lessons.
In this process,i faced with a problem about file-encoding.After scanning many blogs,i tried to modify
some codes.change the dictroniary to Android-GradleScrips-build.gradle(Module:app),i add some code.
android {
    compileSdkVersion 19
    buildToolsVersion "20.0.0"
    android{compileOptions.encoding="GBK"}
    tasks.withType(JavaCompile){
    options.encoding="UTF-8";
}
refactor is also a very important part.
