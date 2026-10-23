---
name: spring-data-jpa
description: 'Design or change Spring Data JPA entities, repositories, transactions, queries, pagination, and persistence tests.'
---

# Spring Data JPA skill

## Procedure
1. Inspect schema/migrations, naming conventions, existing entities, and repository methods.
2. Model identifiers, nullability, relationships, fetch strategies, and constraints explicitly.
3. Implement repositories with derived methods or parameterized JPQL/native queries as justified.
4. Place transactions at service boundaries; avoid N+1 queries using deliberate fetch plans.
5. Consider optimistic locking, indexes, pagination, and migration impact.
6. Add repository tests and migration changes only when required; ask before destructive schema operations.

## Guardrails
- Never concatenate untrusted SQL/JPQL input.
- Do not use EAGER fetching as a blanket fix or expose entities through REST.
