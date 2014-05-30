(defproject org.clojure/core.memoize "0.5.7-tccfix"
  :description "A memoization library for Clojure."
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.cache "0.6.3"]]
  :plugins [[lein-swank "1.4.4"]
            [lein-marginalia "0.7.1"]]
  :repositories {"sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"}
  :source-paths ["src/main/clojure"]
  :test-paths   ["src/test/clojure"]
  :parent [org.clojure/pom.contrib "0.1.2"])
