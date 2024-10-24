# Steps 
1. Set connection data in `pom.xml`
2. Run command in terminal:
```shell
mvn -f <pom-....xml> liquibase:generateChangeLog -Dliquibase:generateChangeLog
```