---
applyTo: "src/test/**/*.java"
---

# Testing conventions
- Use the project's JUnit Jupiter, Mockito, Spring Test, and assertion libraries.
- Test observable behavior, boundary conditions, validation failures, and error paths.
- Prefer plain unit tests for business logic; use slice tests for MVC/persistence boundaries.
- Use @SpringBootTest only when integration across components is necessary.
- Avoid brittle sleeps, global mutable test state, and excessive mocking of value objects.
- Make tests deterministic and independent; use test containers only if already supported or approved.
