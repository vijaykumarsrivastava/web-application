---
name: unit-testing
description: 'Create or improve Java 25 JUnit 5, Mockito, Spring MVC, and integration tests for application behavior.'
---

# Testing skill

## Procedure
1. Identify observable contracts, dependencies, and edge cases.
2. Write focused JUnit Jupiter tests using arrange-act-assert.
3. Use Mockito only for external collaborators; verify meaningful interactions.
4. Include negative paths, invalid input, boundary cases, and concurrency behavior where relevant.
5. Prefer MockMvc for MVC behavior and repository slice tests for persistence.
6. Run relevant tests if execution is available; report exact failures and remaining gaps.

## Guardrails
- No arbitrary Thread.sleep or order-dependent tests.
- Do not chase coverage percentages at the expense of useful assertions.
