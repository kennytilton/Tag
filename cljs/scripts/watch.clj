(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'tiltontec.tag.core
   :output-to "out/tag.js"
   :output-dir "out"
   :verbose false})
