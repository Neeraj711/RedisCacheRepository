# RedisCacheRepository
Spring Boot Redis Caching with PostgreSQL
This is a simple Spring Boot project that demonstrates how to integrate Redis caching with PostgreSQL using Spring Cache abstraction.

🧰 Tech Stack
Spring Boot

Spring Data JPA

PostgreSQL

Redis (Lettuce)

Spring Cache

📦 Features
✅ Connects to PostgreSQL for persistent storage.

⚡ Uses Redis as an in-memory cache layer to reduce database hits.

🧠 @Cacheable, @CacheEvict, and @CachePut annotations to manage cache easily.

📖 REST API to test caching operations.

📁 Project Structure
src/
├── main/
│   ├── java/
│   │   └── com/example/demo/
│   │       ├── controller/
│   │       ├── entity/
│   │       ├── repository/
│   │       └── service/
│   └── resources/
│       └── application.properties
