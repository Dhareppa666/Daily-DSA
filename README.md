# Daily-DSA

A comprehensive collection of Data Structures, Algorithms, and Design Patterns implemented in Java. This repository serves as both a learning resource and a reference implementation for common computer science concepts.

## 📋 Table of Contents
- [Project Structure](#-project-structure)
- [Features](#-features)
- [Getting Started](#-getting-started)
- [Key Components](#key-components)
  - [Data Structures](#data-structures)
  - [Algorithms](#algorithms)
  - [Design Patterns](#design-patterns)
  - [Concurrency](#concurrency)
  - [Java Features](#java-features)
- [Usage Examples](#-usage-examples)
- [Contributing](#-contributing)
- [License](#-license)

## 🏗️ Project Structure

```
src/main/
├── finale/
│   └── Java/
│       ├── Collections_In_Java/    # Core Java Collections implementations
│       ├── Garbage_Collection/     # Memory management examples
│       ├── Generics/               # Generic programming examples
│       ├── QuadTrees/              # Spatial partitioning data structure
│       ├── file_handling/          # File I/O operations
│       ├── jdbc_connection/        # Database connectivity examples
│       ├── lambda/                 # Java 8+ Lambda expressions
│       ├── multi_threading/        # Concurrent programming
│       ├── oops/                   # Object-Oriented Programming concepts
│       └── streams/                # Java Streams API examples
└── System_Design_Resources_Not_Mine/
    └── LLD_Repos/                  # Low-Level Design examples and patterns
```

## ✨ Features

- **Comprehensive Data Structures**: Implementations of common and advanced data structures
- **Algorithms**: Well-documented algorithm solutions with time/space complexity analysis
- **Design Patterns**: Implementation of Gang of Four (GoF) design patterns
- **Concurrent Programming**: Multi-threading and thread pool examples
- **Modern Java**: Examples of Java 8+ features like Streams, Lambdas, and more
- **Practical Examples**: Real-world use cases and applications

## 🚀 Getting Started

### Prerequisites
- Java JDK 11 or higher
- Maven (for dependency management)
- Git (for version control)

### Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/Daily-DSA.git
   cd Daily-DSA
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

## Key Components

### Data Structures
- **Collections Framework**: Custom implementations of List, Set, Map, and Queue
- **Spatial Indexing**: QuadTree for efficient 2D spatial queries
- **Custom Data Structures**: Specialized data structures for specific use cases

### Algorithms
- Sorting and Searching
- Graph Algorithms
- Dynamic Programming
- Divide and Conquer
- Greedy Algorithms

### Design Patterns
- **Creational**: Singleton, Factory, Builder, Prototype, Abstract Factory
- **Structural**: Adapter, Bridge, Composite, Decorator, Facade, Proxy
- **Behavioral**: Chain of Responsibility, Command, Iterator, Observer, State, Strategy, Template Method

### Concurrency
- Thread Management
- Thread Pools
- Synchronization
- Concurrent Collections

### Java Features
- Lambda Expressions
- Streams API
- Optional
- New Date/Time API
- Modules

## 🛠 Usage Examples

### QuadTree Example
```java
// Create a QuadTree covering a 2000x2000 area
QuadTree.Boundary boundary = new QuadTree.Boundary(0, 0, 2000, 2000);
QuadTree<Driver> driverQuadTree = new QuadTree<>(boundary, 4);

// Add drivers
for (int i = 0; i < 100; i++) {
    driverQuadTree.insert(new Driver(
        ThreadLocalRandom.current().nextInt(-1000, 1000),
        ThreadLocalRandom.current().nextInt(-1000, 1000),
        "Driver" + i
    ));
}

// Find all drivers within 150 units of (0,0)
List<Driver> nearbyDrivers = driverQuadTree.queryRadius(0, 0, 150);
```

## 🤝 Contributing

Contributions are what make the open-source community an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

Distributed under the MIT License. See `LICENSE` for more information.

## 📧 Contact

Your Name - [@your_twitter](https://twitter.com/your_username) - your.email@example.com

Project Link: [https://github.com/yourusername/Daily-DSA](https://github.com/yourusername/Daily-DSA)

## 🙏 Acknowledgments

- [GeeksforGeeks](https://www.geeksforgeeks.org/)
- [LeetCode](https://leetcode.com/)
- [Design Patterns - Gang of Four](https://en.wikipedia.org/wiki/Design_Patterns)
- [Java Documentation](https://docs.oracle.com/en/java/)
