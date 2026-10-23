---
name: spring-security
description: 'Implement or review Spring Security authentication, authorization, endpoint protection, and security tests.'
---

# Spring Security skill

## Procedure
1. Identify the existing authentication mechanism (session, OAuth2, JWT resource server, etc.).
2. Preserve framework version compatibility and existing security configuration.
3. Apply deny-by-default authorization, least privilege, and method security where justified.
4. Validate token claims using trusted framework components; do not implement custom cryptography.
5. Review CSRF and CORS based on actual client and authentication model.
6. Test anonymous, authenticated, unauthorized, and forbidden behavior.

## Guardrails
- Never disable CSRF globally without a documented reason.
- Never log tokens, passwords, or sensitive identity claims.
- Do not invent security credentials or hardcode secrets.
