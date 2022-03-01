The primary point of this project is to inform some design decisions for ZIO Test 2.0

Desirable Output Traits:
  - Speed
  - Ordered
  - Unambiguous
  - SimpleImpl

Approaches

  1. As soon as suite is done render its output
    + Simplest of all
    - Creates interleaved output
             
  2A. Only one Spec can write at a time
    + Supports truly incremental result rendering
    + suites will continue to be appropriately grouped
    - suites can appear out of order
    - tests can appear out of order within a suite

  2B. Full Spec output is printed when done
    + tests appear in order
    - suites still don’t necesarily appear in order
    - not truly streaming in sense that suite not rendered until done

  3. Results must appear in order and should appear as soon as possible
    + Results appear in order
    - “Fast” tests later have to wait for “slower” tests at beginning
    - Can’t do colored output for suites (don’t know yet when you start if they are successful or not)