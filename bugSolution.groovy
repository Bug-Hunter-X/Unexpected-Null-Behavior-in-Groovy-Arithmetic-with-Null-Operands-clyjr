```groovy
def myMethod(a, b) {
  if (a == null && b == null) {
    return 0
  } else if (a == null) {
    return b
  } else if (b == null) {
    return a
  } else {
    return a + b
  }
}

println myMethod(null, 5) // Output: 5
println myMethod(10, null) // Output: 10
println myMethod(null, null) // Output: 0
```