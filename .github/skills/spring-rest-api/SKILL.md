---
name: spring-rest-api
description: 'Implement or modify Spring Boot REST endpoints, DTOs, request validation, HTTP error handling, and API tests.'
---

# Spring REST API skill

## Procedure
1. Inspect existing API conventions, route versioning, security, and DTOs.
2. Define request/response contracts and HTTP status behavior.
3. Implement thin controller, service logic, and mapping without exposing JPA entities.
4. Add Jakarta validation and consistent exception mapping (ProblemDetail where appropriate).
5. Preserve pagination, idempotency, and authorization semantics when relevant.
6. Add MockMvc/controller tests for success, invalid input, not found, and unauthorized access as applicable.
7. Run targeted tests and report results accurately.

## Checklist
- Correct status codes, location headers for creation where applicable, no internal exception leakage.
- No secrets/PII in logs or errors; avoid returning stack traces.
