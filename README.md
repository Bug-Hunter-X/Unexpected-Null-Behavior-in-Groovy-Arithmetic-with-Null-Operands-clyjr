# Groovy Null Arithmetic Bug

This repository demonstrates an unexpected behavior in Groovy when performing arithmetic operations with null values.  The `myMethod` function aims to return the non-null operand or the sum of operands if both are present. However, when both operands are null, it unexpectedly returns null instead of a more sensible default (like 0).

## Bug Description

The issue arises from Groovy's implicit type handling and how it treats null values in arithmetic expressions.  When both `a` and `b` are null, the `a + b` operation does not resolve to a numerical 0.  This leads to null propagation.

## Solution

A solution is provided in `bugSolution.groovy` which explicitly handles the case of both inputs being null by returning 0.