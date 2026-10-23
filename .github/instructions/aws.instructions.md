---
applyTo: "**/*.java,**/*.tf,**/*.yaml,**/*.yml,**/Dockerfile"
---
# AWS rules
Choose AWS services based on explicit requirements and the project's deployed architecture, not a fixed service list. Apply IAM least privilege, private networking where appropriate, encryption, secret rotation, idempotency, quotas, throttling, cost controls, tracing, and deployment rollback. Prefer task/role credentials over static keys. Validate ECS/Lambda execution model and shutdown semantics when relevant.
