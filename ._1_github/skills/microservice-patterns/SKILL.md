---
name: microservice-patterns
description: 'Design or implement resilient Spring Boot microservices with timeouts, retries, messaging, observability, and graceful shutdown.'
---

# Microservice patterns skill

## Procedure
1. Inspect existing HTTP clients, messaging infrastructure, deployment platform, and SLOs.
2. Define timeout budgets, failure modes, and retryability before adding resilience patterns.
3. Add bounded retries with backoff and jitter only for safe/idempotent operations.
4. Use bulkheads, circuit breakers, and rate limiting where justified by actual failure isolation needs.
5. Define idempotency and at-least-once delivery handling for messaging consumers.
6. Implement correlation IDs, useful metrics, health probes, and graceful shutdown consistent with deployment.
7. Test failures, timeouts, duplicate messages, and shutdown behavior when applicable.

## Guardrails
- Do not retry non-idempotent operations without an idempotency strategy.
- Do not make network calls inside database transactions without a deliberate design.
- Do not introduce new infrastructure without approval.
