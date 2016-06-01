# Perun + Rum
This reproduces a problem of a missing sablono/compiler.clj file.

## Reproduction
Run `boot gen-static` on a terminal. A recent version of Boot2 needs to be installed.

The same command on the branch fix error works. That branch has an extra file `src/sablono/compiler.clj` with the following content:
```clj
(ns sablono.compiler)

(defn compile-html
      [& content]
            (first content))
```
