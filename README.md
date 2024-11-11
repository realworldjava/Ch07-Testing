# Chapter 7: Testing Your Code with Automated Testing Tools

This repository contains the code from the book for Chapter 7, Testing Your Code with Automated Testing Tools. See the [main book page](https://github.com/realworldjava) for the list of all chapter specific repositories.

# How this repository is organized

In this repository, all code is in the main branch. There are two folders: 
| Folder Name  | Contents |
| ------------- | ------------- |
| junit5-examples | for JUnit 5 itself and the mocking libraries|
| junit5-maven | shows how to run JUnit 5 with Maven|
| junit5-spring-boot | shows the Spring Mock MVC example|
| junit5-gradle-groovy |shows how to run JUnit 5 with Gradle using Groovy|
| junit5-gradle-kotlin | shows how to run JUnit 5 with Gradle using Kotlin|
| junit5-jacoco-maven | shows how to run Jacoco with Maven|
| junit5-jacoco-gradle-groovy | shows how to run Jacoco with Gradle using Groovy|
| junit5-jacoco-gradle-kotlin -|shows how to run Jacoco with Gradle using Kotlin|

# How to run the examples in this chapter
If you want to use an IDE, import the directory you want as a Maven project so you have the proper dependencies.

If you want to use the command line, cd to the directory for that example and run the command for the relevant buld tooL:
```
mvn verify
./gradlew build
```

# Clickable Links from the Further References Section

* [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user‐guide)
* [Sample projects by build tool](https://github.com/junit‐team/junit5‐samples)
* [AssertJ documentation](https://assertj.github.io/doc)
* [AssertJ Assertion Javadoc](https://www.javadoc.io/doc/org.assertj/assertj‐core/latest/org/assertj/core/api/Assertions.html)
* [Variety of ways to use Soft Assertions without calling assertAll()](https://www.selikoff.net/2024/03/23/multiple‐ways‐of‐using‐soft‐assertsin‐junit‐5)
* [JUnit Pioneer documentation](https://junit‐pioneer.org/docs)
* [Mockito documentation](https://javadoc.io/doc/org.mockito/mockito‐core/latest/org/mockito/Mockito.html)
* [EasyMock documentation](https://easymock.org/user‐guide.html)
* [Spring MockMvc documentation](https://docs.spring.io/spring‐framework/reference/testing/spring‐mvc‐test‐framework.html)
* [JaCoCo documentation](https://www.eclemma.org/userdoc/index.html)
* [Clover documentation](https://openclover.org/documentation)
* [Pact Documentation](https://docs.pact.io)
* [Spring](https://spring.io/projects/spring‐cloud‐contract)
