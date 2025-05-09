RANDOOP_JAR := ../randoop/randoop-all-4.3.3.jar
RANDOOP_PATH := ../randoop/

Generate_tests:
	java -classpath ${RANDOOP_JAR}:. randoop.main.Main gentests \
		--testclass=wrappers.ArrayListWrapper \
		--unchecked-exception=ERROR \
		--time-limit=60 \
		--no-error-revealing-tests=false \
		--no-regression-tests=true \
		--output-limit=100

Compile:
	javac -cp .:wrappers wrappers/ArrayListWrapper.java

Run_tests:
	javac -classpath .:../junit.jar RegressionTest0.java
	java -jar ../junit.jar -cp . -c RegressionTest0