# Spark streaming from tcp socket 

## Step 1
created the wordcount.scala file created.

## Step 2
Created the directory structure Application>src>main>scala

--"application" it is the main folder which hold every file of the project so it can be anything rest dir structure should always be same

## Step 3
Put the wordcount.scala file into the scala folder 

## Step 4
create build.sbt file in application folder in application you will find both src folder and build.sbt file 

## Step 5 : Building the project
open terminal and change dir to application and run this command "sbt -v package"

now you can find two more folder created in your application folder one is project and second is target

## Step 6 : execute the project
Run this command to run the project 

------------------------------------

spark-submit --class "wordcount" --master local[2] target/scala-2.10/wordcount_2.10-1.0.jar

## Step 7 : feed in the lines
open a new terminal and run below command then  feed it with lines

-------------------------------------
nc -lk 9999





