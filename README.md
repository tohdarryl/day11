## Workshop 11

1. Compile maven project
```
mvn compile
```

2. Package maven project
```
mvn package
```

3. Clean up the maven project
```
mvn clean
```

4. Run maven
```
mvn spring-boot:run
```

5. Login on railway
```
railway login
```

6. Init your project to enable railway
```
railway init
```

7. Change jdk version uner the pom.xml 
```
	<properties>
		<java.version>11</java.version>
	</properties>
```

8. Push to railway
```
railway up
```

9. Generate railway domain
``` 
Go to settings and click 'Generate Domain'
```

10. SpringBoot port config
```
mvn spring-boot:run -Dspring.boot.run.arguments=--port=8085
```

11. Setting env var port value
```
export APP_PORT=8090 (OS)
set APP_PORT=8090 (windows)
```

