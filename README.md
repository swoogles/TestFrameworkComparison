The primary point of this project is to inform some design decisions for ZIO Test 2.0

Desirable Output Traits:
  - Speed
  - Ordered
  - Unambiguous
  - SimpleImpl

Approaches

  1. As soon as suite is done render its output
     - Pros
       - Simplest of all
     - Cons
       - Creates interleaved output
             
  1. Only one Spec can write at a time
     - Pros
       - Supports truly incremental result rendering
       - suites will continue to be appropriately grouped
     - Cons
       - suites can appear out of order
       - tests can appear out of order within a suite
       - If the blocked tests get write permission, you won't see the quick tests that are executing in parallel

  1. Full Spec output is printed when done
     - Pros
       - tests appear in order
     - Cons
       - suites still don’t necesarily appear in order
       - not truly streaming in sense that suite not rendered until done

  1. Results must appear in order and should appear as soon as possible
     - Pros
       - Results appear in order
     - Cons
       - "Fast" tests later have to wait for "slower" tests at beginning
       - No colored output for suites (Don't know if suite is successful until everything inside is finished)


## Alternative Approaches

| Behavior          | ScalaTest   | Specs2      | uTest                       | mUnit             |
|-------------------|-------------|-------------|-----------------------------|-------------------|
| Parallel Behavior | Interleaved | Interleaved | Fully-qualified interleaved | Grouped Correctly |
