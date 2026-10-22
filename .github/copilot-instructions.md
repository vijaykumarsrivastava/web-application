# Repository-wide Copilot instructions

- Target Java 25. Use the Spring Boot and dependency versions already defined in the build; do not invent upgrades.
- Inspect existing modules, packages, conventions, configuration, and tests before editing.
- Prefer small, focused changes and preserve backward compatibility unless asked otherwise.
- Use constructor injection, cohesive classes, clear naming, and composition over unnecessary inheritance.
- Use records for immutable API DTOs when appropriate; never expose persistence entities as API contracts.
- Validate external input with Jakarta Bean Validation; handle errors consistently without leaking internals.
- Do not log credentials, tokens, PII, or full sensitive request bodies. Never hardcode secrets.
- Use parameterized queries, least privilege, and authorization checks at appropriate boundaries.
- Keep transaction boundaries at the service layer; avoid remote network calls inside transactions.
- Add or update relevant JUnit 5 tests for changes. Verify compilation and tests when tools are available.
- Do not add libraries or configuration without explaining why; never claim tests passed unless executed.
