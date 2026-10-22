---
applyTo: "src/main/**/*.java"
---

# Spring Boot conventions
- Follow the repository's Spring Boot version and its supported APIs.
- Use constructor injection; keep controllers thin and services cohesive.
- Validate requests using Jakarta Validation; use @RestControllerAdvice and ProblemDetail when consistent with existing APIs.
- Use explicit DTO mappings; avoid exposing entities directly.
- Keep @Transactional on service operations that need it, with deliberate read-only semantics.
- Externalize configuration through @ConfigurationProperties when useful; validate required properties.
- Use SLF4J structured/contextual logging without exposing sensitive data.
- Use Actuator health/metrics if already configured; do not expose sensitive endpoints publicly.
