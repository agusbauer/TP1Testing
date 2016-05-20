#!/bin/bash

if [ "$1" = "-h" ] ; then
	echo 'Correct usage: ./mujava.sh   <path to binary java files> <path to java source files> <path to property file>' 
	echo 'Example: ./mujava.sh  ./mujava/example/MyLinkedList/ ./mujava/example/MyLinkedList/  ./mujava/properties/default.properties'	
	echo '*** To see available operators:  ./mujava.sh -o'
	echo '*** A property file example provide in properties folder'
	exit 0;
fi 

if [ "$1" = "-o" ] ; then
	java -cp ./mujava/mujava.jar:$1:$2:./mujava/lib/junit-4.12.jar:./mujava/lib/org.hamcrest.core_1.3.0.v201303031735.jar:./mujava/lib/commons-configuration-1.10.jar:./mujava/lib/commons-lang-2.6.jar:./mujava/lib/commons-logging-1.1.1.jar:./mujava/lib/commons-cli-1.3.1.jar:./mujava/lib/guava-16.0.1.jar:./mujava/lib/javassist.jar:./mujava/lib/reflections-0.9.9-RC1.jar:./mujava/lib/dependencyAnalizer.jar:./mujava/lib/reflections-0.9.9-RC1-javadoc.jar:./mujava/lib/commons-lang-2.6-javadoc.jar:./mujava/lib/commons-configuration-1.10-javadoc.jar:./mujava/lib/asm-all-5.0.3.jar mujava.app.Main -o
	exit 0;
fi 

if [ "$#" -lt "3" ] ; then 
		echo "Incorrect usage!" 
		echo 'Correct usage: ./mujava_runner.sh   <path to binary java files> <path to java source files> <path to property file>' 
		echo 'Example: ./mujava.sh  ./mujava/example/MyLinkedList/ ./mujava/example/MyLinkedList/  ./mujava/properties/default.properties'	
		echo 'Help: ./mujava.sh -h '
		exit 1 
fi 
java -cp ./mujava/mujava.jar:$1:$2:./mujava/lib/junit-4.12.jar:./mujava/lib/hamcrest-all-1.3.jar:./mujava/lib/commons-configuration-1.10.jar:./mujava/lib/commons-lang-2.6.jar:./mujava/lib/commons-logging-1.1.1.jar:./mujava/lib/commons-cli-1.3.1.jar:./mujava/lib/guava-16.0.1.jar:./mujava/lib/javassist.jar:./mujava/lib/reflections-0.9.9-RC1.jar:./mujava/lib/dependencyAnalizer.jar:./mujava/lib/reflections-0.9.9-RC1-javadoc.jar:./mujava/lib/commons-lang-2.6-javadoc.jar:./mujava/lib/commons-configuration-1.10-javadoc.jar:./mujava/lib/asm-all-5.0.3.jar mujava.app.Main -p $3 







