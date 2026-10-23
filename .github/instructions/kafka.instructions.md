---
applyTo: "**/*Kafka*.java,**/*Consumer*.java,**/*Producer*.java,**/*Event*.java,**/application*.yml,**/application*.yaml"
---
# Kafka rules
Define key/partitioning strategy, schema compatibility, ordering expectations, consumer-group semantics, offset acknowledgment and error handling. Design consumers for at-least-once delivery and duplicate events; use idempotency and outbox/inbox where needed. Bound retries, provide dead-letter handling and observability, and avoid non-atomic database-write plus publish workflows. Consider rebalances, poison messages, retention and replay safety.
