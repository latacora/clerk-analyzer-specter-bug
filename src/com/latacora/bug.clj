(ns com.latacora.bug
  (:require
   [com.rpl.specter :as sr]
   [nextjournal.clerk :as clerk]))

;; # Reproducer

;; The clerk analyzer gets confused by specter's caching behavior. Here's an example error:

;; ```
;; Unhandled clojure.lang.ExceptionInfo
;; Hash is missing on dependency 'whatever/pathcache1234' of the form '(defn f [x] (sr/select [...])) 'in foo.bar.baz
;; ```

(defn sample-specter-fn
  [x]
  (sr/select [sr/ALL] x))
