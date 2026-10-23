---
applyTo: "**/*Repository*.java,**/*Entity*.java,**/*.sql,**/pom.xml"
---
# Database rules
Support PostgreSQL or MySQL as actually configured; never assume dialect equivalence. Validate indexing, query plans, N+1 fetches, pagination, transaction isolation, optimistic/pessimistic locking, migration rollback strategy and connection pools. Use parameterized queries and least-privilege credentials. Prefer backward-compatible expand/contract migrations for zero-downtime deployments.
