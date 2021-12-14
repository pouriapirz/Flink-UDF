# flink-udf
## How to generate UDF jar?
In order to generate artifact jar file, Run:

`mvn clean package`

**NOTE**: Flink dependencies listed in `pom.xml` have their scope set as `provided`. 
Therefore, once UDF is called in an application code, those dependencies should be provided at runtime.
