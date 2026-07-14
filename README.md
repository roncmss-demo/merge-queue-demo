# merge-queue-demo

A minimal Java + Maven project for learning how **GitHub merge queue** works.

## What's here
- `Calculator` — a trivial class with an `add` method.
- `CalculatorTest` — a JUnit 5 test (the check the merge queue gates on).
- `.github/workflows/ci.yml` — CI that runs `mvn -B test` on both `pull_request`
  and `merge_group` events. The `merge_group` trigger is what lets the merge
  queue run its required checks.

## Merge queue in one paragraph
When you click **Merge when ready** on a PR, GitHub adds it to a queue instead of
merging immediately. It builds a temporary ref = `main` + the queued PRs stacked in
order, runs CI against that combined ref (the `merge_group` event), and only
fast-forwards `main` if checks pass. If a PR fails, it's dropped and the rest are
re-tested. This stops "each PR passed alone but together they break `main`."

## Availability note
Merge queue is available only on **Organization-owned** repositories. A **public**
repo in a **free** organization qualifies at no cost. Private repos require GitHub
Enterprise Cloud. Repos under a personal account are not eligible.

## Run tests locally (optional)
```
mvn -B test
```
