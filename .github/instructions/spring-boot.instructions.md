---
applyTo: "**/*.java,**/application*.yml,**/application*.yaml,**/application*.properties"
---
# Spring Boot rules
Use Spring Boot 4.1.1 conventions supported by the actual effective POM. Favor constructor injection, configuration properties validation, centralized exception translation, bean validation, appropriate security filters, clear transaction demarcation, no self-invocation assumptions for proxied behavior, and no blocking work on unsuitable threads. Distinguish framework auto-configuration from application configuration. Never assume specific starter or package names without checking installed dependencies. Include graceful shutdown, Actuator/readiness, metrics and structured logs where applicable.
