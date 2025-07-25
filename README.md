# Scala hello world

This is my take at a hello world in Scala. It prints a colored "Hello, World!" message to the console.

![](img.png)

## Usage
This project uses [sbt](https://www.scala-sbt.org/) as the build tool. To run the project, you can use the following command:

```bash
sbt run
```

## Requirements
- [Eclipse Temurin](https://adoptium.net/) or any other JDK 17+ installed on your system
- [sbt](https://www.scala-sbt.org/) for building and running the project
- [Scala](https://www.scala-lang.org/) installed on your system

## Dependencies
This project uses the following dependencies:
- [Fansi](https://github.com/com-lihaoyi/fansi) for colored output in the console.

## Linting and Formatting
Since I wanted to learn as most as I could by making this first project, I also setup [scalafmt](https://scalameta.org/scalafmt/) for code formatting and [scalafix](https://scalacenter.github.io/scalafix/) for code linting, not that they would be particularly useful in this context.
## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.