(set-env!
 :source-paths #{"src" "content"}
 :dependencies '[[org.clojure/clojure "1.8.0"]
                 [rum "0.9.0"]
                 [perun "0.3.0" :scope "test"]])

(require '[io.perun :refer :all])

(deftask gen-static
  []
  (comp (markdown)
        (render :renderer 'perun-rum.core/page)))
