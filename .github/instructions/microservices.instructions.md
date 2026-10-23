---
applyTo: "**/*.java,**/*.yml,**/*.yaml"
---
# Microservice architecture rules
Preserve bounded contexts and ownership; prefer explicit API/event contracts and backward-compatible evolution. Plan failure modes: deadlines, bounded retries with jitter, idempotency, bulkheads, circuit breakers and DLQs as needed. Avoid synchronous dependency chains and distributed ACID assumptions. Document consistency model, saga/compensation if needed, tracing and operational readiness. Choose layered or hexagonal organization according to the existing codebase.
