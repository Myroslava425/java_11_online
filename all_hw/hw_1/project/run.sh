#!/bin/sh

echo Start compilation
javac -d build/classes -sourcepath src/ src/ua/com/alevel/A.java
echo Finish compilation

echo Start programm
java -cp build/classes ua.com.alevel.A

echo Start compilation with lib
javac -d build/classes -sourcepath src/ -cp ./libs/commons-lang3-3.14.0.jar src/ua/com/alevel/A.java
echo Finish compilation with lib

echo Start programm with lib
java -cp build/classes/:./libs/commons-lang3-3.14.0.jar ua.com.alevel.A


echo Start build jar
cp -r libs/*.jar build/jar
jar -cfvm build/jar/test_lib.jar resources/MANIFEST.MF -C build/classes .
echo Finish build jar

echo Start programm
java -jar build/jar/test_lib.jar

