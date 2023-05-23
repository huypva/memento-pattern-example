The example project for Memento Pattern

<div align="center">
    <img src="./assets/images/hello_world.png"/>
</div>

## Prerequisites
Make sure following software is installed on your PC
- [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17) or later

## Project structure
```
.
├── memento-pattern
│   ├── pom.xml
│   ...
├── pom.xml
|
└── README.md
```

## Start project

```shell
$ ./mvnw clean package
$ java -jar ./memento-pattern/target/memento-pattern-0.0.1-SNAPSHOT.jar
06:09:02.223 [main] INFO io.github.huypva.mementopattern.Main -- State: 1
06:09:02.225 [main] INFO io.github.huypva.mementopattern.Main -- State: 2
06:09:02.225 [main] INFO io.github.huypva.mementopattern.Main -- State after restore: 1
```

## Contribute
The code is open sourced. I encourage fellow developers to contribute and help improve it!

- Fork it
- Create your feature branch (git checkout -b new-feature)
- Ensure all tests are passing
- Commit your changes (git commit -am 'Add some feature')
- Push to the branch (git push origin my-new-feature)
- Create new Pull Request

## Reference
- https://en.wikipedia.org/wiki/Memento_pattern
- https://refactoring.guru/design-patterns/memento