---
applyTo: "**/*.java"
---
# Java 25 coding rules
Prefer clear idiomatic Java 25, immutable data, records for simple value carriers, sealed types where they clarify a closed hierarchy, pattern matching when readable, and safe resource management with try-with-resources. Do not use preview features without explicit project configuration. Avoid shared mutable state, unnecessary allocations in hot paths, blocking calls on inappropriate executors, and premature optimization. Measure before tuning; document concurrency, exception and interruption semantics. Use meaningful names and cohesive small units. Apply SOLID, DRY, KISS, YAGNI and composition over inheritance.
