# FizzBuzz
* d44d84d00450bb2591af4d151e70fc1bcc7796eb

As to make it a bit more interesting problem instead of refactoring the existing
FizzBuzz class I'm instead creating the new FizzBuzzStep2 class.

## Setup
`sbt run`

## Tests
`sbt test`

## Development

### Lint
* Any compile will trigger wartremover
* src
`sbt scalastyle`
* tests
`sbt test:scalastyle`

### Guard
`sbt  ~testQuick`

### Code Coverage
`sbt clean coverage test coverageReport`

### Package
`sbt assembly`
