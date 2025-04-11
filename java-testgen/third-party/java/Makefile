RANDOOP_JAR := ../randoop/randoop-all-4.3.3.jar
RANDOOP_PATH := ../randoop/

Generate_tests:
	java -classpath ${RANDOOP_JAR}:. randoop.main.Main gentests \
		--classlist=classlist.txt \
		--time-limit=60 \
		--output-limit=100 \
		--specifications=ArrayList_Specs.json \

Compile:
	javac -cp .:classes classes/ArrayList.java