## http://automationpractice.com and https://restcountries.eu

You will need the following technologies available to try it out:
* Git
* Maven 3+
* JDK 8
* IDE of your choice 
* Web browser Chrome

### Ho w to run

```mvn clean test```

- [x] ability to run tests for different browsers/os by configuring;
- [x] ability to run tests for different environments(urls) by configuring/by command-line.

```mvn clean test -Denv=prod -Dbrowser=firefox``` 

### Generate Allure report 

```mvn allure:report```

### Open Allure report in browser

```mvn allure:serve```


![](https://a.radikal.ru/a00/1908/cc/7e6891bc9b17.png)

![](https://a.radikal.ru/a10/1908/61/fd7bfe61b8e9.png)

![](https://b.radikal.ru/b14/1908/04/cdd70d76a80c.png)



