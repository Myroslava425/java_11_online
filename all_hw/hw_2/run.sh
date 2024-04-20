#!/bin/sh

echo Clear project
mvn clear
echo Start generation jar
mvn package
echo Run program
java -jar target/hw_2.jar