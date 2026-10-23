---
applyTo: "**/*.java"
---

# Java 25 conventions
- Write idiomatic Java 25 compatible with the project's compiler settings.
- Prefer records for immutable value carriers; use sealed hierarchies only where they simplify a closed domain model.
- Prefer clear control flow and standard collections; avoid unnecessary streams and abstractions.
- Use try-with-resources for owned AutoCloseable resources.
- Avoid shared mutable state; document concurrency assumptions.
- Treat virtual threads as a concurrency choice for blocking I/O, not as a substitute for backpressure.
- Do not rely on preview features without explicit project configuration and user approval.
