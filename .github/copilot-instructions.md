# Repository-wide engineering policy

Target Java 25, Spring Boot 4.1.1, Maven, Kafka, PostgreSQL/MySQL, and AWS services selected from actual requirements. Verify dependencies, APIs and compatibility against the project's effective POM and available documentation; never invent library APIs.

## Architecture and principles
- Preserve the existing architectural style: layered Controller-Service-Repository or Clean/Hexagonal. Do not introduce a wholesale redesign without request.
- Apply SOLID, DRY, KISS, YAGNI, separation of concerns, composition over inheritance, encapsulation, fail-fast validation, least privilege, and the principle of least astonishment.
- Use design patterns only when they solve a real problem; document tradeoffs. Keep bounded contexts and service ownership clear; avoid distributed monoliths and shared mutable databases.
- Favor constructor injection, explicit dependencies, immutable DTOs/records where appropriate, validated inputs, and clear API contracts. Keep controllers thin and business rules in appropriate application/domain layers.
- Specify transaction boundaries; avoid remote calls inside database transactions. Use outbox/inbox, idempotency and retry/DLQ patterns when Kafka delivery requirements demand them; do not promise exactly-once business effects from Kafka alone.
- Enforce bounded timeouts, retry budgets with jitter, circuit breaking where appropriate, graceful shutdown, backpressure, and concurrency safety.
- Follow secure-by-default practices: authn/authz, input validation, safe SQL, secrets via approved AWS secret stores, encryption, redaction of PII, and no credentials in logs or commits.
- Provide structured logs, trace/correlation IDs, metrics, health/readiness probes, meaningful errors and actionable alerts.
- Design safe SQL migrations, indexes from query patterns, pagination, optimistic locking where needed, and connection pool limits. Use Flyway/Liquibase only if adopted by the project.
- Use Maven conventions and reproducible builds; avoid dependency upgrades without justification.
- Write JUnit 5, Mockito, Testcontainers, and integration tests appropriate to behavior. Test unhappy paths, edge cases, authorization, retries, concurrency and transactional semantics. Follow project test conventions.
- Never claim a test, build, deployment, or command succeeded unless actually executed and verified. Explicitly report skipped checks.
